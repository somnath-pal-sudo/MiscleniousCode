import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateEementsinArraythroughList {
	
	public static <T> ArrayList<T> findDuplicateElement(List<Integer> ls) {
		//System.out.println(newls);
		ArrayList<T> newList = new ArrayList<T>();
		for(Integer element:ls) {
			if(!ls.contains(element)) {
				ls.add(element);
			}
			
		}
		return newList;
		
		
	}

	public static void main(String[] args) {
		
		List<Integer> ls= new ArrayList(Arrays.asList("1,2,2134,2,1,3,213,43"));

		
		List<Integer>newList= findDuplicateElement(ls);
		System.out.println(newList);



	}

}
