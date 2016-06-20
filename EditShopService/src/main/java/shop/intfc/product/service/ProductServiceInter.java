package shop.intfc.product.service;

import java.util.List;
import java.util.Map;

import vo.Product;
import vo.ProductLang;
import vo.ProductSimple;

public interface ProductServiceInter {

	/**
	 * 제품 등록 관련
	 * @param product
	 * @return
	 */
	public boolean addProduct(Product product);
	public boolean registProductSimple(ProductSimple productSimple);
	public boolean modifyProduct(Product product);
	public boolean modifyProductSimple(ProductSimple productSimple);
	public boolean confirmProduct(String productId);
	public boolean expireProduct(String productId);
	public boolean regsitProductLang(Map<String, ProductLang> lang);
 	
	
	
	/**
	 * 화면 관련
	 * @return
	 */
	public List<ProductSimple> findAllProduct();
	public List<ProductSimple> newArrivalMain();
	public List<ProductSimple> findCategory(int type);
	
	public List<ProductSimple> findProductByStatus(int status);
	public List<ProductSimple> findProductBySellerId(String sellerId);
	public Product findProductById(String productId);
	
	
	
}
