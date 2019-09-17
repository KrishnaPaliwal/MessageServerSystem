package com.messageserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.messageserver.entity.Login;
import com.messageserver.service.LoginService;
import com.messageserver.util.ExtrasUtil;

@Controller
public class LoginController {

	@Autowired
	@Qualifier("loginService")
	private LoginService loginService;

	@RequestMapping(value = "/loginForm.action", method = RequestMethod.GET)
	public String getLoginPage(Model model) {
		model.addAttribute("loginCommand", new Login());
		model.addAttribute("roleMap", ExtrasUtil.getInstance().getRolesMap());
		return "login";
	}

	@RequestMapping(value = "/loginForm.action", method = RequestMethod.POST)
	public String authenticationUser(@ModelAttribute("loginCommand") Login loginData, Model model) {

		try {
			if (loginService.authLoginService(loginData)) {
				if (loginData.getRole().equals("admin")) {
					return "adminMenu";
				} else if (loginData.getRole().equals("principal")) {
					return "principalMenu";
				}else{
					return "facultyMenu";
				}
			} else {
				model.addAttribute("message", "please enter correct credentials");
				model.addAttribute("loginCommand", new Login());
				model.addAttribute("roleMap", ExtrasUtil.getInstance().getRolesMap());
			}
		} catch (Exception e) {
			model.addAttribute("message", "please enter correct credentials");
			model.addAttribute("loginCommand", new Login());
			model.addAttribute("roleMap", ExtrasUtil.getInstance().getRolesMap());
		}
		return "login";
	}
}
