package com.itcoretest.dao;


import java.util.List;

import com.itcoretest.model.School;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class SchoolDAOImpl extends SqlSessionDaoSupport implements SchoolDAO {

	@Override
    public School getById(int spId) {
        return (School) getSqlSession().selectOne("com.itcoretest.dao.schoolDAO.getById", spId);
    }

	@Override
	public List<School> getAll() {
		return (List<School>) getSqlSession().selectList("com.itcoretest.dao.schoolDAO.getAll");
	}

	@Override
	public List<School> findByName(String schoolName) {
		return (List<School>) getSqlSession().selectList("com.itcoretest.dao.schoolDAO.findByName", schoolName);
	}


}
