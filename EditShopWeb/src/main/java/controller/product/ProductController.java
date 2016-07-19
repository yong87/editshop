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
import vo.Bucket;
import vo.Product;
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
		
		List<Product> product = productService.findNewArrivalMain();
		
		ModelAndView mnv = new ModelAndView();

		mnv.addObject("newarrival", product);
		mnv.setViewName("main");

		
		return mnv;
	}

	@RequestMapping(value="productDetail.do")
	public ModelAndView productDetail(@RequestParam String productId){
		
		ModelAndView mnv = new ModelAndView();
		
		Product product = productService.findProductByProductId(productId);
		mnv.addObject("product", product);
		mnv.setViewName("productdetail");
		
		return mnv;
	}
	
	@RequestMapping(value="addBucket.do")
	@ResponseBody
	public boolean addBucket(Product product,@RequestParam int buycount, HttpSession session){
		
		User user = (User)session.getAttribute("user");
		
		Bucket bucket = new Bucket();
		bucket.setUserId(user.getId());
		bucket.setProductId(product.getProductId());
		bucket.setBuyCount(buycount);
		
		return true;
	}
	
	@RequestMapping(value="searchProduct.do")
	public ModelAndView searchProduct(@RequestParam String searchType, @RequestParam String search){
		
		ModelAndView mnv = new ModelAndView();
		
		return mnv;
	}
	
	@RequestMapping(value="findType.do")
	public ModelAndView findCategory(@RequestParam int type){
		
		ModelAndView mnv = new ModelAndView();
		
		List<Product> products = productService.findProductByType(type);
		mnv.setViewName("product");
		mnv.addObject(products);
		
		return mnv;
	}
	
}
