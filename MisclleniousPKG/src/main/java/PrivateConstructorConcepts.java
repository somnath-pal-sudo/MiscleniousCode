
public class PrivateConstructorConcepts {
	
	int age;
	
	static {
		PrivateConstructorConcepts object= new PrivateConstructorConcepts();
	
	}
	public static int createObject() {
		int age=20;
		return age;
	}
	

	public static void main(String[] args) {
		PrivateConstructorConcepts obj= new PrivateConstructorConcepts();
		obj.age=30;
		System.out.println(obj.age);
		
		
		

	}
	

}


