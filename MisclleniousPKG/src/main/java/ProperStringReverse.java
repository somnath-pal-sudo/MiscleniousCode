
public class ProperStringReverse {
	
	public static String wordreverse(String str) {
		
		int i= str.length()-1;
		int start,end=i+1;
		String rev="";
		while(i>=0) {
			if(str.charAt(i) == ' ') {
				start=i+1;
				while(start!=end) {
					rev+= str.charAt(start++);
					rev+="";
					end=i;
				}
				i--;
				
			}
			
			start=0;
			while(start!=end) {
				rev+= str.charAt(start++);
			
				return rev;
			}
		}
		//return rev;
	
				
				
		
		
			public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Sommnath Pal";
		wordreverse(str1);
		System.out.println(str1);

	}

}
}

