<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
바이너리 데이터를 서버에 보내려면, form의 enctype을 multipart/form-data으로 설정해야 한다.

멀티파트 형식의 요청 프로토콜 예)
Remote Address:[::1]:8080
Request URL:http://localhost:8080/web03/fileupload/upload.jsp
Request Method:POST
Status Code:200 OK
Request Headersview source
Accept:text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Accept-Encoding:gzip, deflate
Accept-Language:ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4
Cache-Control:max-age=0
Connection:keep-alive
Content-Length:161507
Content-Type:multipart/form-data; boundary=----WebKitFormBoundaryD9aWuDvWipzx4rj8
Cookie:JSESSIONID=81B9190C890B6AB456B070211B311D6A
Host:localhost:8080
Origin:http://localhost:8080
Referer:http://localhost:8080/web03/fileupload/form.jsp
User-Agent:Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.65 Safari/537.36
Request Payload
------WebKitFormBoundaryD9aWuDvWipzx4rj8
Content-Disposition: form-data; name="name>"

aa
------WebKitFormBoundaryD9aWuDvWipzx4rj8
Content-Disposition: form-data; name="age"

30
------WebKitFormBoundaryD9aWuDvWipzx4rj8
Content-Disposition: form-data; name="photo"; filename="a.jpg"
Content-Type: image/jpeg

여기에 바이너리 데이터가 있다.
멀티파트로 보낸 바이너리 데이터를 서버에서 받을땐 파싱해서 받아야 한다.
------WebKitFormBoundaryD9aWuDvWipzx4rj8--

 --%>
<form action="upload.jsp" method="post"
  enctype="multipart/form-data">
이름 : <input type="text" name="name"><br>
나이 : <input type="text" name="age"><br>
사진 : <input type="file" name="photo"><br>
<button>등록</button>
</form>
</body>
</html>