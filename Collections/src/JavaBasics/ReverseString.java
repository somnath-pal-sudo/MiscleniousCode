package JavaBasics;

public class ReverseString {
	//using this immutable way

	public static void main(String[] args) {
		String s= "Selenium";
		 int len=s.length();
		 String rev="";
		 for(int i=len-1;i>=0;i--)
		 {
			 rev=rev+s.charAt(i);
		 }
		 System.out.println(rev);
		 
		 //2.using stringbuffer class(mutable way)
		 
		 StringBuffer sf= new StringBuffer(s);
		 System.out.println(sf.reverse());
			 
		 

	}

}
