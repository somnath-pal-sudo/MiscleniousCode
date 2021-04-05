interface IImplement{
	final int i=10;
	void run();
	default void run2() {
		
		System.out.println("default method");
	}


class TestClass implements IImplement{

	@Override
	public void run() {
		System.out.println("Print Imp method");
		
	}
}
	
	public static void main(String[] args) {
		TestClass t= new TestClass();
		t.run();
		t.run2();
		
		
	}
}
	

