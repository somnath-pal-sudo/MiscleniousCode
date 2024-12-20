package RestAssuredTest;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class Demo3_Put_req {
	
	@SuppressWarnings("rawtypes")
	public static HashMap map= new HashMap();
	
	String empname=RestUtils.empName();
	String empage= RestUtils.empAge();
	String empsal= RestUtils.empSal();
	int emp_id=1001;
	
	@BeforeClass
	public void putdata() {
		
		map.put("name", empname);
		map.put("Salary", empsal);
		map.put("age", empage);
		
		RestAssured.baseURI="";
		RestAssured.basePath="/update/"+emp_id;

		
	}
	
	public void testput() {
		
		given()
		.contentType("application/json")
		.body(map)
		.when()
		.put()
		.then()
		.statusCode(200)
		.log().all();
	}

}
