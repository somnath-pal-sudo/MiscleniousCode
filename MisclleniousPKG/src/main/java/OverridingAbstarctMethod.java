
public abstract class OverridingAbstarctMethod {
	
	public void display() {
		System.out.println("print non-abstract method");
	}
	
	public abstract  void display2();
}
	
	
	 class demo extends OverridingAbstarctMethod{
		
		
		public void display2() {
			System.out.println("overriding method2");
		}

	 public static void main(String[] args) {
			
			
			OverridingAbstarctMethod d= new demo();
			d.display();
			d.display2();
	

}
	 }

