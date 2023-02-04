package com.ltts.dc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EDUCATIONDETAILS")
public class EducationalDetails {

	@Id
	@GeneratedValue
	private Integer eid;

	private String degree;

	private String univercityname;

	private String graduationyear;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUnivercityname() {
		return univercityname;
	}

	public void setUnivercityname(String univercityname) {
		this.univercityname = univercityname;
	}

	public String getGraduationyear() {
		return graduationyear;
	}

	public void setGraduationyear(String graduationyear) {
		this.graduationyear = graduationyear;
	}
	
	

}
