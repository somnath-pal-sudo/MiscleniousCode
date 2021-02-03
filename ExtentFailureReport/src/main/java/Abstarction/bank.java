package Abstarction;

public abstract class bank {
	public abstract void loan();
	int amt=1000;
	final int rate=3;
	static int loanrate=10;
	
	//partial abstraction
	//hiding the implementation logic
	//can't create object of abstarct class
	
	
	public void credit() {
		System.out.println("Bank--credit");
	}
	public void debit() {
		System.out.println("Bank--debit");
		
		
	}

	public void credit() {
		// TODO Auto-generated method stub
		
	}

	//protected abstract void debit();

	public void debit() {
		// TODO Auto-generated method stub
		
	}
	

}
