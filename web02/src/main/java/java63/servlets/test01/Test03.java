package java63.servlets.test01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/* html 출력하기 
 */

@WebServlet("/test01/Test03") // 현재 context 루트 (현재 웹어플리케이션.)
public class Test03 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		// 1. ServletResponse 도구를 사용하여 출력 스트림을 준비한다.
		PrintWriter out = response.getWriter();
		
		// 2. 출력 스트림을 사용하여 웹 브라우저로 출력한다.
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>안녕하세용</h1>");
		out.println("</body>");
		out.println("</html>");
		// http://localhost:8080/web02/test01/Test04?a=10&op=plus&b=20
	}
}
