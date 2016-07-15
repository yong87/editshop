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
	public void getCertificationByUserIdTest(){
		CertificationVO vo = new CertificationVO();
		vo.setId("ttt");
		vo.setKey("000100010001");
		CertificationVO	vo2 = entity.getCertificationByUserId(vo);
		System.out.println(vo2.toString());
	}
	
	@Test
	public void compareTime(){
		CertificationVO vo = new CertificationVO();
		vo.setId("krok3");
		vo.setKey("001100100011");
		CertificationVO	vo2 = entity.getCertificationByUserId(vo);
		Calendar cal = Calendar.getInstance();


		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String calTime = formet.format(cal.getTime()).toString();
		Timestamp s1 = Timestamp.valueOf(calTime);
		
		Timestamp s2 = vo2.getLimitKeyTime();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		
		System.out.println(s1.before(s2));
	}
	
	@Test
	public void existCertificationKeyTest(){
		System.out.println(entity.existKey("0"));
	}
}
