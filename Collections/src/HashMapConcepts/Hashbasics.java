package HashMapConcepts;
import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class Hashbasics {

	public static void main(String[] args) {
		//1.no order
		//2.stores-values as key and value
		//3.key can't be duplicate, latest value will be picked if changes done
		
		
		@SuppressWarnings("unused")
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("USA", "WDC");
		map.put("France", "DC");
		map.put("India", "CDC");
		map.put("PAK", "ISM");
		map.put("USA", "ISM");
		map.put(null, "Delhi");
		map.put("Russia", null);
		
		
		//System.out.println(map.get("USA"));
		//System.out.println(map.get("Germany"));
		//System.out.println(map.get(null));
		//System.out.println(map.get("Russia"));
		
		
		//iterator over hashkeys
		
		Iterator<String> it= map.keySet().iterator();
		while(it.hasNext()) {
			String key= it.next();
			String value= map.get(key);
			System.out.println("key=" + key+ "value ="+ value);
			
		}
		
		// through EntrySet iteration
		Iterator<Entry<String,String>> capmap=map.entrySet().iterator();
		while(capmap.hasNext()) {
			Entry<String,String> entry= capmap.next();
			System.out.println("key= "+entry.getKey()+"Value= "+entry.getValue());
		}
		
		capmap.forEach(k,v)=>System.out.println("key"+ key +"value"+ value);
		
		
		
		
		

		

		
		
		
		
		

	}

}
