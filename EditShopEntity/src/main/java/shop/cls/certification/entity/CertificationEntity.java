package shop.cls.certification.entity;

import mapper.certification.CertificationMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;
import shop.intfc.certification.entity.CertificationEntityInter;
import vo.CertificationVO;

public class CertificationEntity implements CertificationEntityInter {

	@Override
	public boolean addCertification(CertificationVO certification) {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isAdd = false;
		try{
			CertificationMapper mapper = session.getMapper(CertificationMapper.class);
			isAdd = mapper.addCertification(certification);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return isAdd;
	}

	@Override
	public boolean modifyCertification(CertificationVO certification) {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isAdd = false;
		try{
			CertificationMapper mapper = session.getMapper(CertificationMapper.class);
			isAdd = mapper.modifyCertification(certification);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return isAdd;
	
	}

	@Override
	public String getCertificationByUserId(String id) {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		String key = null;
		try{
			CertificationMapper mapper = session.getMapper(CertificationMapper.class);
			key = mapper.getCertificationByUserId(id);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return key;
		
	}
}
