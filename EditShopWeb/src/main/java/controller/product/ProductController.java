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

@Controller
public class ProductController {

	@RequestMapping(value="main.do")
	public ModelAndView mainPage(){
		
		ModelAndView mnv = new ModelAndView();

		mnv.setViewName("main");

		List<Product> productList = mainProduct();

		mnv.addObject("productList", productList);

		return mnv;
	}

	@RequestMapping(value="productDetail.do")
	public ModelAndView productDetail(@RequestParam String productId){
		
		System.out.println(productId);
		
		ModelAndView mnv = new ModelAndView();
		mnv.setViewName("productDetail");
		
		Product product = detailProduct();
		
		mnv.addObject("product", product);
		
		return mnv;
		
	}
	
	@RequestMapping(value="addBucket.do")
	@ResponseBody
	public boolean addBucket(@RequestParam String productId, HttpSession session){
		System.out.println(productId);
		
		return true;
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
}
