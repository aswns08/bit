var http = require('http');
http.createServer(function handler(req, res) {
    res.writeHead(200, 'ok', {'Content-Type': 'text/plain'});
    res.end('Hello World\n');
	console.log('okok');
}).listen(1337, '192.168.0.27');
console.log('Server running at http://127.0.0.1:1337/');

/*
요청 메서드
1. GET 요청
1) GET 요청 발생 예
- 웹 브라우저의 주소 창에 URL입력 후 엔터
- 화면에서 링크 클릭
- 입력폼의 값을 기본 메소드로 전송할 때
2) GET 요청에서 데이터 전송
-요청라인의 URL에 포함한다.
-예)
GET http://192.168.0.27:1337/?userid=%EC%98%A4%ED%98%B8%EB%9D%BC&pwd=1111 HTTP/1.1
Host: 192.168.0.27:1337
Connection: keep-alive
...

3) 특징
- 전송 데이터의 크기가 제한된다.
- MS IIS웹 서버 : 요청라인 + 헤더 = 16KB
- Apache 웹 서버 : 요청라인 + 헤더 = 8K
- URL에 포함 => 외부에 노출됨. => URL은 브라우저에서 기억해 둔다. => 보안에 위협.
- 			 => 전송할 수 있는 데이터는 문자열만 가능하다.
			 => Base-64와 같은 특별한 인코딩을 한다면 바이너리 데이터 전송 가능.
- * 바이너리 데이터 : 메모장과 같은 텍스트 Editor로 편집이 불가능한 데이터
- 간단한 데이터 전송할 때 적합. 예) 검색어, 게시물조회 등 
- URL에 데이터가 포함되기 때문에 
		=> URL과 데이터를 함께 묶어서 다른 사람에게 전달 할 수 있다.
		
// &마지막은 데이터의 끝을 나타내고 사이즈가 커서 get방식으로 보낼 수 없다. //

4) 데이터 전송 방식
GET URL?이름=값&값&이름=값.. HTTP/1.1
...


2. POST 요청
 1) POST 요청 발생 예
 - form의 값을 전송할 때. 단, method 속성이 'post'로 지정되어야 한다.
 
 2) 데이터 전송 방식
 POST http://192.168.0.27:1337/ HTTP/1.1
Host: 192.168.0.27:1337
Connection: keep-alive
Content-Length: 43
...
(엔터)

userid=%EC%98%A4%ED%98%B8%EB%9D%BC&pwd=1111

3)특징
- 대용량 데이터 전송 가능. 서버에서 크기를 제한하지 않는 한에서는
  무제한으로 데이터를 전송할 수 있다. => 게시물 등록, 로그인 등
- 데이터가 주소창에 보이지 않는다. => 외부에 쉽게 노출 되지 않는다.
 => 즐겨찾기에 URL과 함께 데이터를 저장할 수 없다.
- 멀티파트 인코딩 방식을 결합하면 바이너리 데이터 전송도 가능하다.

3. 파일 업로드
- post 방식으로 전송
- <form>의 enctype='multipart/form-data' 이다.
- 전송 예)
POST http://192.168.0.27:1337/ HTTP/1.1
Host: 192.168.0.27:1337
Connection: keep-alive
Content-Length: 52984
Cache-Control: max-age=0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*
Origin: null
User-Agent: Mozilla/5.0 (X11; Linux i686) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.120 Safari/537.36
Content-Type: multipart/form-data; boundary=----WebKitFormBoundary7iiq7h8C6c3v6FjM
Accept-Encoding: gzip,deflate
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4

------WebKitFormBoundary7iiq7h8C6c3v6FjM
Content-Disposition: form-data; name="username"

홍
------WebKitFormBoundary7iiq7h8C6c3v6FjM
Content-Disposition: form-data; name="age"

20
------WebKitFormBoundary7iiq7h8C6c3v6FjM
Content-Disposition: form-data; name="photo"; filename="img2.jpg"
Content-Type: image/jpeg

------WebKitFormBoundary7iiq7h8C6c3v6FjM--



 */
