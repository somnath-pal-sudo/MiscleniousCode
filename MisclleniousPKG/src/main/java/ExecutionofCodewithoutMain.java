
public class ExecutionofCodewithoutMain {
	String name;
	static int age=100;
	
	static {
		ExecutionofCodewithoutMain e1= new ExecutionofCodewithoutMain();
		e1.name="Somnath";//create object to call through member String variable
		age=100;//no need to call through object bcz of static member variable
		
		System.out.println(e1.name + " " + e1.age);
		
	}
	
	static {
		System.out.println("Static1");
	}
	static {
		System.out.println("Static2");
	}
	static {
		System.out.println("Static3");
	}
	

}
