package TCAll;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class TC001_Get_VideoGameAPI {
	
	
	@Test(priority=1)
	public void TC_VideogameApi() {
		given()
		.get("http://localhost:8080/app/videogames")
		.then()
		.statusCode(200);
	
	}
	
	@Test(priority=2)
	public void TC002_Post_VideoGameAPI() {
		
		HashMap map= new HashMap();
		map.put("id", 100);
		map.put("name", "Spider-Man2");
		map.put("releaseDate","2021-02-03T11:35:29.672Z");
		map.put("reviewScore", 2);
		map.put("category", "adventure");
		map.put("rating", "universal");
		
		Response response=given()
		.contentType("application/json")
		.body(map)
		.when()
		.post("http://localhost:8080/app/videogames")
		
		.then()
		.statusCode(200)
		.log().all()
		.extract().response();
		
		String JSONresponse=response.asString();
		Assert.assertEquals(JSONresponse.contains( "Record Added Successfully"), true);
	
	}
	
	
	
	
	

}
