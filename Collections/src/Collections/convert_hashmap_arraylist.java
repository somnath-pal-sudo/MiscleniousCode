package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class convert_hashmap_arraylist {

	public static void main(String[] args) {
		
		HashMap<String, Integer>compMap= new HashMap<String,Integer>();
		compMap.put("Wallmart", 100000);
		compMap.put("Flipkart", 20);
		compMap.put("Amazon", 1000);
		compMap.put("Snapdeal", 100);
		compMap.put("reddit", 10);
		
		//System.out.println("company map size"+ compMap.size());
		
	@SuppressWarnings("rawtypes")
	Iterator it=compMap.entrySet().iterator();
		
	while(it.hasNext()) {
		@SuppressWarnings("rawtypes")
		Map.Entry pairs= (Map.Entry)it.next();
		System.out.println(pairs.getKey()+"="+ pairs.getValue());
	}
	
	List<String> compnameList = new ArrayList<String>(compMap.keySet());
	for(String t:compnameList)
		System.out.println(t);
	
	//convert hashvalue to arraylist(inside the constructor we need to pass keyset, values)
	
	List<Integer> compnameList2 = new ArrayList<Integer>(compMap.values());
	System.out.println(compnameList2.size());
	for(Integer e:compnameList2)
		System.out.println(e);

	
	
		
		
		
		
		

	}

}
