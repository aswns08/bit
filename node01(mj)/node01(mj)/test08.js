/*
- 
 */
var http = require('http');
// 1. URL 모듈을 가져온다
var url = require('url');
var result;

http.createServer(function handler(req, res) {
	// 클라이언트가 보낸 name 파라미터 값을 변수에 저장하라.
	// 2. URL 정보를 분석한다.
	var urlMap = url.parse(req.url, true);
	
	// 3. 쿼리 객체에서 파라미터 값을 추출한다.
	var v1 = urlMap.query.v1;
	var v2 = urlMap.query.v2;
	var op = urlMap.query.op;
	
    res.writeHead(200, 'ok', {'Content-Type': 'text/html;charset=UTF-8'});
    res.write('<html><head><title><test08></title></head>');
    res.write('<body>');
    
	if(op=='plus') {
		result = parseInt(v1)+parseInt(v2);
		res.write('<h1>'+v1+'+'+v2+'='+result+'</h1>');
	} else if(op=='minus') {
		result = parseInt(v1)-parseInt(v2);
		res.write('<h1>'+v1+'-'+v2+'='+result+'</h1>');
	} else if(op=='multiple') {
		result = parseInt(v1)*parseInt(v2);
		res.write('<h1>'+v1+'*'+v2+'='+result+'</h1>');
	} else if(op=='divide') {
		result = parseInt(v1)/parseInt(v2);
		res.write('<h1>'+v1+'/'+v2+'='+result+'</h1>');
	} else
	res.write('<h1>연산자가 없습니다.</h1>');
    	
    res.write('</body></html>');
    res.end();
	console.log('okok');
}).listen(1337, '127.0.0.1');
console.log('Server running at http://127.0.0.1:1337/');


