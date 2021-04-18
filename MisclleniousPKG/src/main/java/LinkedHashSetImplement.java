import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetImplement {
	
	


	public static void main(String[] args) {
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("Somnath");
		lh.add("nevin");
		lh.add("nevin");
		lh.add("");
		lh.add(null);
		lh.add(null);
		//System.out.println(lh);
		
		lh.add("Shivam");
		//System.out.println(lh);
		//lh.forEach(e->System.out.println(e));
		Iterator<String>it=lh.iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(key);
		}
		
		for(String i:lh) {
			System.out.println(i);
		}
		
		
		
		

	}

}
