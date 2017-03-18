package main.java.jspexample.jsf.shop;

import java.io.Serializable;
import java.math.BigDecimal;

public final class Offer implements Serializable {

	private static final long serial = 1L;

	private final long id;
	private final String name;
	private final String shortDesc;
	private BigDecimal price;
	private final String imageAddress;
	
	public Offer(long id, String name, String shortDesc, BigDecimal price, String imageAddress) {
		super();
		this.id = id;
		this.name = name;
		this.shortDesc = shortDesc;
		this.price = price;
		this.imageAddress = imageAddress;
	}

	public static long getSerial() {
		return serial;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getImageAddress() {
		return imageAddress;
	}

    public String getShortDescription() {
        int i = shortDesc.indexOf('.');
        if (i >= 0 && i < 100) {
            return shortDesc.substring(0, i + 1);
        } else {
            return shortDesc.substring(0, Math.min(shortDesc.length(), 100)) + "...";
        }
    }	
	
}
