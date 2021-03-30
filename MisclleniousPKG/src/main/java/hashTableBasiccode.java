import java.util.Hashtable;
import java.util.Iterator;

public class hashTableBasiccode {
	
	public static void main(String[] args) {
	
	Hashtable<String,String> ht= new Hashtable<String,String>();
	ht.put("A","Apple");
	ht.put("B", "Sony");
	//System.out.println(ht);
	
	
Iterator<String> it=ht.keySet().iterator();
while(it.hasNext()) {
	String key= it.next();
	String value= ht.get(key);
	
	System.out.println(key  +" = " + value);
	
	
}

}
}
