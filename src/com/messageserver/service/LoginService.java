/**
 * 
 */
package com.messageserver.service;

import com.messageserver.entity.Login;
import com.messageserver.exception.MessageDaoException;

/**
 * @author Deep's
 *
 */
public interface LoginService {

	public boolean authLoginService(Login login)throws MessageDaoException;
}
