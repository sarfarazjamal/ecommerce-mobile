package com.jamal.ecommerce.dto;

public class ReleaseDTO {
	private String announceDate;

	private int priceEur;

	public void setAnnounceDate(String announceDate) {
		this.announceDate = announceDate;
	}

	public String getAnnounceDate() {
		return this.announceDate;
	}

	public void setPriceEur(int priceEur) {
		this.priceEur = priceEur;
	}

	public int getPriceEur() {
		return this.priceEur;
	}
}
