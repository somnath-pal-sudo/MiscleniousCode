package JavaBasics;

public class palindrome_number {

	public static void main(String[] args) {
		
		int num=001;
		int rev=0;
		int actulnumber=num;
		
		while(num!=0) {
			int n= num%10;
			rev= rev*10+n;
			num=num/10;
			
			 }
		System.out.println(rev);
		
		if(actulnumber==rev) {
			System.out.println(actulnumber + " is a palindrome number");
		
			}
		else {
			System.out.println(actulnumber + " is not a palindrome number");
		}

	}

}
