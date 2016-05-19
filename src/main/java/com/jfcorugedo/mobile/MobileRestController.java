package com.jfcorugedo.mobile;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/v1")
public class MobileRestController {

	@RequestMapping(path="/mobiles/{id}", method=GET)
	@ApiOperation(value="Returns the mobile with the given ID", produces="application/json")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Succcess"),
			@ApiResponse(code=404, message="Not found"),
	})
	public ResponseEntity<Mobile> getMobile(@PathVariable String id) {
		
		Mobile mobile = new Mobile()
							.setId("126")
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
