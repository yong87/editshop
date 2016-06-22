package mapper.product;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import vo.Product;
import vo.ProductLang;
import vo.ProductSimple;

public interface ProductMapper {
	/**
	 * 등록 관련
	 * @param product
	 * @return
	 */
	public boolean addProduct(Product product);
	public boolean addProductLangKr(ProductLang lang);
	public boolean addProductLangEn(ProductLang lang);
	public boolean addProductLangCn(ProductLang lang);
	public boolean addProductLangJp(ProductLang lang);
	public boolean addProductSimple(ProductSimple simple);
	public boolean addModifyProduct(Product product);
	
	/**
	 * 수정 관련
	 * @param product
	 * @return
	 */
	public boolean modifyProduct(String productId);
	public boolean modifyProductLangKr(ProductLang lang);
	public boolean modifyProductLangEn(ProductLang lang);
	public boolean modifyProductLangCn(ProductLang lang);
	public boolean modifyProductLangJp(ProductLang lang);
	public boolean modifyProductSimple(String productId);
	public boolean addModifyChaser(@Param("productid")String productId, @Param("chaserid")String chaserId);
	//public boolean modifyChaser();
	
	/**
	 * 등록 승인
	 * @param productId
	 * @return
	 */
	public boolean confirmProduct(String productId);
	public boolean confirmProductSimple(String productId);
	public boolean confirmModifyProduct(String productId);
	public boolean confirmModifyProductSimple(String productId);
	public boolean confirmModifyChaser(String productId);
	
	/**
	 * 취소 관련
	 * @param productId
	 * @return
	 */
	public boolean cancelProduct(String productId);
	public boolean cancelProductSimple(String productId);
	public boolean returnProduct(String productId);
	public boolean cancelModifyProduct(String productId);
	public boolean cancelModifyProductSimple(String productId);
	public boolean cancelMdofiyProductChaser(String productId);
	
	/**
	 * 삭제 관련 
	 * status = 0으로 변경으로 
	 * @param productId
	 * @return
	 */
	public boolean overLimitTime(String productId);
	public boolean expireProdcut(String productId);
	public boolean expireProductSimple(String productId);
	
	/**
	 * 제재 관련
	 * @param productId
	 * @return
	 */
	public boolean sanctionProductByAdmin(String productId);
	public boolean sanctionProductSimpleByAdmin(String productId);
	
	/**
	 * All
	 * @return
	 */
	public List<ProductSimple> getNewArrival();
	public List<ProductSimple> getNewArrivalMain();
	public List<ProductSimple> getProductSimpleByType(int type);
	public List<ProductSimple> getProductSimpleBySellerId(String sellerId);
	public Product getProductByProductId(String productId);
	public ProductLang getProductLangKrByProductId(String productId);
	public ProductLang getProductLangEnByProductId(String productId);
	public ProductLang getProductLangCnByProductId(String productId);
	public ProductLang getProductLangJpByProductId(String productId);
	
	/**
	 * seller확인 가능 method
	 * @param sellerId
	 * @return
	 */
	public List<ProductSimple> getSanctionBySellerId(String sellerId);
	public List<ProductSimple> getResponseProductSimpleBySellerId(String sellerId);
	
	/**
	 * 1. 제품의 마지막 번호를 가져온다
	 * 2. 제품의 limittime을 연장한다
	 * 3. 수정되기전 productId로 수정된 product불러오기
	 * @return
	 */
	public String getLastProductNumber();
	public boolean extendProduct(Timestamp timestamp);
	public String getChaserNumber(String productId);
}
