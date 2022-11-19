package com.RestAssuredMukeshOtwani.OAuth2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetAutomaticallyAccessToken {

	
	@Test(enabled=true)
	public void accessPositiveAPI() {

		Response response = RestAssured.given().formParam("client_id", "Mukesh")
				.formParam("client_secret", "1081bee6ce5bf1f910552b4d6ebffe04")
				.formParam("grant_type", "client_credentials").post("http://coop.apps.symfonycasts.com/token");

		System.out.println(response.jsonPath().prettify());

		String token = response.jsonPath().get("access_token");

		Response response2 = RestAssured.given().auth().oauth2(token)
				.post("http://coop.apps.symfonycasts.com/api/406/chickens-feed");

		System.out.println("Code " + response2.getStatusCode());
		System.out.println("Body Message: " + response2.getBody().asString());
		Assert.assertEquals(response2.getStatusCode(), 200);

	}
	
	@Test(enabled=false)
	public void accessNegativeAPI() {

		Response response = RestAssured.given().formParam("client_id", "Mukesh")
				.formParam("client_secret", "1081bee6ce5bf1f910552b4d6ebffe04")
				.formParam("grant_type", "client_credentials").post("http://coop.apps.symfonycasts.com/token");

		System.out.println(response.jsonPath().prettify());

		String token = response.jsonPath().get("access_token");

		Response response2 = RestAssured.given().auth().oauth2(token)
				.post("http://coop.apps.symfonycasts.com/api/406/eggs-collect");

		System.out.println("Code " + response2.getStatusCode());
		System.out.println("Body Message: " + response2.getBody().asString());
		
		Assert.assertEquals(response2.getStatusCode(), 200);

	}
}
