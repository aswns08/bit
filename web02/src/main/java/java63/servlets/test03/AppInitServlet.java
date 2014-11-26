package java63.servlets.test03;

import java.io.IOException;
import java.io.InputStream;
import java63.servlets.test03.dao.ProductDao;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/* 서블릿 생성.
 * => 클라이언트가 요청했을 때 생성된다.
 * 
 * 클라이언트 요청이 없더라도 강제로 서블릿을 생성하는 방법.
 * => 웹 애플리케이션을 시작할 때 생성된다.
 * => 배치 설정에 <load-on-startup></load-on-startup>을 추가한다.
 * 	이 태그에 주는 숫자는 실행 순서를 의미한다.
 *  여러 개의 서블릿이 있을 때 작은 수를 갖는 서블릿이 먼저 생성된다.
 *  
 *  <servlet>
        <servlet-name>Hello</servlet-name> <!-- 별명 -->
        <servlet-class>java63.servlets.Hello</servlet-class> <!-- 클래스명 (패키지이름 꼭 적어줘야함. -->
        <load-on-startup>1</load-on-startup>
    </servlet>
 */

/*
@WebServlet(
		name="AppInitServlet",
		loadOnStartup=1
		)
*/  
public class AppInitServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	public static ProductDao productDao;
	
	public AppInitServlet() {
		System.out.println("AppInitServlet 생성됨.");
	}
	
	/* 외부 
	 * 가능한 하드 코딩하지 말고 설정 파일에서 읽어오는 방식으로 처리하라.
	 * 
	 * 설정 파일? web.xml
	 * 
	 * 설정하는 방법은?
	 * <servlet-name>...</servlet-name> 
        <servlet-class>...</servlet-class>
        <init-param>
        		<param-name>키</param-name>
        		<param-value>값</param-value>
        
        </init-param>
        
        설정한 값을 꺼내는 방법?
        => ServlaetConfig 의 getInitParameter("키")
        		
        		
	 */
	
	@Override
	public void init() throws ServletException {

		try {
			InputStream inputStream = Resources.getResourceAsStream(
					this.getServletConfig().getInitParameter("mybatisConfig"));
			SqlSessionFactory sqlSessionFactory = 
					new SqlSessionFactoryBuilder().build(inputStream);

			productDao = new ProductDao();
			productDao.setSqlSessionFactory(sqlSessionFactory);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {}

}
