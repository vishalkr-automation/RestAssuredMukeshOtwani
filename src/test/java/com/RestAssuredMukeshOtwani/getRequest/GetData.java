package com.RestAssuredMukeshOtwani.getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetData {
	
	@Test(enabled=true)
	public void testResponseCode(){
		
		Response res= RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		int code=res.getStatusCode();
		
		System.out.println("Status Code is: "+ code);
		
		Assert.assertEquals(code, 200);
	}
	
	@Test(enabled=true)
	public void testBody(){
		
		Response res= RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		String data=res.asString();
		
		System.out.println("Response Data is: "+ data);
		System.out.println("Response Time is: "+ res.getTime());
		
		
	}

}
