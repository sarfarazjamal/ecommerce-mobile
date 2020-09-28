package com.jamal.ecommerce.dto;

public class HardwareDTO {
	private String audioJack;

	private String gps;

	private String battery;

	public void setAudioJack(String audioJack) {
		this.audioJack = audioJack;
	}

	public String getAudioJack() {
		return this.audioJack;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public String getGps() {
		return this.gps;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getBattery() {
		return this.battery;
	}
}
