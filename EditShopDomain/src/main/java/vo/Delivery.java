package vo;

public class Delivery {

	
	private String ordernumber;
	private String name;
	private String address;
	private String phone;
	private String memo;
	private int status;
	private String invoice;
	private int parcelCode;
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public int getParcelCode() {
		return parcelCode;
	}
	public void setParcelCode(int parcelCode) {
		this.parcelCode = parcelCode;
	}
	@Override
	public String toString() {
		return "Delivery [ordernumber=" + ordernumber + ", name=" + name
				+ ", address=" + address + ", phone=" + phone + ", memo="
				+ memo + ", status=" + status + ", invoice=" + invoice
				+ ", parcelCode=" + parcelCode + "]";
	}
	
	
}
