/**
 * 
 */
package com.messageserver.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.messageserver.dao.LoginDao;
import com.messageserver.entity.Login;
import com.messageserver.exception.MessageDaoException;

@Component("logindao")
public class LoginDaoImpl implements LoginDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	static Logger log = Logger.getLogger(LoginDaoImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public boolean authLoginDao(Login login) throws MessageDaoException {
		List<Login> list = new ArrayList<Login>();
		String hql = "from Login l where l.userName=? and  l.password=? and l.role=?";
		Object[] params = { login.getUserName(), login.getPassword(), login.getRole() };
		try {
			list = hibernateTemplate.find(hql, params);
		} catch (Exception e) {
			throw new MessageDaoException("Exception in DaoIMPL layer");
		}
		return list != null&&(!list.isEmpty()) ? Boolean.TRUE : Boolean.FALSE;
	}
}
