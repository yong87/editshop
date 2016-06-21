package product;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shop.cls.product.service.ProductService;
import vo.Product;
import vo.ProductLang;
import vo.ProductSimple;

public class ProductServiceTest {

	@Autowired
	ProductService ps;
	@Before
    public void start() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        ps = ac.getBean("productService", ProductService.class);
    }
	
	@Test
	public void addProductTest(){
		
		Product product = new Product();
		
		product.setCommission(10.1);
		product.setName("serviceTest");
		product.setContent("service Content");
		product.setMaxQuantity(300);
		product.setSellerId("test");
		product.setOption("red,blue,green,ruby");
		
		ProductLang pl = new ProductLang();
		pl.setContent("한국서비스~");
		pl.setName("오리지널 한국 제품");
		
		Map<String, ProductLang> krLang = new HashMap<String, ProductLang>();
		
		krLang.put("kr", pl);
		product.setLanguageList(krLang);
		

		System.out.println(ps.addProduct(product));
		
	}
	
	@Test
	public void registProductSimpleTest(){
		ProductSimple simple = new ProductSimple();
		simple.setPrice(3000);
		simple.setThumbnail("http://placehold.it/10x10");
		simple.setType(3);
		simple.setProductid("10");
		
		System.out.println(ps.registProductSimple(simple));
	}
	
	@Test
	public void modifyProductTest(){
		
	}
}
