package src.main.java.jspexample.jsf.shop;

import java.util.List;

public interface OfferService {
	
	List<Offer> getPopularOffer();
	
	Offer getOffer(long id);
	

}
