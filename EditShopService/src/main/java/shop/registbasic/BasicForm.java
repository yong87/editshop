package shop.registbasic;

import java.util.HashMap;
import java.util.Map;

import vo.ProductLang;

public class BasicForm {
	
	public Map<String, ProductLang> langBaiscForm(String productid){
		
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
