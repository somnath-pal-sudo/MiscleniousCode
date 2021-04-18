
public class FindSumofOddandEvenNumber {
	
	
	static int printEvenSum(int n) {
		return (n*n);
	}
	static int printOddSum(int n) {
		return (n*n+1);
	}

	public static void main(String[] args) {
		
		int n=200;
		int evensum=printEvenSum(n);
		int oddNumSum=printOddSum(n);
		System.out.println(evensum);
		System.out.println(oddNumSum);
		
		

	}

}
