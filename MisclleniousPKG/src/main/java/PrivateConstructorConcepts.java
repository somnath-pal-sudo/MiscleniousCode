
public class PrivateConstructorConcepts {
	
	int age;
	
	static {
		PrivateConstructorConcepts object= new PrivateConstructorConcepts();
	
	}
	public static int createObject() {
		int age = 30;
		return age;
	}
	

	public static void main(String[] args) {
		PrivateConstructorConcepts obj= new PrivateConstructorConcepts();
		obj.age=20;
		System.out.println(obj.age);
		
		
		

	}
	

}


