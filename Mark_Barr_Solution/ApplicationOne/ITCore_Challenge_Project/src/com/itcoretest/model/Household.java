package com.itcoretest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Household {
	
	private int spId;
	private long serialno;
	private String stcotrbg;
	private int hh_race;
	private int hh_income;
	private int hh_size;
	private int hh_age;
	private Float latitude; 
	private Float longitude; 
	
	public int getSpId() {
		return spId;
	}
	public void setSpId(int spId) {
		this.spId = spId;
	}
	public long getSerialno() {
		return serialno;
	}
	public void setSerialno(long serialno) {
		this.serialno = serialno;
	}
	public String getStcotrbg() {
		return stcotrbg;
	}
	public void setStcotrbg(String stcotrbg) {
		this.stcotrbg = stcotrbg;
	}
	public int getHh_race() {
		return hh_race;
	}
	public void setHh_race(int hh_race) {
		this.hh_race = hh_race;
	}
	public int getHh_income() {
		return hh_income;
	}
	public void setHh_income(int hh_income) {
		this.hh_income = hh_income;
	}
	public int getHh_size() {
		return hh_size;
	}
	public void setHh_size(int hh_size) {
		this.hh_size = hh_size;
	}
	public int getHh_age() {
		return hh_age;
	}
	public void setHh_age(int hh_age) {
		this.hh_age = hh_age;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	
}
