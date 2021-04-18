import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//import java.util.Map.Entry;

public class DuplicateCharByNaveen {
	
	//static String str;

	public static void main(String[] args) {
		
		printDuplicate("JAVAJAJA");
		
		

	}
	
	public static void printDuplicate(String str) {
		if(str==null) {
			System.out.println("null string");
			return;
			
		}
		if(str.isEmpty()) {
			System.out.println("EmptyString");
			return;
		}
		if(str.length()==1) {
			System.out.println("Single char String");
			return;
		}
		
		char[] array=str.toCharArray();
		Map<Character,Integer> charmap= new HashMap<Character,Integer>();
		for(Character ch:array) {
			if(charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch)+1);
				
			}
			else {
				charmap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> entryset=charmap.entrySet();
		for(Map.Entry<Character,Integer> entry:entryset) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +" "+ entry.getValue());
			}
		}
	}
	

}



