/*
GET 요청과 POST 요청 구분하기
- request.method 프로퍼티의 값을 확인하라!
- 
 */
var http = require('http');
var url = require('url');


http.createServer(function handler(req, res) {
	
	if (req.method == 'GET') { 
		console.log('get 요청');
		// URL 정보를 분석하자 ! 
		// => 특히 파라미터값 query string은 분해해서 객체로 만들어라 ! 
		// query string 이란 ? = > url중에서 '?' 다음에 오는 데이터 !
		var obj = url.parse(req.url, true);
		console.log('URL: ', obj.href);
		console.log('경로: ', obj.pathname);
		console.log('경로외: ',obj.search);
		console.log('쿼리 스트링을 객체로 변환: ',obj.query);
	} else {
		console.log('post 요청');
	}
	res.end();
}).listen(1337, '127.0.0.1');
console.log('Server running at http://127.0.0.1:1337/');


