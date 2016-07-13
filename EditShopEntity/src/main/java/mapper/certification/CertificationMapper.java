package mapper.certification;

import vo.CertificationVO;

public interface CertificationMapper {

	public boolean addCertification(CertificationVO certification);
	public boolean modifyCertification(CertificationVO certification);
	public String getCertificationByUserId(String id);
	
}
