package com.messageserver.service;

import com.messageserver.dto.OrganizationDto;
import com.messageserver.dto.PrincipalDTO;
import com.messageserver.entity.Organization;
import com.messageserver.exception.MessageDaoException;

public interface AdminService {

	public boolean createPrincipalService(PrincipalDTO dto) throws MessageDaoException;
	public boolean createOrganizationService(OrganizationDto organization)throws MessageDaoException;
}
