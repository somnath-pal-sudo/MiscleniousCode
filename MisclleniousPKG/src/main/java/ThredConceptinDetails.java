
public class ThredConceptinDetails {
	int total_seats=20;
	
	void bookSeat(int seats) {
		
		if(total_seats>=seats) {
			System.out.println( seats +"total seats booked successfully");
			total_seats=total_seats-seats;
			
			System.out.println("Seats left"+ seats);
			
		}
		else {
			System.out.println("Seats can't be booked");
		}
		
		
		
		
	}
	static class Bookmovie extends Thread{
		
		//static ThredConceptinDetails tc;
		int seatno;
		static ThredConceptinDetails tc;
		
		public void run() {
			
			tc.bookSeat(seatno);

			
		}
		
	}

	public static void main(String[] args) {
		
		ThredConceptinDetails tc = new ThredConceptinDetails();
		
		
		Bookmovie customer=new Bookmovie();
		customer.seatno=1;
		customer.start();
		
		Bookmovie customer2=new Bookmovie();
		customer2.seatno=2;
		customer2.start();
		

	}

}
