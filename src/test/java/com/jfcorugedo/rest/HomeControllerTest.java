package com.jfcorugedo.rest;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.*;

import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.jfcorugedo.rest.HomeController;

public class HomeControllerTest {

	@Test
	public void rootPathRedirectsToSwaggerUI() {
		
		given()
			.standaloneSetup(new HomeController()).
		when()
			.get("/").
		then()
			.statusCode(302)
			.header("location", equalTo("swagger-ui.html"));
			
	}
}
