package shop.intfc.certification.entity;

import vo.CertificationVO;

public interface CertificationEntityInter {

	public boolean addCertification(CertificationVO certification);
	public boolean modifyCertification(CertificationVO certification);
	public String getCertificationByUserId(String id);
	
}
