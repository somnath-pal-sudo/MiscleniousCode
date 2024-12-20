package GetApi;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_002_Post_Request {
	
	@Test
	@SuppressWarnings("unchecked")
	public void registrationSuccessful() {
		 RestAssured.baseURI="http://restapi.demoqa.com/customer";
		 RequestSpecification httprequest= RestAssured.given();
		 
		 //response object body--request payload
		 
		 JSONObject requestparams= new JSONObject();
		 requestparams.put("Firstname", "Somnath");
		 requestparams.put("Lastname", "pal");
		 requestparams.put("Username", "Somnathpal");
		 requestparams.put("Password", "xyz");
		 requestparams.put("Emailadd", "Somnath@gmail.com");
		 
		 //request type//
		 httprequest.header("Content-Type","application/json");
		 
		 //adding whole requestbody as JSONString//
		 httprequest.body(requestparams.toJSONString());
		 
		 //response body//
		 
		 Response response=httprequest.request(Method.POST,"/register");
		 
		 //verify response//
		    String responsebody=response.getBody().asString();
			System.out.println("responsebody is "+ responsebody);
			
			int StatusCode=response.getStatusCode();
			System.out.println("Successfull status code "+ StatusCode);
			Assert.assertEquals(StatusCode, 201);
			
			String StatusLine=response.getStatusLine();
			System.out.println("Successfull ststusline" +StatusLine );
			Assert.assertEquals(StatusLine, "HTTP/1.1 201 OK");
			
			String SuccessCode= response.jsonPath().get("SuccessCode");
			Assert.assertEquals(SuccessCode, "OPERATION SUCCESS");

				
	}

}

