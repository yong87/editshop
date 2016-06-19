package mapper.product;

import java.util.List;

import vo.Product;
import vo.ProductLang;
import vo.ProductSimple;

public interface ProductMapper {

	/**
	 * 등록관련 method
	 * @param product
	 * @return
	 */
	public boolean registProduct(Product product);
	public boolean addProductLangEn(ProductLang lang);
	public boolean addProductLangCn(ProductLang lang);
	public boolean addProductLangJp(ProductLang lang);
	public boolean addProductLangKr(ProductLang lang);
	public boolean confirmProduct(String product);
		
	/**
	 * Lang Alter Method
	 * @param lang
	 * @return
	 */
	public boolean registProductLangEn(ProductLang lang);
	public boolean registProductLangCn(ProductLang lang);
	public boolean registProductLangJp(ProductLang lang);
	public boolean registProductLangKr(ProductLang lang);
	
	/**
	 * 등록 취소/ 수정 관련 Method
	 * @param product
	 * @return
	 */
	public boolean cancelRegistProduct(String productId);
	public boolean modifyRegistProduct(Product product);
	public boolean expireProduct(String productId);

	/**
	 * 불러오기 관련
	 * @return
	 */
	public List<Product> getAllProduct();
	public List<Product> getProductSellerId(String sellerId);
	public Product getProductByProductId(String productId);
	public List<Product> getProductByStatus(int status);
	public List<Product> getNewArrival();
	
	/**
	 * Status 변경 관련
	 */
	public boolean sanctionForAdmin(String productId); 
	public boolean sanctionForSeller(String productId);
	
	
	public boolean extendProduct(Product product);
	
	public boolean addProductSimple(ProductSimple productSimple);
	public boolean modifyProductSimple(ProductSimple productSimple);
	public boolean quitProductSimple(String productId);
	
	public List<ProductSimple> newArrivalMain();
	public List<ProductSimple> productByType(int type);
	public List<ProductSimple> productSimpleByStatus(int status);
	public List<ProductSimple> productBySellerId(String sellerId);
	
	public String lastProductNumber();
}
