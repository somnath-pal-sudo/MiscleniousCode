package JavaBasics;

public class sum_of_natural_numbers {

	public static void main(String[] args) {
		
		int num=100;
		int sum=0;
		
		for(int i=0; i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("sum is =" +sum);
		
		System.out.println("---------");
		
		int k=1;
		int sum1 = 0;
		while(k<= num)
		{
			 sum1=sum1+k;
			 k++;
		}
		
		System.out.println("sum is :" +sum1);

	}

}
