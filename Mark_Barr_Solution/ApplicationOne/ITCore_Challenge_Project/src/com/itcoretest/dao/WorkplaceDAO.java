package com.itcoretest.dao;

import java.util.List;

import com.itcoretest.model.Workplace;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

public interface WorkplaceDAO {

	Workplace getById(int workplaceId);
    
    List<Workplace> getAll();

}