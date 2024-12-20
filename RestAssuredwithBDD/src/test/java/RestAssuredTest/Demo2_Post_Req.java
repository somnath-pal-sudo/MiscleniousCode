package RestAssuredTest;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo2_Post_Req {
	
	public static HashMap map= new HashMap();

	
		
		@BeforeClass
       public void postdata() {
			
			map.put("firstName",RestUtils.getUserName());
			map.put("getPWD",RestUtils.getPWD());
			map.put("getEmail",RestUtils.getEmail());
			RestAssured.baseURI="URL";
			RestAssured.basePath="/register";
}
		
		@Test
		public void testpost() {
			
			given()
			.contentType("application/json")
			.body(map)
			
			.when()
			.post()
			
			.then()
			.statusCode(201)
			.and()
			.body("SuccesCode",equalTo("operraion sucesss"));
			
			
			
			
			
			
		}

		
	}


