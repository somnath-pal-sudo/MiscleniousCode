package RestAssuredTest;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo4_Delete_req {
	
	
	@Test
	public void delete_Req() {
		
		
		RestAssured.baseURI="";
		RestAssured.basePath="/delete/11201";
		
		Response response=
		
		given() //no dot symbol//
		.when()
		.delete()
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all()
		.extract().response();
		
		String jsonresponse=response.asString();
		assert.assertTrue(jsonresponse.contains("Deleted Successfully"), true);
		
		
		
		
	}

}
