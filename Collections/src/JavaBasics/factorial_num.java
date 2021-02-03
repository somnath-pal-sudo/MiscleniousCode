package JavaBasics;

public class factorial_num {

	public static void main(String[] args) {
		//5!=120//
		
		int num=5;
		getfact(num);
		
		
		//for(int i=1;i<=num;i++) {
			//fact=fact*i;
		//}
		//System.out.println("factorail of "+ num +  " is " +  fact);

	}
	
	public static void getfact( int num) {
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorail of "+ num +  " is " +  fact);

		
	}

}
