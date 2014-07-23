package com.itcoretest.services;

import java.util.List;
import com.itcoretest.dao.WorkplaceDAO;
import com.itcoretest.model.Workplace;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * WorkplaceService uses a mapper/dao to get records from the database.
 * 
 */
@Transactional
public class WorkplaceService {

    private WorkplaceDAO workplaceDao;

    public void setWorkplaceDAO(WorkplaceDAO workplaceDao) {
        this.workplaceDao = workplaceDao;
    }
    
    public WorkplaceDAO getWorkplaceDAO() {
        return this.workplaceDao;
    }
    
    //methods

    public Workplace getById(int workplaceId) {
        return this.workplaceDao.getById(workplaceId);
    }

    public List<Workplace> getAll(){
    	return this.workplaceDao.getAll();
    }
   

}
