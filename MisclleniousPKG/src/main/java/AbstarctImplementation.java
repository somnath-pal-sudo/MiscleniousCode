
public abstract class AbstarctImplementation {
	
	void AbstarctImplementation() {
		System.out.println("Abatsrct constructor");//constructor
	}
	
	abstract void run();
	
	void changeGear() {
		
		System.out.println("non abstract method");
		
	}
	
	
	static class Honda extends  AbstarctImplementation{

		@Override
		void run() {
			System.out.println("child class method");
			
		}
	
	}
	
	
	public  static void main(String[] args) {
		
		AbstarctImplementation ai= new Honda();//dynamic polymorphism
		ai.changeGear();
		ai.run();
		
		
		

	
	}
}
