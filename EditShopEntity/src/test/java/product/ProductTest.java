package product;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
		product.setProductId("4");
		product.setSellcnt(1);
		product.setStatus(40);
		product.setSellerId("test");
		
		boolean isTrue = pe.registProduct(product);
		System.out.println(isTrue);
	}
	
	@Test
	public void addProductLangEnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("The default language setting English");
		lang.setName("default");
		lang.setProductid("3");
		
		System.out.println(pe.addProductLangEn(lang));
	}
	@Test
	public void addProductLangCnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("默認語言設置中國");
		lang.setName("基本");
		lang.setProductid("2");
		
		System.out.println(pe.addProductLangCn(lang));
	}
	@Test
	public void addProductLangJpTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("既定の言語設定日本語");
		lang.setName("基本");
		lang.setProductid("2");
		
		System.out.println(pe.addProductLangJp(lang));
	}
	@Test
	public void addProductLangKrTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("기본 한국어 셋팅 ");
		lang.setName("기본");
		lang.setProductid("2");
		
		System.out.println(pe.addProductLangKr(lang));
	}
	
	@Test
	public void confirmProductTest(){
		System.out.println(pe.confirmProduct("1"));
	}
	
	@Test
	public void registProductLangEnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("I write in English");
		lang.setName("US product name");
		lang.setProductid("2");
		
		System.out.println(pe.registProductLangEn(lang));
	}
	@Test
	public void registProductLangCnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("我寫中國。");
		lang.setName("中國產品名稱");
		lang.setProductid("2");
		
		System.out.println(pe.registProductLangCn(lang));
	}
	@Test
	public void registProductLangJnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("日本の言葉べきです。");
		lang.setName("日本製品名");
		lang.setProductid("2");
		
		System.out.println(pe.registProductLangJp(lang));
	}
	@Test
	public void registProductLangKnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("한국말로 써야합니다.");
		lang.setName("한국 제품 이름");
		lang.setProductid("2");
		
		System.out.println(pe.registProductLangKr(lang));
	}
	
	@Test
	public void cancelRegistProductTest(){
		System.out.println(pe.cancelRegistProduct("2"));
	}
	
	@Test
	public void modifyRegistProductTest(){
		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowTime = formet.format(new Date()).toString();
		Timestamp time = Timestamp.valueOf(nowTime);
		
		
		Product product = new Product();
		product.setCommission(10.1);
		product.setContent("hello product");
		product.setImagepath("http://placehold.it/50x50");
		product.setLimitTime(time);
		product.setMaxQuantity(11);
		product.setOption("red, blue, green");
		product.setProductId("2");
		product.setSellcnt(1);
		product.setStatus(40);
		product.setSellerId("test");
		
		System.out.println(pe.modifyRegistProduct(product));
	}
	
	@Test
	public void expireProductTest(){
		System.out.println(pe.expireProduct("1"));
	}
	
	
	@Test
	public void getAllProductTest(){
		
		/**
		 * 0000-00-00 00:00:00 이면 불러와지지 않음! 데이터 넣을때 조심
		 */
		
		List<Product> products = pe.getAllProduct();
		
		for(Product product : products){
			System.out.println(product.toString());
		}
	}
	
	@Test
	public void getProductSellerIdTest(){
		List<Product> products = pe.getProductSellerId("test");
		
		for(Product product : products){
			System.out.println(product.toString());
		}
		
	}
	
	@Test
	public void getProductByProductId(){
		Product product = pe.getProductByProductId("1");
		
		System.out.println(product.toString());
	}
	
	@Test
	public void getProductByStatusTest(){
		
	}
	
	@Test
	public void timeTest(){
		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowtime = formet.format(new Date()).toString();
		System.out.println(nowtime);
	}
	
	
	
}
