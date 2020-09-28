package com.jamal.ecommerce.dto;

public class MobileDTO {
	private int id;

    private String brand;

    private String phone;

    private String picture;

    private ReleaseDTO release;

    private String sim;

    private String resolution;

    private HardwareDTO hardware;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPicture(String picture){
        this.picture = picture;
    }
    public String getPicture(){
        return this.picture;
    }
    public void setRelease(ReleaseDTO release){
        this.release = release;
    }
    public ReleaseDTO getRelease(){
        return this.release;
    }
    public void setSim(String sim){
        this.sim = sim;
    }
    public String getSim(){
        return this.sim;
    }
    public void setResolution(String resolution){
        this.resolution = resolution;
    }
    public String getResolution(){
        return this.resolution;
    }
    public void setHardware(HardwareDTO hardware){
        this.hardware = hardware;
    }
    public HardwareDTO getHardware(){
        return this.hardware;
    }
}
