package com.itcoretest.dao;

import java.util.List;

import com.itcoretest.model.People;


public interface PeopleDAO {

    People getById(int peopleId);
    
  
    List<People> getAll();


}