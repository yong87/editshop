package shop.cls.product.entity;

import java.sql.Timestamp;
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
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isAdd = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isAdd = mapper.addProduct(product);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isAdd;
	}

	@Override
	public boolean addProductLangKr(ProductLang lang) {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isAdd = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isAdd = mapper.addProductLangKr(lang);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isAdd;
	}

	@Override
	public boolean addProductLangEn(ProductLang lang) {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isAdd = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isAdd = mapper.addProductLangEn(lang);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isAdd;
	}

	@Override
	public boolean addProductLangCn(ProductLang lang) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isAdd = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isAdd = mapper.addProductLangCn(lang);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isAdd;
	}

	@Override
	public boolean addProductLangJp(ProductLang lang) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isAdd = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isAdd = mapper.addProductLangJp(lang);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isAdd;
	}

	@Override
	public boolean addProductSimple(ProductSimple simple) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isAdd = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isAdd = mapper.addProductSimple(simple);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isAdd;
	}

	@Override
	public boolean addModifyProduct(Product product) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isAdd = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isAdd = mapper.addModifyProduct(product);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isAdd;
	}
	@Override
	public boolean addModifyProductSimple(ProductSimple simple) {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isAdd = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isAdd = mapper.addModifyProductSimple(simple);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isAdd;
	}

	/** 수정 */
	


	@Override
	public boolean modifyProductLangKr(ProductLang lang) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isModify = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isModify = mapper.modifyProductLangKr(lang);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isModify;
	}

	@Override
	public boolean modifyProductLangEn(ProductLang lang) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isModify = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isModify = mapper.modifyProductLangEn(lang);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isModify;
	}

	@Override
	public boolean modifyProductLangCn(ProductLang lang) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isModify = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isModify = mapper.modifyProductLangCn(lang);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isModify;
	}

	@Override
	public boolean modifyProductLangJp(ProductLang lang) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isModify = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isModify = mapper.modifyProductLangJp(lang);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isModify;
	}


	@Override
	public boolean addModifyChaser(String productId, String chaserId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isModify = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isModify = mapper.addModifyChaser(productId, chaserId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isModify;
	}

	/*@Override
	public boolean modifyChaser() {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isModify = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isModify = mapper.modifyChaser();
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isModify;
	}*/

	/** 등록 승인 */
	@Override
	public boolean confirmProduct(String productId) {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isConfirm = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isConfirm = mapper.confirmProduct(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isConfirm;
	}

	@Override
	public boolean confirmProductSimple(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isConfirm = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isConfirm = mapper.confirmProductSimple(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isConfirm;
	}

	@Override
	public boolean confirmModifyProduct(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isConfirm = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isConfirm = mapper.confirmModifyProduct(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isConfirm;
	}

	@Override
	public boolean confirmModifyProductSimple(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isConfirm = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isConfirm = mapper.confirmModifyProductSimple(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isConfirm;
	}

	@Override
	public boolean confirmModifyChaser(String productId) {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isConfirm = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isConfirm = mapper.confirmModifyChaser(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isConfirm;
	}

	/** 취소 관련 */
	@Override
	public boolean cancelProduct(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCancel = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isCancel = mapper.cancelProduct(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isCancel;
	}

	@Override
	public boolean cancelProductSimple(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCancel = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isCancel = mapper.cancelProductSimple(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isCancel;
	}

	@Override
	public boolean returnProduct(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCancel = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isCancel = mapper.returnProduct(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isCancel;
	}

	@Override
	public boolean cancelModifyProduct(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCancel = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isCancel = mapper.cancelModifyProduct(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isCancel;
	}

	@Override
	public boolean cancelModifyProductSimple(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCancel = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isCancel = mapper.cancelModifyProductSimple(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isCancel;
	}

	@Override
	public boolean cancelModifyProductChaser(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCancel = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isCancel = mapper.cancelModifyProductChaser(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isCancel;
	}

	/** 삭제 관련 */
	@Override
	public boolean overLimitTime(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isDelete = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isDelete = mapper.overLimitTime(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isDelete;
	}

	@Override
	public boolean expireProdcut(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isDelete = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isDelete = mapper.expireProdcut(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isDelete;
	}

	@Override
	public boolean expireProductSimple(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isDelete = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isDelete = mapper.expireProductSimple(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isDelete;
	}

	/** 제재 관련 */
	@Override
	public boolean sanctionProductByAdmin(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isSanction = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isSanction = mapper.sanctionProductByAdmin(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isSanction;
	}

	@Override
	public boolean sanctionProductSimpleByAdmin(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isSanction = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isSanction = mapper.sanctionProductByAdmin(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isSanction;
	}

	/** getAll */
	@Override
	public List<ProductSimple> getNewArrival() {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<ProductSimple> newArrival = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			newArrival = mapper.getNewArrival();
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return newArrival;
	}

	@Override
	public List<ProductSimple> getNewArrivalMain() {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<ProductSimple> newArrival = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			newArrival = mapper.getNewArrivalMain();
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return newArrival;
	}

	@Override
	public List<ProductSimple> getProductSimpleByType(int type) {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<ProductSimple> simple = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			simple = mapper.getProductSimpleByType(type);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return simple;
	}

	@Override
	public List<ProductSimple> getProductSimpleBySellerId(String sellerId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<ProductSimple> simple = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			simple = mapper.getProductSimpleBySellerId(sellerId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return simple;
	}

	@Override
	public Product getProductByProductId(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		Product product = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			product = mapper.getProductByProductId(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return product;
	}
	
	@Override
	public ProductSimple getProductSimpleByProductId(String productId) {
		// TODO Auto-generated method stub
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		ProductSimple product = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			product = mapper.getProductSimpleByProductId(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return product;
	}
	
	@Override
	public ProductLang getProductLangKrByProductId(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		ProductLang lang = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			lang = mapper.getProductLangKrByProductId(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return lang;
	}

	@Override
	public ProductLang getProductLangEnByProductId(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		ProductLang lang = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			lang = mapper.getProductLangEnByProductId(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return lang;
	}

	@Override
	public ProductLang getProductLangCnByProductId(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		ProductLang lang = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			lang = mapper.getProductLangCnByProductId(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return lang;
	}

	@Override
	public ProductLang getProductLangJpByProductId(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		ProductLang lang = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			lang = mapper.getProductLangJpByProductId(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return lang;
	}

	@Override
	public List<ProductSimple> getSanctionBySellerId(String sellerId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<ProductSimple> simple = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			simple = mapper.getSanctionBySellerId(sellerId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return simple;
	}

	@Override
	public List<ProductSimple> getResponseProductSimpleBySellerId(
			String sellerId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<ProductSimple> simple = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			simple = mapper.getResponseProductSimpleBySellerId(sellerId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return simple;
	}

	@Override
	public String getLastProductNumber() {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		String lastProductNumber = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			lastProductNumber = mapper.getLastProductNumber();
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return lastProductNumber;
	}

	@Override
	public boolean extendProduct(Timestamp timestamp) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isExtend = false;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			isExtend = mapper.extendProduct(timestamp);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return isExtend;
	}

	@Override
	public String getChaserNumber(String productId) {
		// TODO Auto-generated method stub

		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		String chaserNumber = null;
		
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			chaserNumber = mapper.getChaserNumber(productId);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return chaserNumber;
	}
	
}
