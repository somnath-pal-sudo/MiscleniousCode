package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist_compare {

	public static void main(String[] args) {
		
		ArrayList<String> al1= new ArrayList<String>(Arrays.asList("A","B","C","D"));
		ArrayList<String> al2= new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		Collections.sort(al1);
		Collections.sort(al2);
		
		//System.out.println(al1.equals(al2));
		
		//compare 2 list to find out the extra element
		
		
		ArrayList<String> al3= new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> al4= new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		String al5=al3.removeAll(al4).toList());
		
		System.out.println(al5);
		


		

	}

}
