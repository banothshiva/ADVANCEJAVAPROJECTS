package com.project;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.Base64;

public class Product 
{
	private String proId;
	private String proName;
	private double proPrice;
	private String proBrand;
	private String proMadeIn;
	private Date proMfgDate;
	private Date proExpDate;
	private InputStream proImage;
	
	private byte[] readImage;
	
	public String getReadImage()
	{
		return Base64.getEncoder().encodeToString(readImage);
			}
	
	public void setReadImage(byte[] readImage)
	{
		this.readImage=readImage;
	}
	
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public String getProBrand() {
		return proBrand;
	}
	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}
	public String getProMadeIn() {
		return proMadeIn;
	}
	public void setProMadeIn(String proMadeIn) {
		this.proMadeIn = proMadeIn;
	}
	public Date getProMfgDate() {
		return proMfgDate;
	}
	public void setProMfgDate(Date proMfgDate) {
		this.proMfgDate = proMfgDate;
	}
	public Date getProExpDate() {
		return proExpDate;
	}
	public void setProExpDate(Date proExpDate) {
		this.proExpDate = proExpDate;
	}
	public InputStream getProImage() {
		return proImage;
	}
	public void setProImage(InputStream proImage) {
		this.proImage = proImage;
	}
	
	//converting image to base 64
    public String getBase64ProductImage() {
        try {
            return Base64.getEncoder().encodeToString(proImage.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }



	
	
	
	






}
