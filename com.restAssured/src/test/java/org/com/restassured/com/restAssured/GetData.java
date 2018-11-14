package org.com.restassured.com.restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	

		@Test
		public void testResponseCode() {
			Response resp = RestAssured.get("https://api.github.com/users");
	        int code =resp.statusCode();
	        String data =resp.asString();
	        System.out.println(data);
	        
	        System.out.println("code is " + code);
	        Assert.assertEquals(code, 200);
	        
	       long time = resp.time();
	       System.out.println(time);
	       
	       
	        
	      
	        
	       

	}
}



