package product;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import shop.cls.product.entity.ProductEntity;
import vo.Product;
import vo.ProductLang;
import vo.ProductSimple;

public class ProductTest {


	ProductEntity pe = new ProductEntity();

	@Test
	public void registProductTest(){

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 7);
		
		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String calTime = formet.format(cal.getTime()).toString();
		Timestamp time = Timestamp.valueOf(calTime);


		Product product = new Product();
		product.setCommission(10.1);
		product.setContent("hello product");
		product.setImagepath("http://placehold.it/30x30");
		product.setLimitTime(time);
		product.setMaxQuantity(11);
		product.setOption("red, blue, green");
		product.setProductId("12");
		product.setSellcnt(1);
		product.setStatus(40);
		product.setSellerId("test4");

		boolean isTrue = pe.addProduct(product);
		System.out.println(isTrue);
	}

	@Test
	public void addProductLangEnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("The default language setting English");
		lang.setName("default");
		lang.setProductid("6");

		System.out.println(pe.addProductLangEn(lang));
	}
	@Test
	public void addProductLangCnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("默認語言設置中國");
		lang.setName("基本");
		lang.setProductid("6");

		System.out.println(pe.addProductLangCn(lang));
	}
	@Test
	public void addProductLangJpTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("既定の言語設定日本語");
		lang.setName("基本");
		lang.setProductid("6");

		System.out.println(pe.addProductLangJp(lang));
	}
	@Test
	public void addProductLangKrTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("기본 한국어 셋팅 ");
		lang.setName("기본");
		lang.setProductid("6");

		System.out.println(pe.addProductLangKr(lang));
	}

	@Test
	public void getProductIdTest(){
		Product product = pe.getProductByProductId("5");
		System.out.println(product.toString());
	}
	
	@Test
	public void addModifyProductTest(){
		Product product = pe.getProductByProductId("6");
		product.setCommission(10);
		product.setProductId("13");
		product.setStatus(41);
		product.setMaxQuantity(500);
		product.setOption("s,m,l,xl,xxl");
		System.out.println(pe.addModifyProduct(product));
	}
	
	@Test
	public void modifyProductTest(){
		System.out.println(pe.modifyProduct("6"));
	}
	
	@Test
	public void modifyProductLangEnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("I write in English");
		lang.setName("US product name");
		lang.setProductid("2");

		System.out.println(pe.modifyProductLangEn(lang));
		//System.out.println(pe.registProductLangEn(lang));
	}
	@Test
	public void modifyProductLangCnTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("我寫中國。");
		lang.setName("中國產品名稱");
		lang.setProductid("2");

		System.out.println(pe.modifyProductLangCn(lang));
		//System.out.println(pe.registProductLangCn(lang));
	}
	@Test
	public void modifyProductLangJpTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("日本の言葉べきです。");
		lang.setName("日本製品名");
		lang.setProductid("2");

		System.out.println(pe.modifyProductLangJp(lang));
		//System.out.println(pe.registProductLangJp(lang));
	}
	@Test
	public void modifyProductLangKrTest(){
		ProductLang lang = new ProductLang();
		lang.setContent("한국말로 써야합니다.");
		lang.setName("한국 제품 이름");
		lang.setProductid("2");

		
		System.out.println(pe.modifyProductLangKr(lang));
		//System.out.println(pe.registProductLangKr(lang));
	}

	@Test
	public void addModifyChaserTest(){
		System.out.println(pe.addModifyChaser("6", "13"));
	}
	
	@Test
	public void confirmProductTest(){
		System.out.println(pe.confirmProduct("13"));
	}
	
	@Test
	public void confirmProductSimpleTest(){
		System.out.println(pe.confirmProductSimple("6"));
	}
	
	@Test
	public void confirmModifyProductTest(){
		System.out.println(pe.confirmModifyProduct("6"));
	}
	
	@Test
	public void confirmModifyProductSimpleTest(){
		System.out.println(pe.confirmModifyProduct("6"));
	}
	
	@Test
	public void confirmModifyChaserTest(){
		System.out.println(pe.confirmModifyChaser("6"));
	}
	
	@Test
	public void cancelProductTest(){
		
	}
	
	@Test
	public void timeTest(){
		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowtime = formet.format(new Date()).toString();
		System.out.println(nowtime);
	}

	@Test
	public void getLimitTimeTest(){
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 7);
		
		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String ss = formet.format(cal.getTime());
		
		System.out.println(ss);
	}



}
