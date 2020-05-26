package com.eurekaClientEx1.eurekaClientEx1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class FirstController {
	
	@Autowired
	public RestTemplate restTemplate;

	@GetMapping("/getSample")
	public String getSampleRequest(){
		System.out.println("Comes here 1");
		
//		String responseEntity = restTemplate.getForObject("http://mysecondapp/getSample/", String.class);
//		System.out.println(responseEntity);
		return "comes here 1";
	}
}
