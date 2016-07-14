package shop.intfc.certification.entity;

import vo.CertificationVO;

public interface CertificationEntityInter {

	public boolean addCertification(CertificationVO certification);
	public boolean modifyCertification(CertificationVO certification);
	public CertificationVO getCertificationByUserId(String id);
	public boolean existKey(String key);
}
