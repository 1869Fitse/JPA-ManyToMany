package org.com.restassured.com.restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostPutdelete {
	
	@Test
	public void test1() {
		
		RequestSpecification request =RestAssured.given();
		request.header("Content-Type","application/ason");
		
		JSONObject json = new JSONObject();
		json.put("id", "255");
		json.put("title", "selenium");
		json.put("author", "Fitsum");
		
		request.body(json.toJSONString());
		
		Response response= request.post("https://api.github.com/users/1869Fitse");
		int code = response.statusCode();
		System.out.println(code);
		Assert.assertEquals(code, 201);
		
	}

}
