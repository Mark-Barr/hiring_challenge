package com.itcoretest.dao;

import java.util.List;

import com.itcoretest.model.Household;


public interface HouseholdDAO {

    Household getById(int householdId);
    
  
    List<Household> getAll();


}