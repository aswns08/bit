/*
- GET 요청과 POST 요청 구분하기
- Request.method 프로퍼티의 값을 확인하라.
 */
var http = require('http');
var url = require('url');
var result;

http.createServer(function handler(req, res) {
	
	res.writeHead(200, 'ok', {'Content-Type': 'text/html;charset=UTF-8'});
    res.write('<html><head><title><test09></title></head>');
    res.write('<body>');
	
	if(req.method == 'GET') {
		var urlMap = url.parse(req.url, true);
		
		var v1 = urlMap.query.v1;
		var v2 = urlMap.query.v2;
		var op = urlMap.query.op;
		
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
	    	
	    
	} else {
		res.write(req.method + '요청을 지원하지 않습니다.');
	}
	
	res.write('</body></html>');
    res.end();
	
}).listen(1337, '127.0.0.1');
console.log('Server running at http://127.0.0.1:1337/');


