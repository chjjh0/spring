package com.gms.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes("context")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "/")	//attribute의 method = RequestMethod.GET 생략 가능
	public String home(HttpSession session, HttpServletRequest request) {
		String context = request.getContextPath();
		logger.info("Welcome home! The Context Path is {}.", context);
		session.setAttribute("context", context);
		//model.addAttribute("context", "");
		
		return "main";
	}
	
}
