package intfc.seller.entity;

import vo.Seller;
import vo.SellerLang;

public interface SellerAddEntityInter {

	public boolean addSeller(Seller seller);
	
	public boolean updateKr(SellerLang sellerLang);
	public boolean updateEn(SellerLang sellerLang);
	public boolean updateCn(SellerLang sellerLang);
	public boolean updateJp(SellerLang sellerLang);
}
