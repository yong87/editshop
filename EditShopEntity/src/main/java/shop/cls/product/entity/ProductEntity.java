package shop.cls.product.entity;

import java.util.List;

import mapper.product.ProductMapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import session.ShopSqlSessionFactory;
import shop.intfc.product.entity.ProductEntityInter;
import vo.Product;
import vo.ProductLang;
import vo.ProductSimple;

@Repository
public class ProductEntity implements ProductEntityInter {

	@Override
	public boolean registProduct(Product product) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.registProduct(product);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean addProductLangEn(ProductLang lang) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.addProductLangEn(lang);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean addProductLangCn(ProductLang lang) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.addProductLangCn(lang);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean addProductLangJp(ProductLang lang) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.addProductLangJp(lang);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean addProductLangKr(ProductLang lang) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.addProductLangKr(lang);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean confirmProduct(String product) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.confirmProduct(product);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean registProductLangEn(ProductLang lang) {
		// TODO Auto-generated method stub

		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.registProductLangEn(lang);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean registProductLangCn(ProductLang lang) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.registProductLangCn(lang);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean registProductLangJp(ProductLang lang) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.registProductLangJp(lang);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean registProductLangKr(ProductLang lang) {
		// TODO Auto-generated method stub

		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.registProductLangKr(lang);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean cancelRegistProduct(String productId) {
		// TODO Auto-generated method stub

		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.cancelRegistProduct(productId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean modifyRegistProduct(Product product) {
		// TODO Auto-generated method stub

		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.modifyRegistProduct(product);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean expireProduct(String productId) {
		// TODO Auto-generated method stub

		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.expireProduct(productId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Product> products = null;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			products = mapper.getAllProduct();
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return products;
	}

	@Override
	public List<Product> getProductSellerId(String sellerId) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Product> products = null;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			products = mapper.getProductSellerId(sellerId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return products;
	}

	@Override
	public Product getProductByProductId(String productId) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		Product products = null;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			products = mapper.getProductByProductId(productId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return products;
	}

	@Override
	public List<Product> getProductByStatus(int status) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Product> products = null;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			products = mapper.getProductByStatus(status);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return products;
	}

	@Override
	public List<Product> getNewArrival() {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Product> products = null;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			products = mapper.getNewArrival();
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return products;
	}

	@Override
	public boolean sanctionForAdmin(String productId) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.sanctionForAdmin(productId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean sanctionForSeller(String productId) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.sanctionForSeller(productId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean extendProduct(Product product) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.extendProduct(product);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public boolean quitProductSimple(String productId) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isTrue = false;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			isTrue = mapper.quitProductSimple(productId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return isTrue;
	}

	@Override
	public List<ProductSimple> newArrivalMain() {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<ProductSimple> products = null;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			products = mapper.newArrivalMain();
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return products;
	}

	@Override
	public List<ProductSimple> productByType(int type) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<ProductSimple> products = null;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			products = mapper.productByType(type);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return products;
	}

	@Override
	public List<ProductSimple> productByStatus(int status) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<ProductSimple> products = null;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			products = mapper.productByStatus(status);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return products;
	}

	@Override
	public List<ProductSimple> productBySellerId(String sellerId) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<ProductSimple> products = null;
		try{
			ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
			products = mapper.productBySellerId(sellerId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return products;
	}
}
