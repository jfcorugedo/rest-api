package com.jfcorugedo.mobile;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MobileRestController {

	@RequestMapping("/mobiles/{id}")
	public ResponseEntity<Mobile> findOne(@PathVariable String id) {
		
		Mobile mobile = new Mobile()
							.setName("IPhone 6S")
							.setBrand("Apple")
							.setColor("Silver")
							.setPrice(745.0)
							.setPlan(new Plan(
										"125", 
										"Super Plan", 
										"More MB and more minutes. It's perfect to demanding users", 
										30.0, 
										Integer.MAX_VALUE, 
										2048));
		
		return new ResponseEntity<>(mobile, HttpStatus.OK);
	}
}
