package JavaBasics;

import java.util.Arrays;

public class largest_and_smallest_int_in_array {

	public static void main(String[] args) {
		int num[]= {10,-10};
		
		int largest= num[0];
		int smallest= num[0];
		
		for(int i=1; i<num.length;i++) {// time complexity O(n)//
			if(num[i]>largest) {
				largest= num[i];
			}
			else if(num[i]<smallest) {
				smallest=num[i];
			}
		}
		System.out.println("\n given attay is "+ Arrays.toString(num));
		System.out.println("largest number is " +largest);
		System.out.println("Smallest number is" + smallest);
		

	}

}
