package Abstarction;
//can't create object of interface class
//no need to write 'abstarct' keyword

public class BMW implements Car{

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW--start");
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW--stop");
		
		
	}

	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("BMW--refuel");
		
	}
	public void threatsafety() {
		System.out.println("threatsafety");
	}

}
