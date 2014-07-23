package com.itcoretest.dao;

import java.util.List;

import com.itcoretest.model.School;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

public interface SchoolDAO {

    School getById(int schoolId);
    
  
    List<School> getAll();


	List<School> findByName(String schoolName);

}