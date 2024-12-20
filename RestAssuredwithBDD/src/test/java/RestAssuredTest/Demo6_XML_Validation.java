package RestAssuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo6_XML_Validation {
	
	@Test(priority=0)
	void testSinglecontent() {
		
		given()
		.when()
		.get("url")
		.then()
		.body("CutomerId", equalTo("15"))
		.log().all();
		
		
		
	}
	
	@Test(priority=1,enabled= true)
	void testMulticontent() {
		
		given()
		.when()
		.get("url")
		.then()
		.body("Customer.Id", equalTo("15"))
		.body("Customer.FN", equalTo("Bill"))
		.body("Customer.LN", equalTo("Anand"))
		.body("Customer.city", equalTo("Seattle"));
		
		
	}
	
	//verifying all xml content in single method//(through text() method)
	@Test(priority=2)
void testMulticontentXMl() {
		
		given()
		.when()
		.get("url")
		.then()
		.body("Customer.text()", equalTo("15 Bill Anannd Seattle"));
		
		
	}

    //find values in XML path in XML Response//

@Test(priority=3)
	void testUsing_XPATH() {
		given()
		.when()
		.get("url")
		.then()
		.body(hasXPath("/customer/firstname",containsString ("Bill")));
		
		
	}
			//(through text() method))
@Test(priority=4)
	void testUsingXpath2() {
	given()
	.when()
	.get("url")
	.then()
	.body(hasXPath("/INVOICE/INVOICE[text()='30']"))
	.log().all();
	
		
	}
	

}
