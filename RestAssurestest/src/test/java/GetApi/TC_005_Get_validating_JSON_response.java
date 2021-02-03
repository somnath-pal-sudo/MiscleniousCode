package GetApi;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
//import io.restassured.http.Header;
//import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_005_Get_validating_JSON_response {
	@Test
	public void Get_validating_JSON_response() {
	
	
	RestAssured.baseURI="http://geodb-cities-api.wirefreethought.com/docs/api/get-city-details#/";
	//request object
	RequestSpecification httprequest= RestAssured.given();
	Response response=httprequest.request(Method.GET,"/v1/geo/cities/518");
	
	
	String responsebody=response.getBody().asString();
	System.out.println("responsebody is "+ responsebody);
	Assert.assertEquals(responsebody.contains("Farah"), true);
	
	
	
	
	
	

}
}
