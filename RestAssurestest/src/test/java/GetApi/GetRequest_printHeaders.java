package GetApi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest_printHeaders {
		
	@Test
	public void getweatherdetails() {
		
		RestAssured.baseURI="https://www.google.com/maps/search/Groceries/";
		//request object
		RequestSpecification httprequest= RestAssured.given();
		Response response=httprequest.request(Method.GET,"/@23.2351942,87.0545037,13z/data=!3m1!4b1");
		
		
		String responsebody=response.getBody().asString();
		System.out.println("responsebody is "+ responsebody);
		
		//How too print all the headers//(through MAP)
		
		Headers all_Headers=response.headers();
		
		for(Header header:all_Headers) {
			System.out.println(header.getName() + "" + header.getValue());
			
		}
		
		
		
	}

}
