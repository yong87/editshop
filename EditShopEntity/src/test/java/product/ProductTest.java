package product;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import shop.cls.product.entity.ProductEntity;
import vo.Product;
import vo.ProductLang;

public class ProductTest {

	
	ProductEntity pe = new ProductEntity();
	
	@Test
	public void registProductTest(){
		
		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowTime = formet.format(new Date()).toString();
		Timestamp time = Timestamp.valueOf(nowTime);
		
		
		Product product = new Product();
		product.setCommission(10.1);
		product.setContent("hello product");
		product.setImagepath("http://placehold.it/30x30");
		product.setLimitTime(time);
		product.setMaxQuantity(11);
		product.setOption("red, blue, green");
		product.setProductId("3");
		product.setSellcnt(1);
		product.setStatus(40);
		product.setSellerId("test");
		
		boolean isTrue = pe.registProduct(product);
		System.out.println(isTrue);
	}
	
	@Test
	public void addProductLangEnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("beer by kirin an English Language");
		lang.setName("beer kirin");
		lang.setProductid("1");
		
		System.out.println(pe.addProductLangEn(lang));
	}
	@Test
	public void addProductLangCnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("beer by kirin an 中國語");
		lang.setName("beer kirin");
		lang.setProductid("1");
		
		System.out.println(pe.addProductLangCn(lang));
	}
	@Test
	public void addProductLangJpTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("beer by kirin an English nihongo");
		lang.setName("beer kirin");
		lang.setProductid("1");
		
		System.out.println(pe.addProductLangJp(lang));
	}
	@Test
	public void addProductLangKrTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("맥주 기린");
		lang.setName("beer kirin");
		lang.setProductid("1");
		
		System.out.println(pe.addProductLangKr(lang));
	}
	
	@Test
	public void confirmProductTest(){
		System.out.println(pe.confirmProduct("2"));
	}
	
	@Test
	public void timeTest(){
		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowtime = formet.format(new Date()).toString();
		System.out.println(nowtime);
	}
	
	
}
