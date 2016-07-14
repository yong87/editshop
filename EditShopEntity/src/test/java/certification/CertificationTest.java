package certification;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

import shop.cls.certification.entity.CertificationEntity;
import vo.CertificationVO;

public class CertificationTest {

	CertificationEntity entity = new CertificationEntity();
	
	@Test
	public void addCertificationTest(){
		CertificationVO vo = new CertificationVO();
		vo.setId("inputtest1");
		vo.setKey("0011001100110011");
		vo.setLimitKeyTime(limitTime());
		vo.setStatus(10);
		
		System.out.println(entity.addCertification(vo));
	}
	
	@Test
	public void modifyCertificaionTest(){
		CertificationVO vo = new CertificationVO();
		vo.setId("inputtest1");
		vo.setKey("0011001100110011");
		System.out.println(entity.modifyCertification(vo));
	}
	
	@Test
	public void timeTest(){
		Timestamp time = limitTime();
		System.out.println(time.toString());
	}
	
	private Timestamp limitTime(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 15);
		
		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String calTime = formet.format(cal.getTime()).toString();
		Timestamp time = Timestamp.valueOf(calTime);
		return time;
	}
	
	@Test
	public void getCertificationByUserId(){
		CertificationVO vo = entity.getCertificationByUserId("ttt");
		System.out.println(vo.getId());
	}
	
	@Test
	public void existCertificationKeyTest(){
		System.out.println(entity.existKey("0"));
	}
}
