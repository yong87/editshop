package vo;

import java.sql.Timestamp;
import java.util.Map;

public class Seller {

	private String id;
	private String licensenumber;
	private String telephone;
	private int status;
	private Timestamp jointime;
	private Timestamp lastvisittime;
	private int parcelcode;
	
	private Map<String, SellerLang> languageList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLicensenumber() {
		return licensenumber;
	}

	public void setLicensenumber(String licensenumber) {
		this.licensenumber = licensenumber;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getJointime() {
		return jointime;
	}

	public void setJointime(Timestamp jointime) {
		this.jointime = jointime;
	}

	public Timestamp getLastvisittime() {
		return lastvisittime;
	}

	public void setLastvisittime(Timestamp lastvisittime) {
		this.lastvisittime = lastvisittime;
	}

	public int getParcelcode() {
		return parcelcode;
	}

	public void setParcelcode(int parcelcode) {
		this.parcelcode = parcelcode;
	}

	public Map<String, SellerLang> getLanguageList() {
		return languageList;
	}

	public void setLanguageList(Map<String, SellerLang> languageList) {
		this.languageList = languageList;
	}

	
	
	
}
