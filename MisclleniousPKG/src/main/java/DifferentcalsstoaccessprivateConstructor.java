
public class DifferentcalsstoaccessprivateConstructor {

	public static void main(String[] args) {
		int i=PrivateConstructorConcepts.createObject();
		System.out.println(i);
		
		ExecutionofCodewithoutMain e= new ExecutionofCodewithoutMain();
		System.out.println(ExecutionofCodewithoutMain.age);
		

	}

}
