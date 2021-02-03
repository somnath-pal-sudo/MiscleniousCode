package JavaBasics;

public class string_paritioning {

	public static void main(String[] args) {
		
		String test="COMBINATION";
		 int len= test.length()/2;
		   for(int i=0; i<=len; i++) {
			   while(test.length()>0) {
				   test= test.substring(0,test.length()-1);
				   System.out.println(test);
				   break;
			   }
			   while(test.length()>0) {
				   test= test.substring(1,test.length());
				   System.out.println(test);
				   break;
		   }
			   
		   }

	}

}
