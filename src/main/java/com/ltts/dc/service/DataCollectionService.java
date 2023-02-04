package com.ltts.dc.service;

import java.util.List;

import com.ltts.dc.entity.EducationalDetails;
import com.ltts.dc.entity.IncomeDetails;
import com.ltts.dc.entity.KidsDetails;

public interface DataCollectionService {

	public String findByAppId();

	public String getcaseID();

	public List<String> getPlanNames();

	public String saveEducationDetails(EducationalDetails details);

	public String savencomeDeatils(IncomeDetails incomeDetails);

	public String saveKidsDetails(KidsDetails kidsDetails);

}
