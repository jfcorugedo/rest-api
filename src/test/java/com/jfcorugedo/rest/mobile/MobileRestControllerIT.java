package com.jfcorugedo.rest.mobile;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jfcorugedo.rest.RestApiApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestApiApplication.class)
@WebIntegrationTest("server.port:0")
@ActiveProfiles("integrationtest")
public class MobileRestControllerIT {

	@Value("${local.server.port}")
    private int port;

	private URL base;

	@Before
	public void setUp() throws Exception {
		this.base = new URL("http://localhost:" + port);
	}
	
	@Test
	public void getMobile() {
		
		get(String.format("%s/v1/mobiles/126", base))
			.then()
			.assertThat()
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
