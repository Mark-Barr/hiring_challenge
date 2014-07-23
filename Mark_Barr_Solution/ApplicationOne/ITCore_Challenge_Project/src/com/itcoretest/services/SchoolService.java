package com.itcoretest.services;

import java.util.List;

import com.itcoretest.dao.SchoolDAO;
import com.itcoretest.model.School;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * SchoolService uses a mapper/dao to get records from the database.
 * 
 */
@Transactional
public class SchoolService {

    private SchoolDAO schoolDao;

    public void setSchoolDAO(SchoolDAO schoolDao) {
        this.schoolDao = schoolDao;
    }
    
    public SchoolDAO getSchoolDAO() {
        return this.schoolDao;
    }
    
    //methods

    public School getById(int schoolId) {
        return this.schoolDao.getById(schoolId);
    }

    public List<School> getAll(){
    	return this.schoolDao.getAll();
    }

	public List<School> findByName(String schoolName) {
		return this.schoolDao.findByName(schoolName);
	}
    


}
