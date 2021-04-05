

import org.testng.annotations.Test;
public class MethodOverloadingwithNullArg {
	
	public static void main(String a[]) {
		
		test(null);
		
	}
	
	@Test
	public static void test(Object o) {
		System.out.println("object arg");
	}
	@Test
	public static void test(String s) {
		System.out.println("object arg1");
	}
	

}
