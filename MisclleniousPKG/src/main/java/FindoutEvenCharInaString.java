import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindoutEvenCharInaString {
	
	
	
	
	/*
	 * public static String findUnique(String str) { String build=""; for(int
	 * i=0;i<str.length();i++) { if(!build.contains(str.substring(i, i+1))) {
	 * build+=str.substring(i, i+1); System.out.println(str); }
	 * 
	 * 
	 * } return build;
	 * 
	 * }
	 */
	public static void main(String[] args) {
		
		/*String str1= "abbccddeffez";
		String str2="az";
		
		HashSet<Character>hs= new HashSet<Character>();
		HashSet<Character>hs2= new HashSet<Character>();
		for(int i=0;i<str1.length();i++) {
			hs.add(str1.charAt(i));
		}
			
			for(int j=0;j<str2.length();j++) {
				hs2.add(str2.charAt(j));
			}
			hs.retainAll(hs2);
			
			if(!hs.isEmpty()) {
				System.out.println("Substring is " + hs);
				
			}
			else {
				System.out.println("No Substring is present");
			}
			
		}
		
		*/
		
		//findUnique("abbccddeffez");
		
		String str="abbccddeffez";
		Map<Character,Integer> mp= new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
			}
			else
				mp.put(c, 1);
			
			
		}
		for(Map.Entry<Character,Integer> m:mp.entrySet()) {
			if(m.getValue()==1) {
				System.out.println(m.getKey());
			}
		}
			
		}
	} 
	
	
		
		
		
		

	



