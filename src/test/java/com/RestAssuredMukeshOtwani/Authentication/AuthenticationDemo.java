package com.RestAssuredMukeshOtwani.Authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AuthenticationDemo {
	
	@Test
	public void f(){
		int code=RestAssured.given()
				.auth().preemptive()
				.basic("ToolsQA", "TestPassword")
				.when()
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
				.getStatusCode();
		
		System.out.println("Response Code from the server is: "+code);
	}

}
