package com.messageserver.dao;

import com.messageserver.entity.Organization;
import com.messageserver.entity.Principal;
import com.messageserver.exception.MessageDaoException;

public interface AdminDao {

	public boolean createPrincipalDao(Principal principal) throws MessageDaoException;

	public boolean createOrganizationDao(Organization organization) throws MessageDaoException;

}
