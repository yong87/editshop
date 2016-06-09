package cls.seller.service;

import java.util.Map;

import intfc.seller.entity.SellerAddEntityInter;
import vo.Seller;
import vo.SellerLang;

public class SellerAddService {

	SellerAddEntityInter sellerAddEntity = new cls.seller.entity.SellerAddEntity();
	
	public boolean addSeller(Seller seller) {
		return sellerAddEntity.addSeller(seller);
	}
	
	public boolean updateLanguage(Map<String, SellerLang> param) {
		SellerLang kor = param.get("kor");
		SellerLang chn = param.get("chn");
		SellerLang eng = param.get("eng");
		SellerLang jpn = param.get("jpn");
		
		if(!(kor == null)) {
			System.out.println("1");
			if(!sellerAddEntity.updateKr(kor)) return false;
		}
		if(!(eng == null)) {
			System.out.println("2");
			if(!sellerAddEntity.updateEn(eng)) return false;
		}
		if(!(chn == null)) {
			System.out.println("3");
			if(!sellerAddEntity.updateCn(chn)) return false;
		}
		if(!(jpn == null)) {
			System.out.println("4");
			if(!sellerAddEntity.updateJp(jpn)) return false;
		}
		
		return true;
	}
}
