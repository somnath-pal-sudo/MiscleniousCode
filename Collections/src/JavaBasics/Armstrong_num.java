package JavaBasics;

import java.awt.List;
//import java.lang.reflect.Array;

public class Armstrong_num {

	public static void main(String[] args) {
		
		//153====> 1*1*1 + 5*5*5 + 3*3*3===>153
		//371====>371
		
		int num=125;
		int actualnumber= num;
		double result=0;
		List<string> ls= new Array<List>();
		
		while(actualnumber!=0) {
			int n=actualnumber%10;
			result= result+ Math.pow(n, 3);
			actualnumber= actualnumber/10;
			
		}
		if (actualnumber==num)
		{
			System.out.println(num  + "is armstrong number" );
		}
		else {
			System.out.println(num + " is not armstrong number");
		}
		
	}

}
