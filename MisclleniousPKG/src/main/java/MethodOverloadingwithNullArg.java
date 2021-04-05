
public class MethodOverloadingwithNullArg {
	
	public static void main(String a[]) {
		
		test(null);
		
	}
	
	public static void test(Object o) {
		System.out.println("object arg");
	}
	public static void test(String s) {
		System.out.println("object arg1");
	}
	

}
