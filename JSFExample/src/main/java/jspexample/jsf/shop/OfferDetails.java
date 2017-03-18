package main.java.jspexample.jsf.shop;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ViewScoped
public class OfferDetails implements Serializable {
	
	private static final long serial = 1L;
	
	@Inject
	private OfferService offferService;
	
	private long offerId;
	
	private Offer offer;

	
    public void onload() {
        offer = offferService.getOffer(offerId);
    }


	public long getOfferId() {
		return offerId;
	}


	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}


	public Offer getOffer() {
		return offer;
	}
    
    
}
