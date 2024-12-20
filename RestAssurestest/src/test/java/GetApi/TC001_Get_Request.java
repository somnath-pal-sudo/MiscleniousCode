package GetApi;

import org.junit.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_Get_Request {
	
	@Test
	void getweatherDetails() {
		//specify base URI
		RestAssured.baseURI="https://demoqa.com/weather/city";
		//request object
		RequestSpecification httprequest= RestAssured.given();
		
		//response object
		Response response=httprequest.request(Method.GET,"/Hyderabad");
		
		//print response in console window//
	String responsebody=response.getBody().asString();
	System.out.println("responsebody is "+ responsebody);
	
	int StatusCode=response.getStatusCode();
	System.out.println("Successfull status code "+ StatusCode);
	Assert.assertEquals(StatusCode, 200);
	
	String StatusLine=response.getStatusLine();
	System.out.println("Successfull ststusline" +StatusLine );
	Assert.assertEquals(StatusLine, "HTTP/1.1 200 OK");

		
	}

}
