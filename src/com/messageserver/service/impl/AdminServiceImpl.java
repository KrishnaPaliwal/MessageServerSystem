package com.messageserver.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.messageserver.dao.AdminDao;
import com.messageserver.dto.OrganizationDto;
import com.messageserver.dto.PrincipalDTO;
import com.messageserver.entity.Address;
import com.messageserver.entity.Login;
import com.messageserver.entity.Organization;
import com.messageserver.entity.Principal;
import com.messageserver.exception.MessageDaoException;
import com.messageserver.service.AdminService;

@Component("adminservice")
public class AdminServiceImpl implements AdminService {

	@Autowired
	@Qualifier("admindao")
	private AdminDao adminDao;

	@Override
	public boolean createPrincipalService(PrincipalDTO dto) throws MessageDaoException {
		Principal principal = new Principal();
		Login login = new Login();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date date = null;
		try {
			date = sdf.parse(dto.getDob());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		principal.setDob(date);
		principal.setEmail(dto.getEmail());
		principal.setFirstName(dto.getFirstName());
		principal.setLastName(dto.getLastName());
		principal.setMobile(dto.getMobile());
		login.setPassword(dto.getPassword());
		login.setRole(dto.getRole());
		login.setUserName(dto.getUserName());
		principal.setLogin(login);
		adminDao.createPrincipalDao(principal);
		return false;
	}

	@Override
	public boolean createOrganizationService(OrganizationDto organizationDto) throws MessageDaoException {
		
		Organization organization=new Organization();
		Address address=new Address();
		organization.setDescription(organizationDto.getDescription());
		organization.setMotto(organizationDto.getMotto());
		organization.setOrgName(organizationDto.getOrgName());
		organization.setTelphone(organizationDto.getTelphone());
		address.setAddressLine1(organizationDto.getAddressLine1());
		address.setAddressLine2(organizationDto.getAddressLine2());
		address.setCity(organizationDto.getCity());
		address.setPostcode(organizationDto.getPostcode());
		organization.setOrgAddress(address);
		return adminDao.createOrganizationDao(organization);

	}

}
