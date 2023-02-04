package com.ltts.dc.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "KIDSDETAILS")
public class KidsDetails {
	
	private List<String> kidName;
	private List<Integer> kidAge;
	private List<String> kidSSN;
	public List<String> getKidName() {
		return kidName;
	}
	public void setKidName(List<String> kidName) {
		this.kidName = kidName;
	}
	public List<Integer> getKidAge() {
		return kidAge;
	}
	public void setKidAge(List<Integer> kidAge) {
		this.kidAge = kidAge;
	}
	public List<String> getKidSSN() {
		return kidSSN;
	}
	public void setKidSSN(List<String> kidSSN) {
		this.kidSSN = kidSSN;
	}
	
	

}
