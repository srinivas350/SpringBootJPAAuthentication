package com.srinivas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String getSample()
	{
		return "sample";
	}
	
	@RequestMapping(path="/login")
	public String getLogin()
	{
		return "login";
	}
	@RequestMapping(path="/logout-success",method=RequestMethod.GET)
	public String getLogout()
	{
		return "logout";
	}

}
