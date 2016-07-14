package mapper.certification;

import vo.CertificationVO;

public interface CertificationMapper {

	public boolean addCertification(CertificationVO certification);
	public boolean modifyCertification(CertificationVO certification);
	public CertificationVO getCertificationByUserId(String id);
	public boolean existKey(String key);
}
