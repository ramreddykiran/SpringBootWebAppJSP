package com.boot.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {
	
	@RequestMapping("welcome-page")
	public String welcomePage() {
		System.out.println("inside Controller : welcomePage");
		return "welcome-page";
	}
	
	
	//Servlet approach
	@RequestMapping("hello")
	public String requestReceive(HttpServletRequest request) {
		System.out.println("inside Controller : requestReceive");
		HttpSession session = request.getSession();
		
		String input = request.getParameter("name");
		System.out.println("input = "+input);
		
		session.setAttribute("name", input);
		return "hello";
	}

}
