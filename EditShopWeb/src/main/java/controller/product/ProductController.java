package controller.product;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import shop.cls.product.service.ProductService;
import vo.ProductSimple;
import vo.User;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	/**
	 * UserMainPage
	 * @return mnv(Product, Review, Community)
	 */
	@RequestMapping(value="main.do")
	public ModelAndView mainPage(){
		
		List<ProductSimple> product = productService.findNewArrivalMain();
		
		ModelAndView mnv = new ModelAndView();

		mnv.addObject("newarrival", product);
		mnv.setViewName("main");

		
		return mnv;
	}

	/*@RequestMapping(value="productDetail.do")
	public ModelAndView productDetail(@RequestParam String productId){
		
		
		
	}*/
	
	@RequestMapping(value="addBucket.do")
	@ResponseBody
	public boolean addBucket(@RequestParam String productId, @RequestParam String productCnt, HttpSession session){

		
		System.out.println(productId);
		/*물품의 담는 카운트를 인트로*/
		int ss = Integer.parseInt(productCnt);
		System.out.println(ss);
		
		User user = (User) session.getAttribute("user");
		System.out.println(user.getId());
		
		
		return true;
	}
	
	@RequestMapping(value="searchProduct.do")
	public ModelAndView searchProduct(@RequestParam String searchType, @RequestParam String search){
		
		ModelAndView mnv = new ModelAndView();
		
		
		return mnv;
	}
}
