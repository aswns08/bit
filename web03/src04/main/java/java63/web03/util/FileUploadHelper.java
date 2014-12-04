package java63.web03.util;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploadHelper {

	public static Map<String,String> parse(HttpServletRequest request) throws Exception {

		// 1. 파일 관리자 준비(메모리, 임시폴더, FTP 서버) 준비
		// => 분석기가 분류한 데이터를 임시 디렉토리에 저장한다.
		// => 그리고 각 데이터를 객체 (FileItem)로 포장한다.
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// 2. 멀티파트 데이터 준비
		ServletFileUpload upload = new ServletFileUpload(factory);
		// 3. 데이터 분석
		List<FileItem> items = upload.parseRequest(request);
		// 4. 분석 결과 처리
		HashMap<String,String> paramMap = new HashMap<>();
		
		String fileuploadRealPath = null; 
		File file = null; 
		int startNo = (int)(Math.random() * 1000);
		String filename=null;

		ServletContext application = request.getServletContext();
		
		for (FileItem item : items) {
			if (item.isFormField()) { // 1) 일반 폼 데이터
				paramMap.put(item.getFieldName(), item.getString("UTF-8"));
			} else { // 2) 바이너리 데이터

				fileuploadRealPath = application.getRealPath("/fileupload");
				filename = System.currentTimeMillis()+ "_" +(++startNo);
				file = new File(fileuploadRealPath + "/" + filename);
				item.write(file);	
				
				paramMap.put(item.getFieldName(), filename);
			}
		}
		
		return paramMap;

	}
}
