package JavaBasics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class How_to_find_duplicate_elements_in_array {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		String names[]= {"Java", "JavaScript","Ruby","C","Python","Java","Python"};
		
		//1.compare each element to each other(worst case)[time complexity=O(n2)]
		for (int i=0; i<names.length;i++) {
			for (int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is " + names[i]);
				}
				
			}
		}
		

		//Using HashSet to compare//hashset can't store duplicate element(O(n))---best case
		HashSet<String> store= new HashSet<String>();
		for(String name: names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate element is "+ name);
			}
		}
	}
	//3.Using HashMap find duplicate value//important
	
	HashMap<String,Integer> storemap= new HashMap<String,Integer>();
	
	for(String name: names) {
		Integer count=storemap.get(name);//Integer is wrapper class here//
		if(count==null) {
			storemap.put(name,1);
		}
		else {
			storemap.put(name, ++count);
		}
			
		}

	
	//get the value from hashmap object
	Set<Entry<String,Integer>>entrySet=storemap.entrySet();
	for(Entry<String,Integer> entry: entrySet) {
		if(entry.getValue()>1) {
			System.out.println("duplicate value is "+ entry.getKey());
		}
	}
}


			
		
		
	


