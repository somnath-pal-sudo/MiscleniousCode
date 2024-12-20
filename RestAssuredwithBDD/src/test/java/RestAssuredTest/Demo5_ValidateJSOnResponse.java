package RestAssuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo5_ValidateJSOnResponse {
	
	
	@Test(priority=1)
	public void testStatusCode() {
		
		
		when()
		  .get("https://jsonplaceholder.typicode.com/posts/5")
		.then()
		   .statusCode(200)
		   .log().all();
	
	}
	@Test(priority=2)
	public void test_log_response() {
		
		given()
			.when()
			.get("https://jsonplaceholder.typicode.com/posts/2")
			.then()
			.statusCode(200)
			.log().all();
		
		
	}
	
	
	//verifying single content in body//
	
	
	@Test(priority=3)
	public void test_SingleContent() {
		
		given()
		.when()
		.get("https://jsonplaceholder.typicode.com/posts/5")
		.then()
		.statusCode(200)
		.body("title", equalTo("nesciunt quas odio"));

		
	}
	
	//verifying multiple content in json body//
	@Test(priority=4)
public void test_MultiContent() {
		
		given()
		.when()
		.get("https://jsonplaceholder.typicode.com/posts")
		.then()
		.statusCode(200)
		.body("title", hasItems("sunt aut facere repellat provident occaecati excepturi optio reprehenderit","qui est esse","eum et est occaecati"));

		
	}
	
	
	//setting parameters and headers to request//
	
	@Test(priority=5)
public void test_Params_Headres() {
		
		given()
		.param("myName","p1")
		.header("MyHeader","p2")
		.get("https://jsonplaceholder.typicode.com/posts")
		.then()
		.statusCode(200)
		.body("title", hasItems("sunt aut facere repellat provident occaecati excepturi optio reprehenderit","qui est esse","eum et est occaecati"));

		
	}
	
	

}
