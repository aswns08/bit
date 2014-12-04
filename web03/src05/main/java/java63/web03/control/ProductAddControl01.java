package java63.web03.control;

import java.util.Map;
import java63.web03.dao.MakerDao;
import java63.web03.dao.ProductDao;
import java63.web03.domain.Product;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


// 방법1) @Component("/product/add.do")
// 방법2) @Component
// 방법3) @Component
// 방법3) @RequestMapping("/product/add.do")
// 방법4) @Component
// 방법4) @RequestMapping("/product")
// @Component // 객체 생성이 안되면 맵핑이 안된다.
@RequestMapping("/product/add.do")
public class ProductAddControl01 {

	@Autowired MakerDao makerDao;
	@Autowired ProductDao productDao;
	// 방법1) @RequestMapping
	// 방법2) @RequestMapping("/product/add.do")

	// 방법3)	 @RequestMapping()
	// 방법4) @RequestMapping("/add.do")

	@RequestMapping(method=RequestMethod.GET)
	public String form(HttpServletRequest request) throws Exception {
		request.setAttribute("makers", makerDao.selectNameList());

		return "/product/Productform.jsp";

	} 
	@RequestMapping(method=RequestMethod.POST)
	public String add(HttpServletRequest request) throws Exception {
		// FileUploadHeler 삭제 후 오류 발생 문제 떄문에 주석으로 맏음.
		//Map<String,String> paramMap = FileUploadHelper.parse(request);
		Map<String,String> paramMap  =  null;
		
		Product product = new Product();
		product.setName(paramMap.get("name"));
		product.setQuantity(Integer.parseInt(paramMap.get("qty")));
		product.setMakerNo(Integer.parseInt(paramMap.get("mkno")));
		product.setPhoto(paramMap.get("photo"));

		productDao.insert(product);
		productDao.insertPhoto(product);

		return "redirect:list.do";

	}

}









