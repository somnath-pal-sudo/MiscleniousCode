package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class ArrayListConcept {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		//System.out.println(ar);
		
		//ArrayList<Integer> ar1= new ArrayList<Integer>();
		//ar1.add(40);
		//ar1.add(12);
		
		//System.out.println(ar.addAll(ar1));
		
		ArrayList<Integer> clonelist= (ArrayList<Integer>)ar.clone();
		System.out.println(clonelist);
		
		System.out.println(ar.contains(10));
		System.out.println(ar.indexOf(10));
		
		ArrayList<String> ar3= new ArrayList<String>(Arrays.asList("Naveen","Lisa","Naveen","Simran"));
		System.out.println(ar3.lastIndexOf("Naveen"));
		System.out.println(ar3);
		
		ar3.remove(1);
		System.out.println(ar3);
		ar3.removeAll(ar3);
		System.out.println(ar3);
		
		ArrayList<Integer> ar4= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ar4.removeIf(num -> num%2==0);
		System.out.println(ar4);
		
		ArrayList<String> Namelist= new ArrayList<String>(Arrays.asList("Naveen","Lisa","Naveen","Simran"));
		System.out.println(Namelist);
		Namelist.retainAll(Collections.singleton("Lisa"));
		System.out.println(Namelist);
		
		
		ArrayList<Integer> numlist= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
		ArrayList<Integer> Sublist= new ArrayList<Integer>(numlist.subList(3, 5));
		System.out.println(Sublist);

		
		ArrayList<String> newnamelist= new ArrayList<String>(Arrays.asList("Naveen","Lisa","Naveen","Simran"));
		Object arr[]=newnamelist.toArray();
		System.out.println(Arrays.toString(arr));
		
		for (Object o:arr)
		{
			System.out.println(o);
		}
		
		
		

	}

}
