package certification;

import org.junit.Test;

import shop.cls.certification.entity.CertificationEntity;

public class CertificationTest {

	CertificationEntity entity = new CertificationEntity();
	
	@Test
	public void getCertificationByUserId(){
		System.out.println(entity.getCertificationByUserId("ttt"));
	}
	
}
