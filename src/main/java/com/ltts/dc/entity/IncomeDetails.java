package com.ltts.dc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INCOMEDETAILS")
public class IncomeDetails {

	@Id
	@GeneratedValue
	private Integer incomeid;

	private Integer montlysalary;
	private Integer rentincome;
	private Integer propertyincome;
	public Integer getIncomeid() {
		return incomeid;
	}
	public void setIncomeid(Integer incomeid) {
		this.incomeid = incomeid;
	}
	public Integer getMontlysalary() {
		return montlysalary;
	}
	public void setMontlysalary(Integer montlysalary) {
		this.montlysalary = montlysalary;
	}
	public Integer getRentincome() {
		return rentincome;
	}
	public void setRentincome(Integer rentincome) {
		this.rentincome = rentincome;
	}
	public Integer getPropertyincome() {
		return propertyincome;
	}
	public void setPropertyincome(Integer propertyincome) {
		this.propertyincome = propertyincome;
	}
	

}
