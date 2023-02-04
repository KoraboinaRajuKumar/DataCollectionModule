package com.ltts.dc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.dc.entity.EducationalDetails;

public interface EducationalRepo extends JpaRepository<EducationalDetails, Serializable> {

}
