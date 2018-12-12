package com.demo.demoApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class demoController {
	
	@RequestMapping(value = "/getData",method = RequestMethod.GET)
	public String getData() {
		
		return "Demo project";
		
	}

}
