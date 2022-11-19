package com.RestAssuredMukeshOtwani.OAuth2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetManulAccessToken {

	
	@Test
	public void testExample(){
		
		Response response=RestAssured
				.given()
				.auth()
				.oauth2("487fb83e25f4e55e7460899978b3aee6d6e00b2d") //Access Token
				.post("http://coop.apps.symfonycasts.com/api/406/chickens-feed"); //API URL+UserID+EndPoint
		
		System.out.println("Code "+response.getStatusCode());
		System.out.println("Body Message: "+response.getBody().asString());
		
		
	}
}
