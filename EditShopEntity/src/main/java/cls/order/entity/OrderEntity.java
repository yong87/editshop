package cls.order.entity;

import intfc.order.entity.OrderEntityInter;

import java.util.Map;

import mapper.order.OrderMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;
import vo.Delivery;
import vo.Order;
import vo.OrderInfo;

public class OrderEntity implements OrderEntityInter{

	
	/**
	 * 주문 생성
	 */
	public boolean newOrderProduct(Order order){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.newOrderProduct(order);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 주문생성후 time찍는 method
	 */
	public boolean newOrderTime(OrderInfo order){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.newOrderTime(order);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 주문생성후 주문정보 입력  method
	 */
	public boolean addDeliveryInfo(Delivery delivery){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.addDeliveryInfo(delivery);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 주문정보 수정하는 method
	 */
	public boolean modifyDeliveryInfo(Delivery delivery){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.modifyDeliveryInfo(delivery);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
		
	}
	
	/**
	 * 결제후 결제 시간을 찍는 method
	 */
	public boolean orderPaymentTime(OrderInfo order){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.orderPaymentTime(order);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
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

	@Override
	public String getLastOrdernumber(String offend) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		String returnStr = null;
		
		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			returnStr = orderMapper.getLastOrdernumber(offend);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			sqlsession.close();
		}
		return returnStr;
		
	}

	@Override
	public boolean addExchangeLog(Map<String, String> param) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		
		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			orderMapper.addExchangeLog(param);
			
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
	
	@Override
	public boolean cancelOrder(String ordernumber) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			orderMapper.cancelOrder(ordernumber);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}
	
	public boolean returnOrder(String ordernumber){
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			orderMapper.returnOrder(ordernumber);
			
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
