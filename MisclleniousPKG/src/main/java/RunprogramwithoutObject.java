

import org.testng.annotations.Test;
public class RunprogramwithoutObject {
	
	static {
		System.out.println("StaticBlock");
	}
	
	
	@Test
	public static void test() {
		System.out.println("testing method");
	}
	
	public static void cover() {//static block calling another static method inside it//
		System.out.println("cover method");
		test();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");
		test();
		//RunprogramwithoutObject.test();// no need to create any object of class
		cover();

	}

}
