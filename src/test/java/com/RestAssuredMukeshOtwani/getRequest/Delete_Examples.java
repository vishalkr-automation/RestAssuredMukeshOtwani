package com.RestAssuredMukeshOtwani.getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_Examples {

	
	@Test
	public void test(){
		RequestSpecification request=RestAssured.given();
		Response response=request.delete("http://localhost:3000/posts/21");
		int code=response.getStatusCode();
		Assert.assertEquals(code, 200);
		
	}
}
