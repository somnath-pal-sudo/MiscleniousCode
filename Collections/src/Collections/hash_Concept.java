package Collections;
import java.util.*;
public class hash_Concept {

	public static void main(String[] args) {
		Map<String,Integer> marks= new HashMap<String,Integer>();
		marks.put("naveen", 200);
		marks.put("pawan", 300);
		marks.put("rohit", 400);
		marks.put("bobby", 500);
		marks.put("rapp", 600);
		
		
		marks.put(null, 1000);
		
		System.out.println("the hash value of naveen" + marks);
		
		
		
		

	}

}
