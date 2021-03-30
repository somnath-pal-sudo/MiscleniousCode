import java.awt.List;
import java.util.ArrayList;

public class AutoBoxingandUnboxing {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ls= new ArrayList<Integer>();
		//ls.add(1);
		//ls.add(2);
		
		for(int i=0;i<10;i++) 
			
			ls.add(Integer.valueOf(i));// autoboxing avoids explict type casting//
		
		System.out.println(ls);

	}

}
