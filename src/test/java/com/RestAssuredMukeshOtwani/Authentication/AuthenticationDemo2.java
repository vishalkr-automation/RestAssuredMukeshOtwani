package com.RestAssuredMukeshOtwani.Authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AuthenticationDemo2 extends BaseClass {

	@Test
	public void f(){
		int code=RestAssured.given()
				.get()
				.getStatusCode();
		
		System.out.println("Response Code from the server is: "+code);
	}
}
