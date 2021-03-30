import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class BasicCode {

	
	  public static void main(String[] args) { ArrayList<String> namesList = new
	  ArrayList<String>(Arrays.asList( "alex", "brian", "charles") ); 
	  for (String name: namesList) { 
		  System.out.println(name); 
		  }
	  
	  ArrayList<String> namesList2 = new ArrayList<String>(Arrays.asList( "alex","brian","charles")); 
	  Iterator<String>it=namesList.iterator();
	  while(it.hasNext()) 
	  { 
		  System.out.println(it.next()); 
	  }
	 
		
	HashMap<String, String>hmit= new HashMap<String,String>();
			
	hmit.put("u1", "C");
	hmit.put("u2", "C++");
	/*
	 * System.out.println(it.get("u1")); System.out.println(it.get("u2"));
	 */
			
	//through iterator
	
	Iterator<String> it1= hmit.keySet().iterator();
	while(it1.hasNext()) {
		String key= it1.next();
		//@SuppressWarnings("unchecked")
		String value= hmit.get(key);
		System.out.println(key);
		System.out.println(value);
		
	}
	//through entry set loop
	Iterator<Entry<String,String>>capmap=hmit.entrySet().iterator();
	while(capmap.hasNext()) {
		Entry<String, String> Key=capmap.next();
		
		
		System.out.println(Key.getKey() + " = " + Key.getValue());
		
		
		
		
	}
	//through foreach loop
	for(Entry<String, String> Key:hmit.entrySet()) {
		System.out.println(Key.getKey() + " = " + Key.getValue());	}
	
	
	//through foreach loop
	//hmit.forEach((key,value) -> System.out.println(key + " = " + value));
	
	
	

	}
	
	

}


