package com.itcoretest.services;

import java.util.List;
import com.itcoretest.dao.PeopleDAO;
import com.itcoretest.model.People;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * PeopleService uses a mapper/dao to get records from the database.
 * 
 */
@Transactional
public class PeopleService {

    private PeopleDAO peopleDao;

    public void setPeopleDAO(PeopleDAO peopleDao) {
        this.peopleDao = peopleDao;
    }
    
    public PeopleDAO getPeopleDAO() {
        return this.peopleDao;
    }
    
    //methods

    public People getById(int peopleId) {
        return this.peopleDao.getById(peopleId);
    }

    public List<People> getAll(){
    	return this.peopleDao.getAll();
    }
    


}
