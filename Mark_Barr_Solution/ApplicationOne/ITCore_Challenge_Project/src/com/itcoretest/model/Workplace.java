package com.itcoretest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Workplace {
	
	private int spId;
	private int workers;
	private Float latitude; 
	private Float longitude; 
	
	public int getSpId() {
		return spId;
	}
	public void setSpId(int spId) {
		this.spId = spId;
	}
	public int getWorkers() {
		return workers;
	}
	public void setWorkers(int workers) {
		this.workers = workers;
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
