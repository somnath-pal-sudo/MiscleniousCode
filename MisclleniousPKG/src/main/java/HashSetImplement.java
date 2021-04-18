import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplement {

	public static void main(String[] args) {
		
		/*
		 * HashSet<String> hs= new HashSet<String>();
		 * 
		 * //System.out.println(hs); for(String
		 * i:Arrays.asList("Somnath","nevin","null")) { //hs.addAll(hs);
		 * hs.removeAll(hs);
		 * 
		 * 
		 * 
		 * System.out.println(i);
		 */
			
			
			HashMap<String,Integer>map= new HashMap<String,Integer>();
			map.put("A", 1);
			map.put("B", 1);
			map.put("C", 1);
			map.put("A", 2);
			
			 Iterator<String> it=map.keySet().iterator();
			 while(it.hasNext()) {
				 String key= it.next();
				 Integer value= map.get(key);
				 System.out.println(key + "---->" + value);
			 }
			
			
		}
		
		

	}


