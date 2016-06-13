package vo;

import java.sql.Timestamp;

public class OrderInfo {

	private String ordernumber;
	private Timestamp buyTime;
	private Timestamp paymentTime;
	private Timestamp delieveryTime;
	private Timestamp complainTime;
	private Timestamp completeTime;
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public Timestamp getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Timestamp buyTime) {
		this.buyTime = buyTime;
	}
	public Timestamp getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(Timestamp paymentTime) {
		this.paymentTime = paymentTime;
	}
	public Timestamp getDelieveryTime() {
		return delieveryTime;
	}
	public void setDelieveryTime(Timestamp delieveryTime) {
		this.delieveryTime = delieveryTime;
	}
	public Timestamp getComplainTime() {
		return complainTime;
	}
	public void setComplainTime(Timestamp complainTime) {
		this.complainTime = complainTime;
	}
	public Timestamp getCompleteTime() {
		return completeTime;
	}
	public void setCompleteTime(Timestamp completeTime) {
		this.completeTime = completeTime;
	}
	@Override
	public String toString() {
		return "OrderInfo [ordernumber=" + ordernumber + ", buyTime=" + buyTime
				+ ", paymentTime=" + paymentTime + ", delieveryTime="
				+ delieveryTime + ", complainTime=" + complainTime
				+ ", completeTime=" + completeTime + "]";
	}
	
	
	
}
