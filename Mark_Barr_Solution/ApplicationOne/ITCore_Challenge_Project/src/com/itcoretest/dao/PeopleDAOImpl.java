package com.itcoretest.dao;


import java.util.List;

import com.itcoretest.model.People;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class PeopleDAOImpl extends SqlSessionDaoSupport implements PeopleDAO {

	@Override
    public People getById(int spId) {
        return (People) getSqlSession().selectOne("com.itcoretest.dao.peopleDAO.getById", spId);
    }

	@Override
	public List<People> getAll() {
		return (List<People>) getSqlSession().selectList("com.itcoretest.dao.peopleDAO.getAll");
	}


}
