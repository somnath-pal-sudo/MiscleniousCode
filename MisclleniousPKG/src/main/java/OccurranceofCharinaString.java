import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurranceofCharinaString {
	
	
	static void charcout(String input) {
		
		if(input.isEmpty()) {
			return;
			
		}
		if(input=="") {
			return;
		}
		if(input.contains("")) {
			return;
			
		}
		
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		char[] strarray= input.toCharArray();
		for(char c: strarray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			}
			else
			{
				map.put(c, 1);
			}
		}
			
			
			  Iterator<Character> it=map.keySet().iterator(); while(it.hasNext()) {
			  Character key= it.next(); Integer value= map.get(key);
			  
			  System.out.println(key + " " + value);
			 
			
			/*
			 * Set<Map.Entry<Character,Integer>> entryset=map.ne
			 * for(Map.Entry<Character,Integer>entry:entryset) if(entry.getValue()>1) {
			 * System.out.println(entry.getKey()+""+ entry.getValue());
			 */
			}
			
			
			
			
			
			
			
			}
		

		
		
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Abhay";
		if(input.contains("A")) {
			System.out.println("Print A");
		}
		charcout( input);
		

	}

}
