package java63.servlets.test01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/* 한글 출력할 때 깨지는 문제 해결
 * 
 *  이유 : 
 *  ServletResponse가 준 출력 스트림은
 *  기본적으로 출력할 때 ISO-18859-1로 인코딩한다.
 *  => 한글은 ISO-8859-1 문자집합에 없기 때문에 ?로 대체하여 출력한다.
 *  
 *  해결책 : 
 *  ServletResponse로 부터 출력 스트림을 얻기 전에,
 *  출력할 내용의 타입과 문자 집합을 설정한다.
 *  => response.setContentType("text/plain;charset=UTF-8")
 *  => response.seetCharacterEncoding("UTF-8")
 *  
 *  => mine type 
 */

@WebServlet("/test01/Test02") // 현재 context 루트 (현재 웹어플리케이션.)
public class Test02 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
		// 방법1.
		// response.seetContentType("text/plain")
		// response.setCharacterEncoding("UTF-8");
		
		// 방법2.
		response.setContentType("text/plain;charset=UTF-8");
		// 1. ServletResponse 도구를 사용하여 출력 스트림을 준비한다.
		PrintWriter out = response.getWriter();
		
		// 2. 출력 스트림을 사용하여 웹 브라우저로 출력한다.
		out.println("아하~~ 안녕하세요? Hello, 봉쥬르~ ");
	}
}
