
public class NaNConcepts {
	
	
	//NaN-- for floating point operation handle, not give eny arithmetaic opertaion

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(0.0/0.0);
		
		System.out.println(Math.sqrt(-1));
		
		System.out.println(Float.NaN==Float.NaN);
		System.out.println(Float.NaN!=Float.NaN);
		
		double nan=2.2%2;
		System.out.println((2.2%2)==nan);

	}

}
