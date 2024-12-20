package RestAssuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class Demo1_Get_req {

	@Test
	public void getRequest() {
		
		given()
		.when()
		.get("https://samples.openweathermap.org/data/2.5/forecast?q=M%C3%BCnchen,DE&appid=439d4b804bc8187953eb36d2a8c26a02")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("city", equalTo("Altstadt"))
		.header("Content-Type","text/html; charset=UTF-8");
		
		
		
	}
}
