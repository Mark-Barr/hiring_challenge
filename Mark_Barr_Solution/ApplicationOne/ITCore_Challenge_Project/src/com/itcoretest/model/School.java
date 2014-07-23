package com.itcoretest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class School {
	
	private int spId;
	private String schoolName;
	private String stAbbr;
	private String address;
	private String city;
	private String county;
	private String zipcode;
	private String zip4;
	private String ncesId; 
	private int total;
	private int prek;
	private int kinder;
	private int gro01Gr12;
	private int ungraded;
	private Float latitude; 
	private Float longitude; 
	private String infoSource;
	private int stco;
	
	public School()
	{
		
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getStAbbr() {
		return stAbbr;
	}
	public void setStAbbr(String stAbbr) {
		this.stAbbr = stAbbr;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getZip4() {
		return zip4;
	}
	public void setZip4(String zip4) {
		this.zip4 = zip4;
	}
	public String getNcesId() {
		return ncesId;
	}
	public void setNcesId(String ncesId) {
		this.ncesId = ncesId;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPrek() {
		return prek;
	}
	public void setPrek(int prek) {
		this.prek = prek;
	}
	public int getKinder() {
		return kinder;
	}
	public void setKinder(int kinder) {
		this.kinder = kinder;
	}
	public int getGro01Gr12() {
		return gro01Gr12;
	}
	public void setGro01Gr12(int gro01Gr12) {
		this.gro01Gr12 = gro01Gr12;
	}
	public int getUngraded() {
		return ungraded;
	}
	public void setUngraded(int ungraded) {
		this.ungraded = ungraded;
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
	public String getInfoSource() {
		return infoSource;
	}
	public void setInfoSource(String infoSource) {
		this.infoSource = infoSource;
	}
	public int getStco() {
		return stco;
	}
	public void setStco(int stco) {
		this.stco = stco;
	}
	public int getSpId() {
		return spId;
	}
	public void setSpId(int spId) {
		this.spId = spId;
	}
	


}
