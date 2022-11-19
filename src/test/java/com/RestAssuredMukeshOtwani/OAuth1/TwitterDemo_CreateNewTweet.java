package com.RestAssuredMukeshOtwani.OAuth1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TwitterDemo_CreateNewTweet {
	
	@Test
	public void postTweet(){
		Response response = RestAssured.given()
		.auth()
		.oauth("pIyCs7CgnqQS9DIZcZqpFEURB",   //API Key
				"fGZ28RrSY1tIhc7Svkl0ml4LCYjVUYn95OQDG8NMx4InHXVybR",  //API Secret Key
				"758625380-j60ZacuN5dgnkENWVhlttv1ISl53MsncP5nDmfgA",  //Access Token
				"nit5FBDXBQtSX63lOIvJMn0PZQhXTIpGZU9X7hiaw4EwG")       //Access Token Secret
		.post("https://api.twitter.com/1.1/statuses/update.json?status=This is my First tweet via API");
		
		System.out.println(response.getStatusCode());
		/*System.out.println(response.getBody().asString());*/
		
		System.out.println(response.jsonPath().prettify());
		
		JsonPath json=response.jsonPath();
		String tweetId=json.get("id_str");
		System.out.println("My tweet Id is: "+ tweetId);
	}

}
