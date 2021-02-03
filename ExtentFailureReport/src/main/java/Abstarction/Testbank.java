package Abstarction;

public class Testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank hb= new HDFCBank();
		hb.credit();
		hb.loan();
		hb.debit();
		bank b=new HDFCBank();//dynamic polymorphism
		b.credit();
		b.debit();
		b.loan();
		b.funds();//not accesible ,it's a part of HDFC own implementation

	}

}
