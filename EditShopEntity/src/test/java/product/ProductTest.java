package product;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		System.out.println(pe.cancelProduct("6"));
	}
	
	@Test
	public void cancelProductSimpleTest(){
		System.out.println(pe.cancelProductSimple("6"));
	}
	
	@Test
	public void returnProudctTest(){
		System.out.println(pe.returnProduct("6"));
	}
	
	@Test
	public void cancelModfiyProductTest(){
		System.out.println(pe.cancelModifyProduct("6"));
	}
	
	@Test
	public void cancelModfiyProductSimpleTest(){
		System.out.println(pe.cancelModifyProductSimple("6"));
	}
	
	@Test
	public void cancelModifyProductChaserTest(){
		System.out.println(pe.cancelModifyProductChaser("6"));
	}
	
	@Test
	public void overLimitTimeTest(){
		System.out.println(pe.overLimitTime("6"));
	}
	
	@Test
	public void expireProductTest(){
		System.out.println(pe.expireProdcut("7"));
	}
	
	@Test
	public void expireProductSimpleTest(){
		System.out.println(pe.expireProductSimple("7"));
	}
	
	@Test
	public void sanctionProductByAdminTest(){
		System.out.println(pe.sanctionProductByAdmin("6"));
	}
	
	@Test
	public void sanctionProductSimpleByAdminTest(){
		System.out.println(pe.sanctionProductSimpleByAdmin("6"));
	}
	
	@Test
	public void getNewArrivalTest(){
		List<ProductSimple> ps = pe.getNewArrival();
		for(ProductSimple simple : ps){
			System.out.println(simple.toString());
		}
	}
	@Test
	public void getNewArrivalMainTest(){
		List<ProductSimple> ps = pe.getNewArrivalMain();
		for(ProductSimple simple : ps){
			System.out.println(simple.toString());
		}
	}
	
	@Test
	public void getProductSimpleByTypeTest(){
		List<ProductSimple> ps = pe.getProductSimpleByType(3);
		for(ProductSimple simple : ps){
			System.out.println(simple.toString());
		}
	}
	@Test
	public void getProductSimpleBySellerIdTest(){
		List<ProductSimple> ps = pe.getProductSimpleBySellerId("test");
		for(ProductSimple simple : ps){
			System.out.println(simple.toString());
		}
	}
	
	@Test
	public void getProductByProductIdTest(){
		Product product = pe.getProductByProductId("3");
		
		System.out.println(product.toString());
	}
	
	@Test
	public void getProductLangKrByProductIdTest(){
		ProductLang lang = pe.getProductLangKrByProductId("3");
		System.out.println(lang.toString());
	}
	@Test
	public void getProductLangEnByProductIdTest(){
		ProductLang lang = pe.getProductLangEnByProductId("3");
		System.out.println(lang.toString());
	}
	@Test
	public void getProductLangCnByProductIdTest(){
		ProductLang lang = pe.getProductLangCnByProductId("3");
		System.out.println(lang.toString());
	}
	@Test
	public void getProductLangJpByProductIdTest(){
		ProductLang lang = pe.getProductLangJpByProductId("3");
		System.out.println(lang.toString());
	}
	
	@Test
	public void getSanctionBySellerIdTest(){
		List<ProductSimple> ps = pe.getSanctionBySellerId("test");
		
		for(ProductSimple simple : ps){
			System.out.println(simple.toString());
		}
	}
	
	
	@Test
	public void getResponseProductSimpleBySellerIdTest(){
		List<ProductSimple> ps = pe.getResponseProductSimpleBySellerId("test");
		
		for(ProductSimple simple : ps){
			System.out.println(simple.toString());
		}
	}
	
	@Test
	public void getLastProductNumberTest(){
		System.out.println(pe.getLastProductNumber());
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


	@Test
	public void forEachMapTest(){
		Map<String, ProductLang>langs =  langBasicForm("1");
		
		for(Map.Entry<String, ProductLang> init: langs.entrySet()){
			if(init.getKey().equals("kr")){
				if(init.getValue() != null){
					System.out.println(init.getValue().toString());;
				}
			}
			if(init.getKey().equals("en")){
				if(init.getValue() != null){
					System.out.println(init.getValue().toString());;
				}
			}
			if(init.getKey().equals("cn")){
				if(init.getValue() != null){
					System.out.println(init.getValue().toString());;
				}
			}
			if(init.getKey().equals("jp")){
				if(init.getValue() != null){
					System.out.println(init.getValue().toString());;
				}
			}
		}
	}
	
	@Test
	public void getProductSimpleByProductIdTest(){
		ProductSimple ps = pe.getProductSimpleByProductId("17");
		System.out.println(ps.toString());
	}

	public Map<String, ProductLang> langBasicForm(String productid){
		
		Map<String, ProductLang> lang = new HashMap<String, ProductLang>();
		lang.put("kr", basicProductLangKr(productid));
		lang.put("cn", basicProductLangCn(productid));
		lang.put("en", basicProductLangEn(productid));
		lang.put("jp", basicProductLangJp(productid));
		
		return lang;
	}

	private ProductLang basicProductLangCn(String productid){
		ProductLang lang = new ProductLang();
		lang.setContent("该产品是语言方面的准备。");
		lang.setName("品的制备");
		lang.setProductid(productid);
		
		return lang;
	}
	private ProductLang basicProductLangEn(String productid){
		ProductLang lang = new ProductLang();
		lang.setContent("The product is the language preparation.");
		lang.setName("Preparation of goods");
		lang.setProductid(productid);
		
		return lang;
	}
	private ProductLang basicProductLangJp(String productid){
		ProductLang lang = new ProductLang();
		lang.setContent("その言語の商品は準備中です。");
		lang.setName("準備中の商品");
		lang.setProductid(productid);
		
		return lang;
	}
	private ProductLang basicProductLangKr(String productid){
		ProductLang lang = new ProductLang();
		lang.setContent("현재 상품은 준비중입니다.");
		lang.setName("상품 준비중입니다.");
		lang.setProductid(productid);
		
		return lang;
	}
}
