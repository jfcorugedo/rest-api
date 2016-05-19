package com.jfcorugedo.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestApiApplication.class)
@WebIntegrationTest("server.port:0")
@ActiveProfiles("integrationtest")
public class RestApiApplicationIT {

	@Test
	public void contextLoads() {
	}

}
