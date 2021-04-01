//why string is immutable?
//1.String pool in Method area
//2.common memory allocation
//3.wrapper class(integer,string,float,double) immutable and final
//4.Secutiy
//5.Optimization&performenece
//6.FinalType


public class StringMutableConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="jave";
		String s2="java";
		String s3=s2;
		String s4="Naveen";
		 s1="Somnath";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		

}
}
