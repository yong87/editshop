package controller.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vo.Product;

public class ProductController {
	@RequestMapping(value="/main.do")
	public ModelAndView mainPage(){
		
		ModelAndView mnv = new ModelAndView();
		
		mnv.setViewName("main");
		
		ProductSample ps = new ProductSample();
		List<Product> productSample = ps.mainProduct();
		
		mnv.addObject("products", productSample);
		
		return mnv;
	}
	
	/*testClass*/
	public class ProductSample{
		
		public List<Product> mainProduct(){

			List<Product> productList = new ArrayList<Product>();
			
			Product product = new Product();
			product.setProductId("productId");
			product.setSellerId("sellerId");
			product.setMaxQuantity(1);
			product.setSellcnt(1);
			product.setOption("option");
			product.setCommission(10.1);
			product.setImagepath("imagePath");
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
			product2.setImagepath("imagePath1");
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
			product3.setImagepath("imagePath2");
			product3.setStatus(12);
			product3.setName("name2");
			product3.setContent("content2");
			
			productList.add(product);
			productList.add(product2);
			productList.add(product3);

			return productList;
		}
	}
}
