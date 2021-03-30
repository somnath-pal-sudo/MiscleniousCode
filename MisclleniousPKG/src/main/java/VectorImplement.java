import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class VectorImplement {
	
public static void main(String[] args) {
	
	
	ArrayList<Integer> ls= new ArrayList<Integer>();
	
	ls.add(109);
	ls.add(200);
	ls.add(1);
	
	Collections.sort(ls);
	
	
	Vector<Integer> vs= new Vector<Integer>(ls);
	
	//System.out.println(vs);	
	
	Iterator<Integer> it=vs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	vs.forEach(e->System.out.println(e));
	
	for(Integer i: vs) {
		System.out.println(i);
	}
	
		
	/*
	 * Vector<Integer> v= new Vector<Integer>(); v.add(1); v.add(2); v.capacity();
	 * 
	 * System.out.println(v.size());
	 */
	
	
	

	}

}
