package com.RestAssuredMukeshOtwani.getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Examples {

	
	@Test
	public void test(){
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json=new JSONObject();
		json.put("id", "25");
		json.put("title", "Selenium WebDriver");
		json.put("author", "Learn Automation");
		
		request.body(json.toString());
		
		
		Response response=request.post("http://localhost:3000/posts");
		int code=response.getStatusCode();
		Assert.assertEquals(code, 201);
	}
}
