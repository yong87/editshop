package shop.cls.product.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.intfc.product.entity.ProductEntityInter;
import shop.intfc.product.service.ProductServiceInter;
import shop.registbasic.BasicForm;
import vo.Product;
import vo.ProductLang;
import vo.ProductSimple;

@Service
public class ProductService implements ProductServiceInter {

	@Autowired
	private ProductEntityInter productEntity; 
	
	@Override
	public boolean registProduct(Product product, ProductSimple simple) {
		// TODO Auto-generated method stub
		String productId = generateProductNumber();
		
		product.setProductId(productId);
		product.setLimitTime(getLimitTime());
		simple.setProductid(productId);
		boolean isAdd = productEntity.addProduct(product);
		//product추가후 simple추가
		if(isAdd){
			isAdd = productEntity.addProductSimple(simple);
			//simple추하구 lang basic추가
			if(isAdd){
				isAdd = addBasicLang(productId);
				return isAdd;
			}
			return isAdd;
		}
		return isAdd;
	}

	/**
	 * basic언어 setting
	 * @param productId
	 * @return
	 */
	private boolean addBasicLang(String productId){
		BasicForm basic = new BasicForm();
		Map<String, ProductLang> langs = basic.langBaiscForm(productId);

		if(langs != null){
			if(langs.get("kr") != null){
				productEntity.addProductLangKr(langs.get("kr"));
			}
			if(langs.get("en") != null){
				productEntity.addProductLangEn(langs.get("en"));
			}
			if(langs.get("cn") != null){
				productEntity.addProductLangCn(langs.get("cn"));
			}
			if(langs.get("jp") != null){
				productEntity.addProductLangJp(langs.get("cn"));
			}
			return true;
		}
		
		return false;
		
	}
	
	@Override
	public boolean registProductLang(Map<String, ProductLang> langList) {
		// TODO Auto-generated method stub
		boolean isAdd = false;
		
		for(Map.Entry<String, ProductLang> lang : langList.entrySet()){
			String key = lang.getKey();
			isAdd = modifyProductLang(lang.getValue(), key);
			if(lang.getValue() == null){
				return isAdd;
			}
		}
		return isAdd;
	}


	@Override
	public boolean modifyProduct(Product product, ProductSimple simple) {
		// TODO Auto-generated method stub
		
		String newProductId	= generateProductNumber();
		boolean isChaser = productEntity.addModifyChaser(product.getProductId(), newProductId);
		
		if(!isChaser){
			return false;
		}
		product.setProductId(newProductId);
		simple.setProductid(newProductId);
		
		boolean isProduct = productEntity.addModifyProduct(product);
		boolean isSimple = productEntity.addModifyProductSimple(simple);
		
		//검사부분 다시한번 생각하기
		if(!isProduct){
			System.out.println("product가 만들어지지 않았습니다.");
			return false;
		}
		if(!isSimple){
			System.out.println("product가 만들어지지 않았습니다.");
			return false;
		}
		
		return true;
	}
	
	
	@Override
	public boolean modifyProductLang(ProductLang lang, String key) {
		// TODO Auto-generated method stub
		boolean isModify = false;
		if("kr".equals(key)){
			isModify = productEntity.modifyProductLangKr(lang);
		}
		if("jp".equals(key)){
			isModify = productEntity.modifyProductLangJp(lang);
		}
		if("en".equals(key)){
			isModify = productEntity.modifyProductLangEn(lang);
		}
		if("cn".equals(key)){
			isModify = productEntity.modifyProductLangCn(lang);	
		}
		
		return isModify;
	}
	
	@Override
	public boolean cancelProduct(String productId) {
		// TODO Auto-generated method stub
		boolean isCancel = productEntity.cancelProduct(productId);
		if(!isCancel){
			return isCancel;
		}
		isCancel = productEntity.cancelProductSimple(productId);
		return isCancel; 
	}

	@Override
	public boolean cancelModifyProduct(String productId) {
		// TODO Auto-generated method stub
		String chaserId = productEntity.getChaserNumber(productId);
		boolean isCancel = productEntity.cancelModifyProduct(chaserId);
		if(!isCancel){
			return isCancel;
		}
		isCancel = productEntity.cancelModifyProductSimple(chaserId);
		if(!isCancel){
			return isCancel;
		}
		isCancel = productEntity.cancelModifyProductChaser(productId);
		
		return isCancel;
	}

	@Override
	public boolean returnProduct(String productId) {
		// TODO Auto-generated method stub
		return productEntity.returnProduct(productId);
	}

	@Override
	public boolean expireProduct(String productId) {
		// TODO Auto-generated method stub
		boolean expire = productEntity.expireProdcut(productId);
		if(!expire){
			return expire;
		}
		expire = productEntity.expireProductSimple(productId);
		return expire;
	}
	//confirm test완료 confirmModify 해야함
	@Override
	public boolean confirmProduct(String productId) {
		// TODO Auto-generated method stub
		boolean isConfirm = productEntity.confirmProduct(productId);
		if(!isConfirm){
			return isConfirm;
		}
		isConfirm = productEntity.confirmProductSimple(productId);
		
		return isConfirm;
	}

	@Override
	public boolean confirmModifyProduct(String productId) {
		// TODO Auto-generated method stub
		
		String chaserId = productEntity.getChaserNumber(productId);
		boolean isOriginal = modifyOriginalProduct(productId);
		if(!isOriginal){
			return isOriginal;
		}
		boolean isConfirm = confirmProduct(chaserId);
		if(!isConfirm){
			return isConfirm;
		}
		return isConfirm;
	}
	/**
	 * 제품 수정 수락시 오리지널 데이터 스테이터스 변경
	 * @param productId
	 * @return
	 */
	private boolean modifyOriginalProduct(String productId){

		boolean isConfirm = productEntity.confirmModifyProduct(productId); 
		if(!isConfirm){
			return isConfirm;
		}
		isConfirm = productEntity.confirmModifyProductSimple(productId); 
		if(!isConfirm){
			return isConfirm;
		}
		isConfirm = productEntity.confirmModifyChaser(productId); 
		
		return isConfirm;
	}

	@Override
	public boolean sanctionProduct(String productId) {
		// TODO Auto-generated method stub
		
		boolean isSanction = productEntity.sanctionProductByAdmin(productId);
		if(!isSanction){
			return isSanction;
		}
		isSanction = productEntity.sanctionProductSimpleByAdmin(productId);
		return isSanction;
	}

	@Override
	public List<Product> findNewArrivalMain() {
		// TODO Auto-generated method stub
		List<ProductSimple> productSimple = productEntity.getNewArrivalMain();
		
		
		List<Product> products = new ArrayList<Product>();
		
		for(ProductSimple simple : productSimple){
			// simple
			Product product = productEntity.getProductByProductId(simple.getProductid());
			product.setProductSimple(simple);
			
			product.setLanguageList(getLangList(simple.getProductid()));
			
			products.add(product);
		}
		
		return products;
	}
	
	private Map<String, ProductLang> getLangList(String productId){
		Map<String, ProductLang> langs = new HashMap<String, ProductLang>();
		
		ProductLang krLang = productEntity.getProductLangKrByProductId(productId);
		ProductLang cnLang = productEntity.getProductLangCnByProductId(productId);
		ProductLang enLang = productEntity.getProductLangEnByProductId(productId);
		ProductLang jpLang = productEntity.getProductLangJpByProductId(productId);
		
		langs.put("kor", krLang);
		langs.put("chn", cnLang);
		langs.put("jpn", jpLang);
		langs.put("eng", enLang);
		
		return langs;
	}

	@Override
	public List<Product> findProductByType(int type) {
		// TODO Auto-generated method stub
		
		List<Product> products = new ArrayList<Product>();
		List<ProductSimple> simples = productEntity.getProductSimpleByType(type);	
		
		for(ProductSimple simple : simples){
			Product product = productEntity.getProductByProductId(simple.getProductid());
			product.setLanguageList(getLangList(simple.getProductid()));
			product.setProductSimple(simple);
			
			products.add(product);
		}
		
		return products;
	}

	@Override
	public Product findProductByProductId(String productId) {
		// TODO Auto-generated method stub
		Product product = productEntity.getProductByProductId(productId);
		
		product.setLanguageList(getLangList(productId));
		product.setProductSimple(productEntity.getProductSimpleByProductId(productId));
		
		return product;
	}

	@Override
	public List<ProductSimple> findNewArrvival() {
		// TODO Auto-generated method stub
		return productEntity.getNewArrival();
	}

	@Override
	public List<ProductSimple> findProductSellerId(String sellerId) {
		// TODO Auto-generated method stub
		return productEntity.getProductSimpleBySellerId(sellerId);
	}

	@Override
	public List<ProductSimple> findSanctionBySellerId(String sellerId) {
		// TODO Auto-generated method stub
		return productEntity.getSanctionBySellerId(sellerId);
	}

	@Override
	public List<ProductSimple> findResponseProduct(String sellerId) {
		// TODO Auto-generated method stub
		return productEntity.getResponseProductSimpleBySellerId(sellerId);
	}
	
	/**
	 * 네~ 다음번호!
	 * @return
	 */
	private String generateProductNumber(){
		String lastNumber = productEntity.getLastProductNumber();
		
		int parsed = Integer.parseInt(lastNumber);
		String returnNumber = String.valueOf(++parsed);
		
		return returnNumber;
	}
	
	/**
	 * 판매 종료시간
	 * @return
	 */
	private Timestamp getLimitTime(){
		
		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 3);
		
		String calTime = formet.format(cal.getTime());
		Timestamp limitTime = Timestamp.valueOf(calTime);
		
		return limitTime;
	}

}
