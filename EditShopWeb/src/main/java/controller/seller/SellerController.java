package controller.seller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import shop.cls.order.service.OrderService;
import shop.cls.product.service.ProductService;
import shop.cls.seller.service.SellerAddService;
import vo.Product;

@Controller
public class SellerController {

	@Autowired
	private ProductService productService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private SellerAddService sellerAddService;
	
	@RequestMapping(value="seller.do")
	public ModelAndView loginSeller(HttpSession session){
		
		ModelAndView mnv = new ModelAndView();
		
		return mnv;
	}
	
	public boolean registSeller(){
		//seller form 을 만들어서 사용
		
		return true;
	}
	
	public boolean registProduct(Product product){
		
		
		return false;
	}
	
}
