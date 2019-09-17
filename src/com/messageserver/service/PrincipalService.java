package com.messageserver.service;

import java.util.List;

import com.messageserver.dto.FacultyDto;
import com.messageserver.entity.Faculty;
import com.messageserver.entity.Management;
import com.messageserver.entity.Templates;
import com.messageserver.exception.MessageServiceException;

public interface PrincipalService {

	public boolean createFacultyService(FacultyDto dto) throws MessageServiceException;

	public boolean createTemplateService(Templates templates) throws MessageServiceException;

	public List<Faculty> getFacultyListService() throws MessageServiceException;

	public boolean createManagementPeopleservice(Management manageMent) throws MessageServiceException;
	
	public List<Management> getManagementListService() throws MessageServiceException;
	
	public List<Templates> getTemplatesListService() throws MessageServiceException;
}
