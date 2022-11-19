package com.RestAssuredMukeshOtwani.getRequest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetData2 {
	
	@Test
	public void testResponseCode(){
		
		int code=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
		
		System.out.println("Status Code is: "+ code);
		
		Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testBody(){
		
		String data=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
		System.out.println("Response Data is: "+ data);
		
		long time=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
		
		System.out.println("Response Time is: "+ time);
		
		
	}

}
