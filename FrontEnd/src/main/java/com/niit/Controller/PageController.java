package com.niit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	
	@RequestMapping("/")
	public String getIndexPage()
	{
		return "index";
	}
	@RequestMapping("/aboutus")
	public String getAboutusPage()
	{
		return"aboutus";
	}
	@RequestMapping("/ContactUs")
	public String getContactUsPage()
	{
		return"ContactUs";
	}
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	@RequestMapping("/loginerror")
	public String loginError(Model model){
		model.addAttribute("loginError","Invalid email/password");
		return "login";
	}
	@RequestMapping(value="/logout")
	public String logout(Model model){
		model.addAttribute("message","Loggedout successfully..");
		return "login";
	}


	
}
