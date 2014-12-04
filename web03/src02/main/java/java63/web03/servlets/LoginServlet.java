package java63.web03.servlets;

import java.io.IOException;
import java.util.HashMap;
import java63.web03.dao.MemberDao;
import java63.web03.domain.Member;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


@WebServlet("/auth/logout.do")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(
      HttpServletRequest request, 
      HttpServletResponse response)
          throws ServletException, IOException {
	  
	  request.getSession().invalidate(); // session을 제거하고 새로 만든다.
	  response.sendRedirect("login.do");
  }

}












