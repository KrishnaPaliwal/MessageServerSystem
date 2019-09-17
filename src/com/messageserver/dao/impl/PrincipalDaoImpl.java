package com.messageserver.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.messageserver.dao.PrincipalDao;
import com.messageserver.entity.Faculty;
import com.messageserver.entity.Login;
import com.messageserver.entity.Management;
import com.messageserver.entity.Templates;
import com.messageserver.exception.MessageDaoException;

@Component("principaldao")
public class PrincipalDaoImpl implements PrincipalDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	private boolean status = false;

	@Override
	public boolean createFacultyDao(Faculty faculty) throws MessageDaoException {
		hibernateTemplate.save(faculty);
		status = Boolean.TRUE;
		return status;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkFacultyDao(String standard) throws MessageDaoException {
		List<Faculty> list = new ArrayList<Faculty>();
		String hql = "from Faculty f where f.classTeacherFor=?";
		Object[] params = { standard };
		try {
			list = hibernateTemplate.find(hql, params);
		} catch (Exception e) {
			throw new MessageDaoException("Exception in DaoIMPL layer");
		}
		return list == null || list.isEmpty() ? Boolean.TRUE : Boolean.FALSE;
	}

	@Override
	public boolean createTemplateDao(Templates templates) throws MessageDaoException {

		hibernateTemplate.save(templates);
		status = Boolean.TRUE;
		return status;

	}

	@Override
	public boolean checkTemplate(String catagary) throws MessageDaoException {
		List<Faculty> list = new ArrayList<Faculty>();
		String hql = "from Templates t where t.categary=?";
		Object[] params = { catagary };
		try {
			list = hibernateTemplate.find(hql, params);
		} catch (Exception e) {
			throw new MessageDaoException("Exception in DaoIMPL layer");
		}
		return list == null || list.isEmpty() ? Boolean.TRUE : Boolean.FALSE;
	}

	@Override
	public List<Faculty> getFacultyListDao() throws MessageDaoException {
		List<Faculty> facultyList=new ArrayList<>();
		String hql = "from Faculty f";
		facultyList = hibernateTemplate.find(hql);
		return facultyList;
	}

	@Override
	public boolean createManagementPeopleDao(Management manageMent) throws MessageDaoException {
		hibernateTemplate.save(manageMent);
		status = Boolean.TRUE;
		return status;
	}

	@Override
	public List<Management> getManagementListDao() throws MessageDaoException {
		List<Management> managementList=new ArrayList<>();
		String hql = "from Management m";
		managementList = hibernateTemplate.find(hql);
		return managementList;
	}

	@Override
	public List<Templates> getTemplatesListDao() throws MessageDaoException {
		List<Templates> templateList=new ArrayList<>();
		String hql = "from Templates t";
		templateList = hibernateTemplate.find(hql);
		return templateList;
		
	}

}
