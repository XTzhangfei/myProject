package com.xue.springservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class MyController {
	@RequestMapping("/hello")
	public String hello(){
		
		return "hello!!!spring-service";
	}
}
