package cls.seller.entity;

import mapper.seller.SellerAddMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;
import vo.Seller;
import vo.SellerLang;



public class SellerAddEntity implements intfc.seller.entity.SellerAddEntity{

	public boolean addSeller(Seller seller) {
		
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			SellerAddMapper selleraddMapper = sqlsession
					.getMapper(SellerAddMapper.class);

			selleraddMapper.addSeller(seller);
			
			if(!addDefalutSellerInKor(seller.getId(), sqlsession)) return false;
			if(!addDefalutSellerInJpn(seller.getId(), sqlsession)) return false;
			if(!addDefalutSellerInEng(seller.getId(), sqlsession)) return false;
			if(!addDefalutSellerInChn(seller.getId(), sqlsession)) return false;
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}
	
	private boolean addDefalutSellerInKor(String id, SqlSession sqlsession) {
		try {
			SellerAddMapper selleraddMapper = sqlsession
					.getMapper(SellerAddMapper.class);

			selleraddMapper.addDefalutSellerInKor(id);
			
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
		}
		return true;
	}
	private boolean addDefalutSellerInJpn(String id, SqlSession sqlsession) {
		
		try {
			SellerAddMapper selleraddMapper = sqlsession
					.getMapper(SellerAddMapper.class);

			selleraddMapper.addDefalutSellerInJpn(id);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
		}
		return true;
	}
	private boolean addDefalutSellerInChn(String id, SqlSession sqlsession) {
		
		try {
			SellerAddMapper selleraddMapper = sqlsession
					.getMapper(SellerAddMapper.class);

			selleraddMapper.addDefalutSellerInChn(id);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
		}
		return true;
	}
	private boolean addDefalutSellerInEng(String id, SqlSession sqlsession) {
		try {
			SellerAddMapper selleraddMapper = sqlsession
					.getMapper(SellerAddMapper.class);

			selleraddMapper.addDefalutSellerInEng(id);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
		}
		return true;
	}

	@Override
	public boolean updateKr(SellerLang sellerLang) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			SellerAddMapper selleraddMapper = sqlsession
					.getMapper(SellerAddMapper.class);

			selleraddMapper.updateKr(sellerLang);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	@Override
	public boolean updateEn(SellerLang sellerLang) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			SellerAddMapper selleraddMapper = sqlsession
					.getMapper(SellerAddMapper.class);

			selleraddMapper.updateEn(sellerLang);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	@Override
	public boolean updateCn(SellerLang sellerLang) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			SellerAddMapper selleraddMapper = sqlsession
					.getMapper(SellerAddMapper.class);

			selleraddMapper.updateCn(sellerLang);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	@Override
	public boolean updateJp(SellerLang sellerLang) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			SellerAddMapper selleraddMapper = sqlsession
					.getMapper(SellerAddMapper.class);

			selleraddMapper.updateJp(sellerLang);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}
}
