package java63.servlets.test01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/* 요청 파라미터 값 다루기
 * => 웹 브라우저가 전송한 데이터를 요청 파라미터라고 부른다.
 */

@WebServlet("/test01/Test05") // 현재 context 루트 (현재 웹어플리케이션.)
public class Test05 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		String op = request.getParameter("op");

		int result = 0;
		switch(op) {
		case "+": result = a + b; break;
		case "-": result = a - b; break;
		case "*": result = a * b; break;
		case "/": result = a / b; break;
		}
		
		response.setContentType("text/html;charset=UTF-8");
		// 1. ServletResponse 도구를 사용하여 출력 스트림을 준비한다.
		PrintWriter out = response.getWriter();
		
		// 2. 출력 스트림을 사용하여 웹 브라우저로 출력한다.
		out.println("<html>");
		out.println("<body>");
		out.println("<p>" + a + " " + op + " " + b + " = " +result + "</p>");
		out.println("</body>");
		out.println("</html>");
		
		// http://localhost:8080/web02/test01/Test04?a=10&op=plus&b=20
	}
}
