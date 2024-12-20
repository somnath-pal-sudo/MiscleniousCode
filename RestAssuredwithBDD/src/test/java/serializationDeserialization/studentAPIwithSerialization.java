package serializationDeserialization;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class studentAPIwithSerialization {
	
	@Test(priority=0)
	public void createStudentWithSerialization() {
		
		
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("java");
		al.add("Selenium");
		
		
		Student std= new Student();
		std.setId(101);
		std.setFirstName("John");
		std.setLastname("Deo");
		std.setEmail("abc@gmail.com");
		std.setProgramme("CSE");
		std.setCourses(al);
		
		given()
		.contentType(ContentType.JSON)
		.body(std)
		.when()
		.post("url")
		.then()
		.statusCode(201)
		.assertThat().body("msg", equalTo("StudentAdded"));
	
		
	}
	
	//Deserialization Method
	@Test(groups= {"smoke"})
	void testStudentDeserialization() {
		
		Student stu=get("url").as(Student.class);
		System.out.println(stu.getstudentrecords());
		Assert.assertSame(stu.getId(), 101);
		
		
		
		
		
	}

}
