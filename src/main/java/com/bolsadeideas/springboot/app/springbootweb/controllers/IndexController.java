package com.bolsadeideas.springboot.app.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
//	@RequestMapping( value = "/index", method = RequestMethod.GET )
//	public String index() {
//		return "index";
//	}
	
//	@GetMapping( value = "/index" )
//	public String index() {
//		return "index";
//	}
	
//	@PostMapping( value = "/index" )
//	public String index() {
//		return "index";
//	}
	
	@GetMapping( { "/index", "/", "/home" } )
	public String index() {
		return "index";
	}
}
