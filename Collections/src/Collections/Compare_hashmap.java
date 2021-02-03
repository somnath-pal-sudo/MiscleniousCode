package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Compare_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer,String> map1= new HashMap<Integer,String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		@SuppressWarnings("unused")
		HashMap<Integer,String> map2= new HashMap<Integer,String>();
		map1.put(1, "B");
		map1.put(2, "C");
		map1.put(3, "D");
		
		@SuppressWarnings("unused")
		HashMap<Integer,String> map3= new HashMap<Integer,String>();
		map1.put(1, "D");
		map1.put(2, "B");
		map1.put(3, "A");
		map1.put(3, "E");
		
		
		
		//1.compare based on key&value format//
		//System.out.println(map1.equals(map2));
		//System.out.println(map1.equals(map3));
			
		
		//2.compare hashmap for same keys: keyset()//
		
		//System.out.println(map2.keySet().equals(map3.keySet()));
		
		
		//3.find out the extra key
		
		HashMap<Integer,String> map4= new HashMap<Integer,String>();
		map4.put(1, "D");
		map4.put(2, "B");
		map4.put(3, "A");
		map4.put(4, "E");
		map4.put(5, "F");
		
		//combmine the keys from both the maps;
		HashSet<Integer> combkeys= new HashSet<Integer>(map1.keySet());
		combkeys.addAll(map4.keySet());
		combkeys.removeAll(map1.keySet());
		
		System.out.println(combkeys);
		
		
		//4.compare maps by values
		
		HashMap<Integer,String> map5= new HashMap<Integer,String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		
		@SuppressWarnings("unused")
		HashMap<Integer,String> map6= new HashMap<Integer,String>();
		map6.put(1, "A");
		map6.put(2, "B");
		map6.put(3, "C");
		
		@SuppressWarnings("unused")
		HashMap<Integer,String> map7= new HashMap<Integer,String>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "D");
		map7.put(5, "D");
		
		//duplicate values not allowed
		
		//System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		//System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
		
		//duplicates are allowed: hashset
		
		//System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
		System.out.println(new HashSet<>(map6.values()).equals(new HashSet<>(map7.values())));


		
		
		
		
		

	}

}
