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
		boolean isModify = false;
		try{
			CertificationMapper mapper = session.getMapper(CertificationMapper.class);
			isModify = mapper.modifyCertification(certification);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return isModify;
	
	}

	@Override
	public CertificationVO getCertificationByUserId(String id) {
		// TODO Auto-generated method stub
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		CertificationVO vo = null;
		try{
			CertificationMapper mapper = session.getMapper(CertificationMapper.class);
			vo = mapper.getCertificationByUserId(id);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return vo;
		
	}
	
	public boolean existKey(String key){
		
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isModify = false;
		try{
			CertificationMapper mapper = session.getMapper(CertificationMapper.class);
			isModify = mapper.existKey(key);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return isModify; 
	}
}
