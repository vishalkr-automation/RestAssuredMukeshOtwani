package com.RestAssuredMukeshOtwani.OAuth1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TwitterDemo_DeleteTweet {
	
	@Test
	public void postTweet(){
		Response response = RestAssured.given()
		.auth()
		.oauth("gLwVCpEHurbfwBqYLKNjmNg0I",   //API Key
				"FIIWOrEWTZdNByuTQh6fJ4N1CoNoxnMNtu61ge8Mfzx5mxLbz2",  //API Secret Key
				"1172821773827461125-oIbn06MkttNVsPjBNjZLNFbmr8gXtc",  //Access Token
				"K3qI7XLomlv1Q4e1Oj8SGzcRhlWF35yv4hrbmaoH7kweC")  //Access Token Secret
		.post("https://api.twitter.com/1.1/statuses/destroy/1172862241026256901.json"); 
		
		System.out.println(response.getStatusCode());
		/*System.out.println(response.getBody().asString());*/
		
		System.out.println(response.jsonPath().prettify());
		
		JsonPath json=response.jsonPath();
		String tweetId=json.get("id_str");
		System.out.println("My tweet Id is: "+ tweetId);
	}

}
