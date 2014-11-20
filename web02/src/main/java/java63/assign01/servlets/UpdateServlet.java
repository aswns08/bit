package java63.assign01.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java63.assign01.dao.ProductDao;
import java63.assign01.domain.Product;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/product/update")
public class UpdateServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	ProductDao productDao;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {

		productDao = new ProductDao();

		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {
			Product product = new Product();
			product.setNo(Integer.parseInt((String)request.getParameter("no")));
			product.setName((String)request.getParameter("name"));
			product.setQuantity(Integer.parseInt((String)request.getParameter("qty")));
			product.setMakerNo(Integer.parseInt((String)request.getParameter("mkno")));

			productDao.update(product);
			out.println("변경하였습니다.");
			out.println();

		} catch (Exception e) {
			e.printStackTrace();
			out.println("서버가 바쁩니다. 잠시 후 다시 시도하세요.");
			out.println();
		}
	}

}


