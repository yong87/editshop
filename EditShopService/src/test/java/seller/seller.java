package seller;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shop.cls.seller.service.SellerAddService;
import vo.Seller;
import vo.SellerLang;

public class seller {

	private SellerAddService sas;

	@Before
    public void start() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        sas = ac.getBean("sellerAddService", SellerAddService.class);
    }
	
	@Test
	public void addTest() {
		Seller seller = new Seller();
		seller.setId("test4");
		seller.setStatus(1);
		System.out.println(sas.addSeller(seller));
	}

	@Test
	public void udpateTest() {
		Seller seller = new Seller();
		seller.setId("test4");
		Map<String, SellerLang> param = new HashMap<String, SellerLang>();

		SellerLang sl = new SellerLang();
//		sl.setName("한국");
//		sl.setAddress("한국");
//		sl.setId(seller.getId());
//		param.put("kor", sl);

		
		sl = new SellerLang();
		sl.setId(seller.getId());
		sl.setName("중꿔");
		sl.setAddress("중꿔말");
		param.put("chn", sl);

		// sl = new SellerLang();
		// sl.setId(seller.getId());
		// sl.setName("usa");
		// sl.setAddress("english");
		// param.put("eng", sl);

		sl = new SellerLang();
		sl.setId(seller.getId());
		sl.setName("日本");
		sl.setAddress("日本国");
		param.put("jpn", sl);

		System.out.println(sas.updateLanguage(param));
	}
}
