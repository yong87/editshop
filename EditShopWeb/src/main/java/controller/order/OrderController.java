package controller.order;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import shop.intfc.order.service.OrderServiceInter;
import vo.Order;
import vo.Product;
import vo.User;

@Controller
public class OrderController {

	@Autowired
	private OrderServiceInter service;
	
	@RequestMapping(value="buyProduct.do", method=RequestMethod.POST)
	public ModelAndView buyProduct(Product product, HttpSession session, @RequestParam int price){
		
		User user = (User) session.getAttribute("user");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int sellcnt = product.getSellcnt();
		
		int amount = price * sellcnt; 
		System.out.println(amount);
		
		
		
		Order order = new Order();
		order.setSellerid(product.getSellerId());
		order.setProductid(product.getProductId());
		order.setProductOption(product.getOption());
		order.setAmount(amount);
		order.setUserid(user.getId());
		
		System.out.println(order.toString());
		
		return null;
	}
}
