package GetApi;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_007_Auth_API {
	@Test
	public void authAPItest() {
		RestAssured.baseURI="http://restapi.demoqa.com/CheckforAuthentication";
		
		//basic authentication from rest-assured//
		
		PreemptiveBasicAuthScheme authscheme= new PreemptiveBasicAuthScheme();
		authscheme.setUserName("toolsqa");
		authscheme.setPassword("pass-1");
		RestAssured.authentication=authscheme;
		
		 RequestSpecification httprequest= RestAssured.given();
		 Response response=httprequest.request(Method.GET,"/");
		 
		 String responsebody=response.getBody().asString();
			System.out.println("responsebody is "+ responsebody);
		 
		 
		 int StatusCode=response.getStatusCode();
			System.out.println("Successfull status code "+ StatusCode);
			Assert.assertEquals(StatusCode, 200);
		 
	}
		
}
