package JavaBasics;

public class print_no_of_digits_in_integer {

	public static void main(String[] args) {
		
		
		int num=1234;
		int count=0;
		
		while(num!=0) {
			num=num/10;
			count++;
			
		}
		System.out.println("no of digits "+ count);

	}

}
