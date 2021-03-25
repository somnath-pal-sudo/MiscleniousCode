import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class HashmapwithNullKeyandnullvalue {
	
	public static void main(String args[]) {
		
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "TVSerial");
		map.put(2, null);
		map.put(null, null);
		
		map.put(2, "rocknroll");
		map.putAll(map);
		HashMap m=(HashMap) Collections.synchronizedMap(map);
		m.clone();
		
		for(Object name: map.keySet()) {
			Object key= name;
			String value=map.get(name);
			System.out.println(key + " =" + value);
		}
		
		
		
		}
		
		
		
		
		
	}


