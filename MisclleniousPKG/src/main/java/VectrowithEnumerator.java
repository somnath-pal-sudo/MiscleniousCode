import java.util.Enumeration;
import java.util.Vector;

public class VectrowithEnumerator {

	public static void main(String[] args) {
		
		Vector<String> v= new Vector<String>(1);
		v.add("A");
		v.add("b");
		v.add("c");
		v.remove(1);
		System.out.println(v.size());
		
		//System.out.println(v.firstElement());
		//System.out.println(v.lastIndexOf("c"));
		
		if(v.contains("A")) {
			System.out.println(v.indexOf("A"));
		}
		
	
		/*
		 * Enumeration<String> en=v.elements(); while(en.hasMoreElements()) {
		 * 
		 * System.out.println(en.nextElement());
		 * 
		 * }
		 * 
		 */
	}

}
