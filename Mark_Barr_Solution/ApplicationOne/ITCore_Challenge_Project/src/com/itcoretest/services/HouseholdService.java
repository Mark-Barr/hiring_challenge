package com.itcoretest.services;

import java.util.List;
import com.itcoretest.dao.HouseholdDAO;
import com.itcoretest.model.Household;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * HouseholdService uses a mapper/dao to get records from the database.
 * 
 */
@Transactional
public class HouseholdService {

    private HouseholdDAO householdDao;

    public void setHouseholdDAO(HouseholdDAO householdDao) {
        this.householdDao = householdDao;
    }
    
    public HouseholdDAO getHouseholdDAO() {
        return this.householdDao;
    }
    
    //methods

    public Household getById(int householdId) {
        return this.householdDao.getById(householdId);
    }

    public List<Household> getAll(){
    	return this.householdDao.getAll();
    }
    


}
