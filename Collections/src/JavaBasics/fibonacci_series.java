package JavaBasics;

public class fibonacci_series {

	public static void main(String[] args) {
		
		int num=30;
		int t1=0;
		int t2=1;
		
		for(int i=1;i<=num;i++) {
			System.out.println(t1);
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			
		}
		

	}

}
