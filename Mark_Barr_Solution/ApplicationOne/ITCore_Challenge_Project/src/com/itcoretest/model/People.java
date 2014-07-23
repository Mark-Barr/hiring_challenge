package com.itcoretest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class People {

	private int spId;
	private int sp_hh_id;
	private long serialno;
	private String stcotrbg;
	private int age;
	private int sex;
	private int race;
	private int sporder;
	private int relate;
	private int sp_school_id;
	private int sp_work_id;
	
	public int getSpId() {
		return spId;
	}
	public void setSpId(int spId) {
		this.spId = spId;
	}
	public int getSp_hh_id() {
		return sp_hh_id;
	}
	public void setSp_hh_id(int sp_hh_id) {
		this.sp_hh_id = sp_hh_id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getRace() {
		return race;
	}
	public void setRace(int race) {
		this.race = race;
	}
	public int getSporder() {
		return sporder;
	}
	public void setSporder(int sporder) {
		this.sporder = sporder;
	}
	public int getRelate() {
		return relate;
	}
	public void setRelate(int relate) {
		this.relate = relate;
	}
	public int getSp_school_id() {
		return sp_school_id;
	}
	public void setSp_school_id(int sp_school_id) {
		this.sp_school_id = sp_school_id;
	}
	public int getSp_work_id() {
		return sp_work_id;
	}
	public void setSp_work_id(int sp_work_id) {
		this.sp_work_id = sp_work_id;
	}
}
