package controller.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import vo.Product;
import vo.ProductLang;
import vo.ReviewVo;
import vo.User;

@Controller
public class ProductController {

	@RequestMapping(value="main.do")
	public ModelAndView mainPage(){
		
		ModelAndView mnv = new ModelAndView();

		mnv.setViewName("main");

		List<Product> productList = mainProduct();
		List<ReviewVo> review = reviewmian();
		
		mnv.addObject("productList", productList);
		mnv.addObject("reviews", review);
		
		return mnv;
	}

	@RequestMapping(value="productDetail.do")
	public ModelAndView productDetail(@RequestParam String productId){
		
		System.out.println(productId);
		
		ModelAndView mnv = new ModelAndView();
		mnv.setViewName("productDetail");
		
		Product product = detailProduct();
		ReviewVo review = review();
		
		mnv.addObject("product", product);
		mnv.addObject("review", review);
		
		return mnv;
		
	}
	
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
		
		/*service에서 검색하는것 불러옴*/
		List<Product> products = mainProduct();
		
		mnv.setViewName("productpage");
		mnv.addObject("products", products);
		
		return mnv;
	}
	
	/*testMethod*/
	public List<Product> mainProduct(){

		List<Product> productList = new ArrayList<Product>();

		Product product = new Product();
		product.setProductId("productId");
		product.setSellerId("sellerId");
		product.setMaxQuantity(1);
		product.setSellcnt(1);
		product.setOption("option");
		product.setCommission(10.1);
		product.setImagepath("http://placehold.it/30x30");
		product.setStatus(1);
		product.setName("name");
		product.setContent("content");

		Product product2 = new Product();
		product2.setProductId("productId1");
		product2.setSellerId("sellerId1");
		product2.setMaxQuantity(11);
		product2.setSellcnt(11);
		product2.setOption("option");
		product2.setCommission(10.11);
		product2.setImagepath("http://placehold.it/30x30");
		product2.setStatus(11);
		product2.setName("name1");
		product2.setContent("content1");

		Product product3 = new Product();
		product3.setProductId("productId2");
		product3.setSellerId("sellerId2");
		product3.setMaxQuantity(12);
		product3.setSellcnt(12);
		product3.setOption("option2");
		product3.setCommission(10.12);
		product3.setImagepath("http://placehold.it/30x30");
		product3.setStatus(12);
		product3.setName("name2");
		product3.setContent("content2");

		
		ProductLang plkr = new ProductLang();
		plkr.setName("sss/kr");
		plkr.setAddress("address/kr");

		ProductLang pljp = new ProductLang();
		pljp.setName("sss/jp");
		pljp.setAddress("address/jp");
		
		ProductLang plcn = new ProductLang();
		plcn.setName("sss/cn");
		plcn.setAddress("address/chn");
		
		Map<String, ProductLang> map = new HashMap<String, ProductLang>();
		map.put("kor", plkr);
		map.put("jpn", pljp);
		map.put("chn", plcn);
		

		product.setLanguageList(map);
		product2.setLanguageList(map);
		product3.setLanguageList(map);
		
		
		productList.add(product);
		productList.add(product2);
		productList.add(product3);
		
		return productList;
	}
	
	/*testMethod*/
	public Product detailProduct(){
		
		Product product = new Product();
		product.setProductId("sendproductId");
		product.setSellerId("sellerId");
		product.setMaxQuantity(1);
		product.setSellcnt(1);
		product.setOption("option");
		product.setCommission(10.1);
		product.setImagepath("http://placehold.it/30x30");
		product.setStatus(1);
		product.setName("name");
		product.setContent("content");
		
		ProductLang plkr = new ProductLang();
		plkr.setName("sss/kr");
		plkr.setAddress("address/kr");

		ProductLang pljp = new ProductLang();
		pljp.setName("sss/jp");
		pljp.setAddress("address/jp");
		
		ProductLang plcn = new ProductLang();
		plcn.setName("sss/cn");
		plcn.setAddress("address/chn");
		
		Map<String, ProductLang> map = new HashMap<String, ProductLang>();
		map.put("kor", plkr);
		map.put("jpn", pljp);
		map.put("chn", plcn);

		product.setLanguageList(map);
		
		return product;
		
	}

	/*test method*/
	public List<ReviewVo> reviewmian(){
		
		ReviewVo review1 = new ReviewVo();
		
		review1.setContent("content1");
		review1.setHate(1);
		review1.setLike(1);
		review1.setOrdernumber("orderNumber1");
		review1.setPoint(1);
		
		ReviewVo review2 = new ReviewVo();
		
		review2.setContent("content2");
		review2.setHate(2);
		review2.setLike(2);
		review2.setOrdernumber("orderNumber3");
		review2.setPoint(2);
		
		ReviewVo review3 = new ReviewVo();
		
		review3.setContent("content3");
		review3.setHate(3);
		review3.setLike(3);
		review3.setOrdernumber("orderNumber3");
		review3.setPoint(3);
		
		List<ReviewVo> bestreviews = new ArrayList<ReviewVo>();
		
		bestreviews.add(review1);
		bestreviews.add(review2);
		bestreviews.add(review3);

		return bestreviews;
	}
	
	public ReviewVo review(){
		
		ReviewVo review1 = new ReviewVo();
		
		review1.setContent("content1");
		review1.setHate(1);
		review1.setLike(1);
		review1.setOrdernumber("orderNumber1");
		review1.setPoint(1);
		
		return review1; 
	}
}
