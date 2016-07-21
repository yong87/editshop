package controller.seller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.Product;

@Controller
public class SellerController {

	@RequestMapping(value="seller.do")
	public String loginSeller(HttpSession session){
		
		return "";
	}
	
	public boolean registSeller(){
		//seller form 을 만들어서 사용
		
		return true;
	}
	
	public boolean registProduct(Product product){
		
		
		return false;
	}
	
}
