import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindduplicateelementinArraywithStream {

	public static void main(String[] args) {
		List<Integer> ls= new ArrayList(Arrays.asList(1,2,3,231,321,2,1,9,231));
		System.out.println(ls);
		List<Integer>newList= ls.stream().distinct().collect(Collectors.toList());
		System.out.println(newList);
				
		
		
		

	}

}
