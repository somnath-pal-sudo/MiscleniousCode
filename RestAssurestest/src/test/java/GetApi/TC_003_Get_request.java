package GetApi;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_003_Get_request {
	@Test
	void GoogleMapApi() {
		//specify base URI
		RestAssured.baseURI="https://www.google.com/maps/search/Groceries/";
		//request object
		RequestSpecification httprequest= RestAssured.given();
		
		//response object
		Response response=httprequest.request(Method.GET,"/@23.2351942,87.0545037,13z/data=!3m1!4b1");
		
		//print response in console window//
	String responsebody=response.getBody().asString();
	System.out.println("responsebody is "+ responsebody);
	
	int StatusCode=response.getStatusCode();
	System.out.println("Successfull status code "+ StatusCode);
	Assert.assertEquals(StatusCode, 200);
	
	String StatusLine=response.getStatusLine();
	System.out.println("Successfull ststusline" +StatusLine );
	Assert.assertEquals(StatusLine, "HTTP/1.1 200 OK");
	
	//validating headers//
	String ContentType=response.header("Content-Type");
	System.out.println("content-Type is " + ContentType);
	Assert.assertEquals(ContentType, "text/html; charset=UTF-8");
	
	
	String contentencoding=response.header("Content-Encoding");
	System.out.println("content-encoding is "+ contentencoding);
	Assert.assertEquals(contentencoding, "gzip");

	

}
}
