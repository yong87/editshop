package shop.intfc.product.service;

import java.util.List;
import java.util.Map;

import vo.Product;
import vo.ProductLang;
import vo.ProductSimple;

public interface ProductServiceInter {

	/**
	 * 등록관련
	 * 1. product를 등록하고 기본적인 Language를 넣는다.
	 * 2. 추가로 다른 언어를 입력시에 사용
	 * 3. product simple만 따로 등록
	 * @param product
	 * @return
	 */
	public boolean registProduct(Product product,ProductSimple simple);
	public boolean registProductLang(Map<String, ProductLang> langList);
	
	/**
	 * 수정관련
	 * @param product
	 * @return
	 */
	public boolean modifyProduct(Product product, ProductSimple simple);
	public boolean modifyProductLang(ProductLang lang, String key);
	
	/**
	 * 취소관련
	 * @param productId
	 * @return
	 */
	public boolean cancelProduct(String productId);
	public boolean cancelModifyProduct(String productId);
	
	/**
	 * 관리자 반려, 판매시간 종료
	 * @param productId
	 * @return
	 */
	public boolean returnProduct(String productId);
	public boolean expireProduct(String productId);
	
	/**
	 * 승인관련
	 * @param productId
	 * @return
	 */
	public boolean confirmProduct(String productId);
	public boolean confirmModifyProduct(String productId);
	
	/**
	 * 제재 관련
	 * @param productId
	 * @return
	 */
	public boolean sanctionProduct(String productId);
	
	/**
	 * 매인 관련
	 * @return
	 */
	public List<ProductSimple> findNewArrivalMain();
	
	/**
	 * 사용자 상품 관련
	 * @param type
	 * @return
	 */
	public List<ProductSimple> findProductByType(int type);
	public Product findProductByProductId(String productId);
	public List<ProductSimple> findNewArrvival();
	public List<ProductSimple> findProductSellerId(String sellerId);
	
	/**
	 * 판매자 제재물품, 등록전 상품
	 * @param sellerId
	 * @return
	 */
	public List<ProductSimple> findSanctionBySellerId(String sellerId);
	public List<ProductSimple> findResponseProduct(String sellerId);
}
