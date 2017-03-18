package main.java.jspexample.jsf.shop;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PopularOffer {

	@Inject
	private OfferService offerService;
	
	private List<Offer> offers;
	
    @PostConstruct
    public void initialize() {
        offers = offerService.getPopularOffer();
    }

	public List<Offer> getOffers() {
		return offers;
	}
    
    
}
