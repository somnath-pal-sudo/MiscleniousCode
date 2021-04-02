
public class FindoutDuplicateCharectersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="PhantoMMoovie";
		char[] dup= str.toCharArray();
		int count=0;
		System.out.println("Duplicates char are: " + " " + count);
		for (int i=0;i<str.length();i++) {
			for (int j=i+1;j<str.length();j++) {
				if(dup[i]==dup[j]) {
					System.out.println(dup[j]);
					count++;
					//System.out.println(count);
				}
				
			}
		}
		
		

	}

}
