package shop.cls.order.entity;

import java.util.Map;

import mapper.order.OrderMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;
import shop.intfc.order.entity.OrderEntityInter;
import vo.Delivery;
import vo.Order;

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
	public boolean newOrderTime(String ordernumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.newOrderTime(ordernumber);
			
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
	public boolean orderPaymentTime(String ordernumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.orderPaymentTime(ordernumber);
			
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
	 * 구매 확정
	 */
	@Override
	public boolean buyconfirmStatus(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.buyconfirmStatus(ordernumber);
			
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
	 * 결제 전 : 50
	 */
	public boolean beforePaymentStatus(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.beforePaymentStatus(ordernumber);
			
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
	 * 결재후 : 51
	 */
	public boolean afterPaymentStatus(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.afterPaymentStatus(ordernumber);
			
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
	 * 배송정보 미입력시 52
	 */
	public boolean beforeInsertAddress(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.beforeInsertAddress(ordernumber);
			
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
	 * 물품 확인시 : 53
	 */
	public boolean checkOrderbySeller(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.checkOrderbySeller(ordernumber);
			
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
	 * 배송물품 준비 : 54
	 */
	public boolean readyProductbySeller(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.readyProductbySeller(ordernumber);
			
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
	 * 배송 시작시 : 55
	 */
	public boolean startDelivery(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.startDelivery(ordernumber);
			
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
	 * 배송중시 Status : 56
	 */
	public boolean sendDelivery(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.sendDelivery(ordernumber);
			
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
	 * 배송완료시 Status : 57
	 */
	public boolean completeDelivery(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.completeDelivery(ordernumber);
			
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
	 * 교환시 Status : 58
	 */
	public boolean exchangeStatus(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.exchangeStatus(ordernumber);
			
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
	 * 취소시 status 59
	 */
	public boolean cancelOrderStatus(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.cancelOrderStatus(ordernumber);
			
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
	 * 환불시 Status : 60
	 */
	public boolean refundStatus(String ordernumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.refundStatus(ordernumber);
			
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
