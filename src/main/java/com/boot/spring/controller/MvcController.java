package com.boot.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	
	@RequestMapping("mvc-request")
	//public ModelAndView mvcRequest(@RequestParam("input-req") String inputRequest) {
	// input-req is an invalid parameter. This should follow Java variable rules
	public ModelAndView mvcRequest(@RequestParam("input_req") String inputRequest) {

		System.out.println("inside MvcController : mvcRequest");
		System.out.println("input = "+inputRequest);
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("input_req", inputRequest);
		mv.setViewName("front");
		return mv;
		
	}

}
