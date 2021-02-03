package GetApi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_006_Get_ExatrctvaluesofEachNodeInJSON {
	
	@Test
	
	public void GetWeatherDetails() {
		 RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		 RequestSpecification httprequest= RestAssured.given();
		 
		 //response object//
		 
		 Response response=httprequest.request(Method.GET,"/Delhi");
		 
		 //Exatracting values from all nodes//
		JsonPath jsonpath= response.jsonPath();
		System.out.println(jsonpath.get("city"));
		System.out.println(jsonpath.get("Temperature"));
		 

}
	}

