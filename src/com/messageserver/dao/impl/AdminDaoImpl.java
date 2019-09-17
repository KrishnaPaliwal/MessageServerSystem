package com.messageserver.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.messageserver.dao.AdminDao;
import com.messageserver.entity.Organization;
import com.messageserver.entity.Principal;
import com.messageserver.exception.MessageDaoException;

@Component("admindao")
public class AdminDaoImpl implements AdminDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	private boolean status = false;

	@Override
	public boolean createPrincipalDao(Principal principal) throws MessageDaoException {

		hibernateTemplate.save(principal);
		status = Boolean.TRUE;
		return status;

	}

	@Override
	public boolean createOrganizationDao(Organization organization) {

		hibernateTemplate.save(organization);
		status = Boolean.TRUE;
		return status;
	}

}
