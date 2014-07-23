package com.itcoretest.dao;


import java.util.List;

import com.itcoretest.model.Workplace;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class WorkplaceDAOImpl extends SqlSessionDaoSupport implements WorkplaceDAO {

	@Override
    public Workplace getById(int spId) {
        return (Workplace) getSqlSession().selectOne("com.itcoretest.dao.workplaceDAO.getById", spId);
    }

	@Override
	public List<Workplace> getAll() {
		return (List<Workplace>) getSqlSession().selectList("com.itcoretest.dao.workplaceDAO.getAll");
	}


}
