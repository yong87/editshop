package seller;

import org.junit.Test;

import vo.Seller;
import vo.SellerLang;
import cls.seller.entity.SellerAddEntity;

public class SellerAdd {

	SellerAddEntity sa = new SellerAddEntity();

	@Test
	public void addTest() {
		Seller seller = new Seller();
		
		seller.setId("test2");
		
		System.out.println(sa.addSeller(seller));
		
	}
	
	@Test
	public void updateTEst() {
		SellerLang sl = new SellerLang();
		
		sl.setId("test2");
		sl.setName("testname");
		sl.setAddress("testaddress");
		sa.updateEn(sl);
	}
}
