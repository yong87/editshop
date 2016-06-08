package cls.order.entity;

import mapper.order.OrderMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;
import vo.Order;

public class OrderEntity implements intfc.order.entity.OrderEntity{

	public boolean addProductOrder(Order order){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.commit();
			sqlSession.close();
		}
		
		return false;
	}
	
	
	
	
	// --------------------------------------- 
	
	// make by hyun
	@Override
	public boolean exchange(String ordernumber) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			orderMapper.exchange(ordernumber);
			
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
	public Order getOrder(String ordernumber) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		vo.Order order = new vo.Order();
		
		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			order = orderMapper.getOrder(ordernumber);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			sqlsession.close();
		}
		return order;
	}

	@Override
	public boolean newExchangeOrder(Order order) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			orderMapper.newExchangeOrder(order);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
		
	}
	
	
	
	// ---------------------------------------
	
	
	
	
	
}
