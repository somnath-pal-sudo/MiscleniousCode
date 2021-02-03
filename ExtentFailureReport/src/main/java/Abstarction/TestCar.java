package Abstarction;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.threatsafety();
		
		Car c= new BMW();//Dynamic polymorphism
		c.start();
		c.stop();
		c.refuel();
		

	}

}
