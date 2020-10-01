package com.boot.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * This Controller is implemented with Servlet and HttpSession API
 */
@Controller
public class ServletController {
	
	@RequestMapping("welcome-page")
	public String welcomePage() {
		System.out.println("inside ServletController : welcomePage");
		return "welcome-page";
	}
	
	
	//Servlet approach
	@RequestMapping("servlet-req-hello")
	public String servletRequest(HttpServletRequest request) {
	//public String servletRequest(HttpServletRequest request, HttpServletResponse response) {
		//we are not using response object here
		
		System.out.println("inside ServletController : servletRequest");
		HttpSession session = request.getSession();
		
		String input = request.getParameter("name");
		System.out.println("input = "+input);
		
		session.setAttribute("name", input);
		return "hello";
	}
	
	//HttpSession approach
	@RequestMapping("session-hello")
	public String sessionRequest(String input, HttpSession session) {
		
		System.out.println("inside ServletController : sessionRequest");
		System.out.println("input = "+input);

		session.setAttribute("name", input);
		return "hello";
	}
	
	//Spring with HttpSession approach
	@RequestMapping("req-param-hello")
	public String requestParamRequest(@RequestParam("name") String input, HttpSession session) {
		
		System.out.println("inside ServletController : requestParamRequest");
		System.out.println("input = "+input);

		session.setAttribute("name", input);
		return "hello";
	}

}
