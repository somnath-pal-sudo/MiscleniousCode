package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class SynchronizedArraylistConcept {

	public static void main(String[] args) {
		List<String>ls=Collections.synchronizedList(new ArrayList<String>());
		ls.add("java");
		ls.add("Python");
		//we don't need any explict sychronization for add, remove//
		//to fecth/traverse we need explict syncronization//
		
		synchronized (ls) {
		Iterator<String> it=ls.iterator();
		System.out.println(it.next());
		}
		
		System.out.println("good to print");
		
		
		

	}

}
