package InterviewPrograms;
import java.util.*;

public class SetOp {
	public static void main(String[] args) {
		
		HashSet<Integer> h= new HashSet<Integer>();
		h.add(10);
		h.add(20);
		System.out.println(h.size());
		h.addAll(Arrays.asList(new Integer[] {10,209,300}));
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
		HashSet<Integer> s= new HashSet<Integer>(h);
		b.addAll(h);
		b.retainAll(h);
		
		
	}

}
