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
	public void registProductTest(){
	 System.out.println(ps.registProduct(testProductVo(), testSimpleVo()));	
	}
	
	@Test
	public void regsitProductLangTest(){
		System.out.println(ps.registProductLang(testLangVo()));
	}
	
	@Test
	public void confirmProductTest(){
		System.out.println(ps.confirmProduct("15"));
	}
	
	@Test
	public void modifyProductTest(){
		System.out.println(ps.modifyProduct(testProductVo(), testSimpleVo()));
	}
	
	@Test
	public void confirmModifyProductTest(){
		System.out.println(ps.confirmModifyProduct("16"));
	}
	
	/**
	 * testVo
	 * @return
	 */
	public Product testProductVo(){
		
		Product product = new Product();
		
		product.setCommission(3);
		product.setImagepath("http://placehold.it/50x50,http://placehold.it/50x50");
		product.setMaxQuantity(200);
		product.setOption("blueblack,royleBlue");
		product.setSellerId("test2");
		product.setProductId("14");
		
		
		
		return product;
	}
	
	public ProductSimple testSimpleVo(){
		ProductSimple simple = new ProductSimple();
		simple.setPrice(1500);
		simple.setThumbnail("http://placehold.it/15x15");
		simple.setType(2);
		
		return simple;
	}
	
	public Map<String, ProductLang> testLangVo(){
		
		ProductLang krLang = new ProductLang();
		ProductLang cnLang = new ProductLang();
		ProductLang jpLang = new ProductLang();
		ProductLang enLang = new ProductLang();
		
		krLang.setContent("현재 상품은 컵입니다.");
		krLang.setName("컵");
		krLang.setProductid("15");
		
		cnLang.setContent("目前产品杯。");
		cnLang.setName("杯子");
		cnLang.setProductid("15");
		
		jpLang.setContent("現在の製品カップ。");
		jpLang.setName("カップ");
		jpLang.setProductid("15");
		
		enLang.setContent("Current product Cup.");
		enLang.setName("cup");
		enLang.setProductid("15");
		
		Map<String, ProductLang> langs = new HashMap<String, ProductLang>();
		
		langs.put("kr", krLang);
		langs.put("en", enLang);
		//langs.put("cn", cnLang);
		langs.put("jp", jpLang);
		
		return langs;
	}
}
