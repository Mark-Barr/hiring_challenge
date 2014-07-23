package com.itcoretest.dao;


import java.util.List;

import com.itcoretest.model.Household;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class HouseholdDAOImpl extends SqlSessionDaoSupport implements HouseholdDAO {

	@Override
    public Household getById(int spId) {
        return (Household) getSqlSession().selectOne("com.itcoretest.dao.householdDAO.getById", spId);
    }

	@Override
	public List<Household> getAll() {
		return (List<Household>) getSqlSession().selectList("com.itcoretest.dao.householdDAO.getAll");
	}


}
