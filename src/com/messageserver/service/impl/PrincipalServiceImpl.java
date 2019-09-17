package com.messageserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.messageserver.dao.PrincipalDao;
import com.messageserver.dto.FacultyDto;
import com.messageserver.entity.Faculty;
import com.messageserver.entity.Login;
import com.messageserver.entity.Management;
import com.messageserver.entity.Templates;
import com.messageserver.exception.MessageDaoException;
import com.messageserver.exception.MessageServiceException;
import com.messageserver.service.PrincipalService;
import com.messageserver.util.DateUtil;

@Component("principalservice")
public class PrincipalServiceImpl implements PrincipalService {

	@Autowired
	@Qualifier("principaldao")
	private PrincipalDao principalDao;

	@Override
	public boolean createFacultyService(FacultyDto dto) throws MessageServiceException {
		Faculty faculty = new Faculty();
		Login login = new Login();

		login.setPassword(dto.getPassword());
		login.setRole(dto.getRole());
		login.setUserName(dto.getUserName());
		faculty.setClassTeacherFor(dto.getClassTeacherFor());
		faculty.setDob(DateUtil.getInstance().getDateFromString(dto.getDob()));
		faculty.setEmail(dto.getEmail());
		faculty.setFirstName(dto.getFirstName());
		faculty.setLastName(dto.getLastName());
		faculty.setMobile(dto.getMobile());
		faculty.setLogin(login);
		try {

			if (principalDao.checkFacultyDao(dto.getClassTeacherFor())) {
				return principalDao.createFacultyDao(faculty);
			} else {
				throw new MessageServiceException("Class teacher already present for this standard");
			}
			// before returning need to send username and password for faculty
			// on successfull creation
		} catch (MessageDaoException e) {
			e.printStackTrace();
			throw new MessageServiceException("Failed to create Faculty please enter properly");
		}
	}

	@Override
	public boolean createTemplateService(Templates templates) throws MessageServiceException {

		try {
			if (templates.getCategary().equals("birthday") || templates.getCategary().equals("marriage")
					|| templates.getCategary().equals("attendence")) {
				if (principalDao.checkTemplate(templates.getCategary())) {
					return principalDao.createTemplateDao(templates);
				} else {
					throw new MessageServiceException("Template is already present");
				}
			} else {
				return principalDao.createTemplateDao(templates);
			}
		} catch (MessageDaoException e) {
			e.printStackTrace();
			throw new MessageServiceException("Template Creation failed");
		}
	}

	@Override
	public List<Faculty> getFacultyListService() throws MessageServiceException {
		try {
			return principalDao.getFacultyListDao();
		} catch (MessageDaoException e) {
			throw new MessageServiceException("Eror while getting faculty list from DB");

		}
	}

	@Override
	public boolean createManagementPeopleservice(Management manageMent) throws MessageServiceException {

		try {
			return principalDao.createManagementPeopleDao(manageMent);
		} catch (MessageDaoException e) {
			e.printStackTrace();

			throw new MessageServiceException("Error in DAO layer while ceating ..." + e);

		}

	}

	@Override
	public List<Management> getManagementListService() throws MessageServiceException {
		try {
			return principalDao.getManagementListDao();
		} catch (MessageDaoException e) {
			e.printStackTrace();
			throw new MessageServiceException("Error in DAO layer while getting ..." + e);
		}
	}

	@Override
	public List<Templates> getTemplatesListService() throws MessageServiceException {
		try {
			return principalDao.getTemplatesListDao();
		} catch (MessageDaoException e) {
			e.printStackTrace();
			throw new MessageServiceException("Error in DAO layer while getting ..." + e);

		}

	}
}
