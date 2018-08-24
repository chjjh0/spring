package com.gms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
@RequestMapping("/member")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@RequestMapping("/add")
	public void add() {}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve")
	public void retrieve() {}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping("/modify")
	public void modify() {}
	@RequestMapping("/remove")
	public void remove() {}
	@RequestMapping("/login")
	public String login() {
		logger.info("MembeController login");
		return "retrieve:member/retrieve.tiles";
	}
	@RequestMapping("/logout")
	public String logout() {
		logger.info("MembeController logout");
		return "redirect:/";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}