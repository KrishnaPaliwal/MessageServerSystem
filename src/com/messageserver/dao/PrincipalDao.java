package com.messageserver.dao;

import java.util.List;

import com.messageserver.entity.Faculty;
import com.messageserver.entity.Management;
import com.messageserver.entity.Templates;
import com.messageserver.exception.MessageDaoException;

public interface PrincipalDao {

	public boolean createFacultyDao(Faculty faculty) throws MessageDaoException;

	public boolean checkFacultyDao(String standard) throws MessageDaoException;

	public boolean createTemplateDao(Templates templates) throws MessageDaoException;

	public boolean checkTemplate(String catagary) throws MessageDaoException;

	public List<Faculty> getFacultyListDao() throws MessageDaoException;

	public boolean createManagementPeopleDao(Management manageMent) throws MessageDaoException;

	public List<Management> getManagementListDao() throws MessageDaoException;

	public List<Templates> getTemplatesListDao() throws MessageDaoException;
}
