package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/name")
	public String getUser() {
		return "This is user service...!";
	}
	
	@GetMapping("/external")
	public String callNestedSevice() {
		String uri = "http://product/product/getProduct";
		String data = restTemplate.getForObject(uri, String.class);
		return "External Call Response : " + data;
	}
}
