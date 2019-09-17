/**
 * 
 */
package com.messageserver.dao;

import com.messageserver.entity.Login;
import com.messageserver.exception.MessageDaoException;

/**
 * @author Deep's
 *
 */
public interface LoginDao {

	public boolean authLoginDao(Login login) throws MessageDaoException;
}
