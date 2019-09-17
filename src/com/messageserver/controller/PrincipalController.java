package com.messageserver.controller;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.messageserver.dto.FacultyDto;
import com.messageserver.dto.SendMessageDto;
import com.messageserver.entity.Faculty;
import com.messageserver.entity.Management;
import com.messageserver.entity.Principal;
import com.messageserver.entity.Staff;
import com.messageserver.entity.Templates;
import com.messageserver.exception.MessageServiceException;
import com.messageserver.factory.EmailFactory;
import com.messageserver.factory.MessageFactory;
import com.messageserver.service.EmailService;
import com.messageserver.service.MessageService;
import com.messageserver.service.PrincipalService;
import com.messageserver.util.ExtrasUtil;

@Controller
public class PrincipalController {

	@Autowired
	@Qualifier("principalservice")
	private PrincipalService principalService;

	@RequestMapping(value = "/birthdayForm.action", method = RequestMethod.GET)
	public String getBirthDayPage(Model model) {
		model.addAttribute("principalCommand", new Principal());
		return "birthday";
	}

	@RequestMapping(value = "/birthdayForm.action", method = RequestMethod.POST)
	public String sendBirthDayWish(Model model) {
		return "birthday";
	}

	@RequestMapping(value = "/marriageAnniverseryForm.action", method = RequestMethod.GET)
	public String getMarriageAnniverseryPage(Model model) {
		model.addAttribute("principalCommand", new Principal());
		return "birthday";
	}

	@RequestMapping(value = "/marriageAnniverseryForm.action", method = RequestMethod.POST)
	public String sendMarriageAnniversaryWish(Model model) {
		return "birthday";
	}

	@RequestMapping(value = "/staffForm.action", method = RequestMethod.GET)
	public String getStaffCreatePage(Model model) {
		model.addAttribute("principalCommand", new Staff());
		return "birthday";
	}

	@RequestMapping(value = "/staffForm.action", method = RequestMethod.POST)
	public String saveStaff(Model model) {
		return "birthday";
	}

	@RequestMapping(value = "/facultyForm.action", method = RequestMethod.GET)
	public String getFacultyCreatePage(Model model) {
		model.addAttribute("standardMap", ExtrasUtil.getInstance().getStandardList());
		model.addAttribute("facultyCommand", new FacultyDto());
		return "faculty";
	}

	@RequestMapping(value = "/facultyForm.action", method = RequestMethod.POST)
	public String saveFaculty(@ModelAttribute("facultyCommand") FacultyDto facultyDto, Model model) {
		try {
			model.addAttribute("standardMap", ExtrasUtil.getInstance().getStandardList());
			if (principalService.createFacultyService(facultyDto)) {

				model.addAttribute("facultyCommand", new FacultyDto());

				model.addAttribute("message", "Faculty Created Successfully");
			}
		} catch (MessageServiceException e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
		}
		return "faculty";
	}

	@RequestMapping(value = "/templateForm.action", method = RequestMethod.GET)
	public String getTemplateCreatePage(Model model) {
		model.addAttribute("catagariesMap", ExtrasUtil.getInstance().getTemplateCatagaries());
		model.addAttribute("templateCommand", new Templates());
		return "template";
	}

	@RequestMapping(value = "/templateForm.action", method = RequestMethod.POST)
	public String saveTemplate(@ModelAttribute("templateCommand") Templates templates, Model model) {
		model.addAttribute("catagariesMap", ExtrasUtil.getInstance().getTemplateCatagaries());
		try {
			if (principalService.createTemplateService(templates)) {
				model.addAttribute("message", "Template Created Successfully...");
			} else {
				model.addAttribute("message", "Template creation Failed...");
			}
		} catch (MessageServiceException e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
		}

		return "template";

	}

	@RequestMapping(value = "/facultyListFom.action", method = RequestMethod.GET)
	public String getSendMessagePage(Model model) throws MessageServiceException {
		model.addAttribute("templateList", principalService.getTemplatesListService());

		try {

			ObjectMapper mapper = new ObjectMapper();

			String json = "";

			json = mapper.writeValueAsString(principalService.getTemplatesListService());

			model.addAttribute("list", json);
			List<Faculty> facultyList = principalService.getFacultyListService();
			model.addAttribute("facultyList", facultyList);
			model.addAttribute("sendMessageCommand", new SendMessageDto());

		} catch (MessageServiceException e) {
			e.printStackTrace();
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "sendMessageFaculty";
	}

	@RequestMapping(value = "/managementListFom.action", method = RequestMethod.GET)
	public String getManagementPage(Model model) throws MessageServiceException {

		model.addAttribute("templateList", principalService.getTemplatesListService());

		try {
			List<Management> managementList = principalService.getManagementListService();
			model.addAttribute("managementList", managementList);
			model.addAttribute("sendMessageCommand", new SendMessageDto());

		} catch (MessageServiceException e) {
			e.printStackTrace();
		}
		return "sendMessageManagement";
	}

	@RequestMapping(value = "/managementForm.action", method = RequestMethod.GET)
	public String getManagementCreatePage(Model model) {
		model.addAttribute("managementCommand", new Management());
		return "management";
	}

	@RequestMapping(value = "/managementForm.action", method = RequestMethod.POST)
	public String saveManagementPeople(@ModelAttribute("managementForm") Management management, Model model) {
		try {
			if (principalService.createManagementPeopleservice(management)) {
				model.addAttribute("message", " Created Successfully...");
			} else {
				model.addAttribute("message", "Creation Failed...");
			}
		} catch (MessageServiceException e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
		}
		return "management";
	}

	/**
	 * need to call third party integration message gateway
	 */
	@RequestMapping(value = "/studentForm.action", method = RequestMethod.POST)
	public String sendMessage(Model model) {
		MessageService message = new MessageFactory().getFactory("action");

		if (message != null) {
			message.execute();
		}
		return "birthday";
	}

	/**
	 * need to send email through Util class
	 */
	@RequestMapping(value = "/studentForm.action", method = RequestMethod.GET)
	public String sendEmail(Model model) {
		EmailService email = new EmailFactory().getFactory("action");
		if (email != null) {
			email.execute();
		}
		return "birthday";
	}

}