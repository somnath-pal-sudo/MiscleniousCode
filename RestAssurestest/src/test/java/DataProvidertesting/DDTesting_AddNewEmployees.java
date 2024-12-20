package DataProvidertesting;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class DDTesting_AddNewEmployees {
	
	@SuppressWarnings("unchecked")
	@Test(dataProvider="empdataprovider")
	void post_addEmployees(String ename, String esal, String eage) {
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/create";
		RequestSpecification httprequest=RestAssured.given();
		
		JSONObject requestparams= new JSONObject();
		requestparams.put("name", "john123");
		requestparams.put("salary", "10000");
		requestparams.put("age", "29");
		
		httprequest.header("Content-Type","application/json");
		
		httprequest.body(requestparams.toJSONString());	
		
		Response response=httprequest.request(Method.POST,"/craete");
		//Response get_response=httprequest.request(Method.GET,"/employees");
		
		
		
		String responsebody=response.getBody().asString();
		Assert.assertEquals(responsebody.contains("ename"),true);
		
		/*
		 * String get_responsebody=get_response.getBody().asString();
		 * Assert.assertEquals(get_responsebody.contains("john123"),true);
		 */
		

		}
	@DataProvider(name="empdataprovider")
		String[][] getEmpDetails() {
		
			@SuppressWarnings("unused")
			String path="C:\\Users\\v-sompa\\eclipse-workspace\\RestAssurestest\\src\\test\\java\\DataProvidertesting\\Excelreader.java";
			 String Empdata[][]= {{"abx123","1000","20"},{"acd12","190","10"},{"acde1","500","29"}};
			 return (Empdata);
		}
	}

		
		
		
		
		
		
		
		
		
		
	


