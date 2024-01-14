package com.takehome.locateAlpha;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LocateAlphaApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testGetAllNeighbourhoods() {
		ResponseEntity<String> response = restTemplate.getForEntity("/api/neighbourhoods", String.class);
		assertEquals("not sure", response.getStatusCode(), response.getBody());
		System.out.println(response.getBody());
		// Additional assertions...
	}

}
