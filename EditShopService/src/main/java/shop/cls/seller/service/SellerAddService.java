package shop.cls.seller.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.intfc.seller.entity.SellerAddEntityInter;
import vo.Seller;
import vo.SellerLang;

@Service
public class SellerAddService implements SellerAddEntityInter{

	@Autowired
	SellerAddEntityInter sellerAddEntity;
	
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

	@Override
	public boolean updateKr(SellerLang sellerLang) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEn(SellerLang sellerLang) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCn(SellerLang sellerLang) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateJp(SellerLang sellerLang) {
		// TODO Auto-generated method stub
		return false;
	}
}
