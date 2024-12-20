package serializationDeserialization;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@SuppressWarnings("unused")
public class studentAPItest {
	
	
	  public HashMap map= new HashMap();
	  
	  @Test void CreateNewStudent() { map.put("id", 101); map.put("title",
	  "GoodBook"); map.put("url", "bookgeny.com"); map.put("thumbnailurl",
	  "https://via.placeholder.com/150/13454C");
	  
	  
	  
	  given() .contentType(ContentType.JSON) .body(map) .when()
	  .post("https://jsonplaceholder.typicode.com/photos") .then() .statusCode(201)
	  .assertThat() .body("msg", equalTo("user added"));
	  
	  
	  
	  
	  
	  }
	 
	@Test
	void getStudentRecords() {
		given()
		.get("https://jsonplaceholder.typicode.com/photos/5000")
		.then()
		.statusCode(200)
		.assertThat()
		.body("id", equalTo(5000));
	}
	
	
	
	
	
	

}
