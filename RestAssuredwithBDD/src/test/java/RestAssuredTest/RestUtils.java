package RestAssuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getUserName() {
		String generatedString= RandomStringUtils.randomAlphabetic(3);
		return ("John" + generatedString);
	}
	public static String getPWD() {
		String generatedString= RandomStringUtils.randomAlphabetic(3);
		return ("John" + generatedString);
	}
	public static String getEmail() {
		String generatedString= RandomStringUtils.randomAlphabetic(3);
		return (generatedString + "gamil.com");
	}
	public static String empName() {
		String generatedString= RandomStringUtils.randomAlphabetic(3);
		return ("John" + generatedString);
	}
	public static String empSal() {
		String generatedString= RandomStringUtils.randomNumeric(1);
		return ( generatedString);
	}
	public static String empAge() {
		String generatedString= RandomStringUtils.randomNumeric(1);
		return (generatedString);
	}
	
	
	
	
	

}
