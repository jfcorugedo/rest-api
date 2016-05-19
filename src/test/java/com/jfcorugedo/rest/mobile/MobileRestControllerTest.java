package com.jfcorugedo.rest.mobile;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class MobileRestControllerTest {

	@Test
	public void getMobileById() {
		
		given()
			.standaloneSetup(new MobileRestController()).
		when()
			.get("/v1/mobiles/126").
		then()
			.statusCode(200)
			.body("id", equalTo("126"))
			.and().body("name", equalTo("IPhone 6S"))
			.and().body("brand", equalTo("Apple"))
			.and().body("color", equalTo("Silver"))
			.and().body("price", equalTo(745f))
			.and().body("plan.id", equalTo("125"))
			.and().body("plan.name", equalTo("Super Plan"))
			.and().body("plan.installment", equalTo(30f))
			.and().body("plan.freeMB", equalTo(2048))
			.and().body("plan.freeMinutes", equalTo(Integer.MAX_VALUE));
		
	}
}
