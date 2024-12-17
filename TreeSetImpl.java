package InterviewPrograms;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {
	public static void main(String[] args) {
		
		TreeSet<String> t= new TreeSet<String>();
		t.add("Somnath");
		t.add("Vijua");
		
		Iterator<String>it= t.descendingIterator();
			while(it.hasNext()){
				System.out.println(it.next());
				
			}
		}
	}


