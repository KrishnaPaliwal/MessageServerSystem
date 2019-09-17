/**
 * 
 */
package com.messageserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.messageserver.dto.OrganizationDto;
import com.messageserver.dto.PrincipalDTO;
import com.messageserver.entity.Organization;
import com.messageserver.entity.Principal;
import com.messageserver.exception.MessageDaoException;
import com.messageserver.service.AdminService;

/**
 * @author M1022158
 *
 */
@Controller
public class AdminController {

	@Autowired
	@Qualifier("adminservice")
	private AdminService adminService;

	@RequestMapping(value = "/principalForm.action", method = RequestMethod.GET)
	public String getPrincipalPage(Model model) {
		model.addAttribute("principalCommand", new PrincipalDTO());
		return "principal";
	}

	@RequestMapping(value = "/principalForm.action", method = RequestMethod.POST)
	public String savePrincipal(@ModelAttribute("principalCommand") PrincipalDTO principalDTO, Model model) {

		try {
			if (adminService.createPrincipalService(principalDTO)) {

				model.addAttribute("message", "principal created successfully");
			}
		} catch (MessageDaoException e) {
			System.out.println(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}
		return "principal";
	}

	@RequestMapping(value = "/organizationForm.action", method = RequestMethod.GET)
	public String getOrganizationPage(Model model) {
		model.addAttribute("organizationCommand", new OrganizationDto());
		return "organization";
	}

	@RequestMapping(value = "/organizationForm.action", method = RequestMethod.POST)
	public String saveOrganization(@ModelAttribute("organizationCommand") OrganizationDto organizationDto, Model model) {
		
		try {
			if(adminService.createOrganizationService(organizationDto)){
				
				model.addAttribute("message", "Organization created successfully");
				model.addAttribute("organizationCommand", new OrganizationDto());
			}
		} catch (MessageDaoException e) {
			e.printStackTrace();
			
			model.addAttribute("message", e.getMessage());
			model.addAttribute("organizationCommand", new OrganizationDto());
		}
		return "organization";
	}

}
