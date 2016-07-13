package vo;

import java.sql.Timestamp;

public class CertificationVO {

	private String id;
	private String key;
	private Timestamp limitKeyTime;
	private int status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Timestamp getLimitKeyTime() {
		return limitKeyTime;
	}
	public void setLimitKeyTime(Timestamp limitKeyTime) {
		this.limitKeyTime = limitKeyTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "CertificationVO [id=" + id + ", key=" + key + ", limitKeyTime="
				+ limitKeyTime + ", status=" + status + "]";
	}
	
}
