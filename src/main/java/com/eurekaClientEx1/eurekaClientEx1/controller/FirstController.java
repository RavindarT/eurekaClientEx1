package com.eurekaClientEx1.eurekaClientEx1.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class FirstController {
	
	@Autowired
	public RestTemplate restTemplate;

	@GetMapping("/getSample")
	public String getSampleRequest(@RequestParam(required = false, name = "min", value = "min") Integer m){
		System.out.println("Comes here 1::::"+m);
		if(m != null) {
			try {
				Thread.sleep(1000*m);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		String responseEntity = restTemplate.getForObject("http://mysecondapp/getSample/", String.class);
//		System.out.println(responseEntity);
		return "comes here 1";
	}
}
