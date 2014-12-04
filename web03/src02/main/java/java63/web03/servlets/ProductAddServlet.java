package java63.web03.servlets;

import java.io.IOException;
import java.util.Map;
import java63.web03.dao.MakerDao;
import java63.web03.dao.ProductDao;
import java63.web03.domain.Product;
import java63.web03.util.FileUploadHelper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


@WebServlet("/product/add.do")
public class ProductAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, IOException {

		ApplicationContext appCtx = 
				WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());

		MakerDao makerDao = (MakerDao)appCtx.getBean("makerDao"); // mybitis에서 자동으로 dao를 생성해준다.
		request.setAttribute("makers", makerDao.selectNameList());


		RequestDispatcher rd = 
				request.getRequestDispatcher("/product/Productform.jsp");
		rd.forward(request, response);

	}

	@Override
	public void doPost(HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, IOException {

		try { 
			Map<String,String> paramMap = FileUploadHelper.parse(request);

			Product product = new Product();
			product.setName(paramMap.get("name"));
			product.setQuantity(Integer.parseInt(paramMap.get("qty")));
			product.setMakerNo(Integer.parseInt(paramMap.get("mkno")));
			product.setPhoto(paramMap.get("photo"));


			ApplicationContext appCtx = 
					WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());

			ProductDao productDao = (ProductDao)appCtx.getBean("productDao");

			productDao.insert(product);
			productDao.insertPhoto(product);
			
			response.sendRedirect("list.do");

		} catch (Exception e) {
			// 다른 서블릿을 실행 => 실행 후 제어권이 되돌아 온다.

			// Forward로 다른 서블릿에게 제어권 위임하기
			//	=> 제어권이 넘어가면 돌아오지 않는다.
			RequestDispatcher rd =
					request.getRequestDispatcher("/common/Error.jsp");
			request.setAttribute("error", e);
			rd.forward(request, response);
		}

	}

}








