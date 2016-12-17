package com.learn.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learn.model.User;
import com.learn.service.UserService;

@Controller
@SessionAttributes("name")
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping(value = "/list-users", method = RequestMethod.GET)
	public String showUsersList(ModelMap model) {
		model.addAttribute("users", service.retrieveAllUsers());
		return "list-users";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String showAddUserPage(ModelMap model) {
		model.addAttribute("user", new User());
		return "user";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String addUser(ModelMap model, @Valid User user, BindingResult result) {

		if (result.hasErrors()) {
			return "user";
		}

		service.addUser(user.getFirstName(), user.getLastName(), user.getFirstName() + user.getLastName(),
				user.getPassword(), user.getFirstName().toLowerCase() + user.getLastName().toLowerCase() + "@ness.com",
				new Date(), user.getActive());
		model.clear();
		return "redirect:list-users";
	}

	@RequestMapping(value = "/update-user", method = RequestMethod.GET)
	public String updateUser(ModelMap model, @RequestParam int id) {
		model.addAttribute("user", service.retrieveUser(id));
		return "user";
	}

	@RequestMapping(value = "/update-user", method = RequestMethod.POST)
	public String updateUser(ModelMap model, @Valid User user, BindingResult result) {

		if (result.hasErrors()) {
			return "user";
		}

		service.updateUser(user);
		model.clear();
		return "redirect:list-users";
	}

	@RequestMapping(value = "/delete-user", method = RequestMethod.GET)
	public String deleteUser(ModelMap model, @RequestParam int id) {
		service.deleteUser(id);
		model.clear();
		return "redirect:list-users";
	}

}
