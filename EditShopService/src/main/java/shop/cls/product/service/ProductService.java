package shop.cls.product.service;

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
	public boolean addProduct(Product product) {
		// TODO 제품을 등록한다. 등록하는데 기본으로 Lang
		String productId = generateProductNumber();
		product.setProductId(productId);
				
		boolean isRegist = productEntity.registProduct(product);
		
		Map<String, ProductLang> lang = product.getLanguageList();
		
		boolean krRegist = productEntity.addProductLangKr(lang.get("kr"));
		boolean isOther = registOtherLang(productId);
		
		if(!isRegist || !krRegist || isOther){
			return false;
		}
		
		return true;
	}

	@Override
	public boolean registProductSimple(ProductSimple productSimple) {
		// TODO 제품의 간략한 정보를 등록한다.
		
		boolean isSimple = productEntity.addProductSimple(productSimple);
		if(!isSimple){
			return false;
		}
		return true;
	}

	@Override
	public boolean modifyProduct(Product product) {
		// TODO Auto-generated method stub
		
		boolean isModify = productEntity.modifyRegistProduct(product);
		//boolean isLog = productEntity.logProduct();
		
		if(!isModify){
			return false;
		}
		
		return true;
	}

	@Override
	public boolean modifyProductSimple(ProductSimple productSimple) {
		// TODO Auto-generated method stub
		
		boolean isModify = productEntity.modifyProductSimple(productSimple);
		if(!isModify){
			return false;
		}
		
		return true;
	}

	@Override
	public boolean confirmProduct(String productId) {
		// TODO Auto-generated method stub
		boolean isConfirm = productEntity.confirmProduct(productId);
		
		if(!isConfirm){
			return false;
		}
		
		return true;
	}

	@Override
	public boolean expireProduct(String productId) {
		// TODO Auto-generated method stub
		
		boolean isExpire = productEntity.expireProduct(productId);
		if(!isExpire){
			return false;
		}
		return true;
	}

	@Override
	public boolean regsitProductLang(Map<String, ProductLang> lang) {
		// TODO Auto-generated method stub
		
		ProductLang cnLang = lang.get("cn");
		ProductLang enLang = lang.get("en");
		ProductLang jpLang = lang.get("jp");
		
		//중국등록
		if(cnLang != null){
			boolean isModify = productEntity.registProductLangCn(cnLang);
			if(!isModify){
				return false;
			}
		}
		
		//영어 등록
		if(enLang != null){
			boolean isModify = productEntity.registProductLangEn(enLang);
			if(!isModify){
				return false;
			}
		}
		
		//일본어 등록
		if(jpLang != null){
			boolean isModify = productEntity.registProductLangJp(jpLang);
			if(!isModify){
				return false;
			}
		}
		
		return true;
	}

	//all 검색시
	@Override
	public List<ProductSimple> findAllProduct() {
		// TODO Auto-generated method stub
		return productEntity.productSimpleByStatus(42);
	}

	@Override
	public List<ProductSimple> newArrivalMain() {
		// TODO Auto-generated method stub
		return productEntity.newArrivalMain();
	}

	@Override
	public List<ProductSimple> findCategory(int type) {
		// TODO Auto-generated method stub
		return productEntity.productByType(type);
	}

	/**
	 * 관리자 전용
	 * @param status && sellerId
	 * @return
	 */
	@Override
	public List<ProductSimple> findProductByStatus(int status) {
		// TODO Auto-generated method stub
		return productEntity.productSimpleByStatus(status);
	}

	@Override
	public List<ProductSimple> findProductBySellerId(String sellerId) {
		// TODO Auto-generated method stub
		return productEntity.productBySellerId(sellerId);
	}

	@Override
	public Product findProductById(String productId) {
		// TODO Auto-generated method stub
		return productEntity.getProductByProductId(productId);
	}
	
	/**
	 * 한국어 제외 기본 폼등록
	 * @param productId
	 * @return
	 */
	private boolean registOtherLang(String productId){
		BasicForm form = new BasicForm();
		Map<String, ProductLang>lang = form.langBaiscForm(productId);
		boolean isCn = productEntity.addProductLangCn(lang.get("cn"));
		boolean isEn = productEntity.addProductLangEn(lang.get("en"));
		boolean isJp = productEntity.addProductLangJp(lang.get("jp"));
		
		if(!isCn || !isEn || !isJp){
			return false;
		}
		
		return true;
	}
	
	

	/**
	 * 네~ 다음번호!
	 * @return
	 */
	private String generateProductNumber(){
		String lastNumber = productEntity.lastProductNumber();
		System.out.println(lastNumber);
		int parsed = Integer.parseInt(lastNumber);
		String returnNumber = String.valueOf(++parsed);
		
		return returnNumber;
	}

}
