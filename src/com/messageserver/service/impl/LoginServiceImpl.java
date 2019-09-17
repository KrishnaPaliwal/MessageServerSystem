/**
 * 
 */
package com.messageserver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.messageserver.dao.LoginDao;
import com.messageserver.entity.Login;
import com.messageserver.exception.MessageDaoException;
import com.messageserver.service.LoginService;

@Component("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	@Qualifier("logindao")
	private LoginDao logindao;

	@Override
	public boolean authLoginService(Login login) throws MessageDaoException {

		if (logindao.authLoginDao(login)) {
			return true;
		} else {
			throw new MessageDaoException("Authentication failed");
		}

	}

}
