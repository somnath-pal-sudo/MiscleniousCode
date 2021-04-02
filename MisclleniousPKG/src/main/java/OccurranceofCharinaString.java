import java.util.HashMap;
import java.util.Iterator;

public class OccurranceofCharinaString {
	
	
	static void charcout(String input) {
		
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
			
			Iterator<Character> it=map.keySet().iterator();
			while(it.hasNext()) {
				Character key= it.next();
				Integer value= map.get(key);
				
				System.out.println(key + " " + value);
			}
		}
		
		
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="HCLTechL";
		charcout( input);
		

	}

}
