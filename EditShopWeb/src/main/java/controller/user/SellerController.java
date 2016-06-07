package controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vo.Product;
import vo.ProductLang;
import vo.Seller;

@Controller
public class SellerController {


	
	public String registSeller(){
		
		
		
		return "seller";
	}
	
	/**
	 * 물품 등록
	 * @param product
	 * @param productLang
	 * @param session
	 * @return
	 */
	@RequestMapping(value="registProduct.do")
	public ModelAndView registProduct(Product product, ProductLang productLang, HttpSession session){
		Seller seller = (Seller)session.getAttribute("seller");
		
		System.out.println(seller.getId());
		
		ModelAndView mnv = new ModelAndView();
		mnv.setViewName("approveProduct");
		
		return mnv;
		
	}
	
	/**
	 * 승인 대기 목록
	 * @param product
	 * @param session
	 * @return
	 */
	@RequestMapping(value="approve.do")
	public ModelAndView approveProductList(Product product, HttpSession session){
		
		ModelAndView mnv = new ModelAndView();
		
		mnv.setViewName("approveProduct");
		
		return mnv;
	}
	
	/**
	 * 판매중인 목록
	 * @param product
	 * @param session
	 * @return
	 */
	@RequestMapping(value="salesProduct.do")
	public ModelAndView salesMyProduct(Product product, HttpSession session){
		
		ModelAndView mnv = new ModelAndView();
		
		mnv.setViewName("salesProduct");
		
		return mnv;
	}
	
	/**
	 * 수정요청
	 * @param product
	 * @param session
	 * @return
	 */
	@RequestMapping(value="modifyProduct.do")
	public ModelAndView modifyProduct(Product product, HttpSession session){
		
		ModelAndView mnv = new ModelAndView();
		
		mnv.setViewName("salesProduct");
		
		return mnv;
	}
	
	
}
