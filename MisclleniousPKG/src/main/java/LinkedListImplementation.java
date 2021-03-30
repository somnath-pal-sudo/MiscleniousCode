import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImplementation {

	public static <E> void main(String[] args) {
		
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(1);
		ls.add((int) 2.0);
		ls.add(-2);
		ls.add((int) -3.2);
		
		Collections.sort(ls);
		
		//System.out.println(ls);
		
		
		LinkedList<Integer> ls2=new LinkedList<Integer>();
		ls2.add(1000);
		ls2.add(20);
		ls2.add(1908);
		ls2.add((int) 132.0);
		ls2.add(-2);
		ls2.add((int) 10);
		
		Collections.sort(ls2);
		
		/*
		 * System.out.println(ls2);
		 * 
		 * ls2.stream().forEach((temp)->System.out.println(temp));
		 * 
		 * int i=0; while(i<ls.size()) {
		 * 
		 * System.out.println(ls.get(i)); i++;
		 * 
		 * }
		 */
		for(Iterator i1= ls.iterator();i1.hasNext();) {
			
			System.out.println(i1.next());
			
		}
		
		
		
		}
	
	
		
		
		
		
		
		
		
		
		

	}


