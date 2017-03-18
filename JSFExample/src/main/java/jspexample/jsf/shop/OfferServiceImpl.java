package main.java.jspexample.jsf.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class OfferServiceImpl implements OfferService {

	private final Map<Long, Offer> offers;
	
	private final List<Offer> popularOffer;
	
	public OfferServiceImpl(){
		Map<Long, Offer> map = new HashMap<>();
		 map.put(1L, new Offer(1L, "Window", "Clean", new BigDecimal("10.00"), "CleanWindow"));
		 map.put(2L, new Offer(2L, "BlackWindow", "Dirty", new BigDecimal("20.00"), "DirtyWindow"));
    
		 offers = Collections.unmodifiableMap(map);
		 popularOffer = Collections.unmodifiableList(new ArrayList<>(offers.values()));
		 
	}
	
	@Override
	public List<Offer> getPopularOffer() {
		// TODO Auto-generated method stub
		return popularOffer;
	}

	@Override
	public Offer getOffer(long id) {
		// TODO Auto-generated method stub
		return offers.get(id);
	}
	

}
