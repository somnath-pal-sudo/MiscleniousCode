package JavaBasics;

public class find_missing_num_in_array {

	public static void main(String[] args) {
		
		int a[]= {-1,-2,1,2,3,4,5,6,7,8,10};//it must be in sequence else it won't work
		int sum=0;
		
		
		for(int i=0;i<a.length;i++) {
			sum= sum+a[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=-1; j<=10; j++) {
			sum1=sum1+j;
		}
		System.out.println("missing number is ::"+ (sum1-sum));
	}

}
