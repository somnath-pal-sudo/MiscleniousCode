import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.function.Function;

public class PrintDupelementinArrayByStreamAPINaveen {

	public static void main(String[] args) {
	
		//Way to find out dup array//
		//1.bruteforce
		//2.HashSet
		//3.HashMap<K,V>
		//4.Streams
		
		String infra[]= {"Amazon","Flipkart","Suace Labs","Ali baba","GCP","Amazon","GCP","flipkart"};
		System.out.println("BruteForce Mechanism");
		for(int i=0;i<infra.length;i++){
			for(int j=i+1;j<infra.length;j++) {
				if(infra[i].equals(infra[j]))
					System.out.println(infra[i]);
				
			}
			
		}
	

		
		
		//System.out.println("*****************---HashSet---**********************");
		/*
		 * //Set<String> data= new HashSet<String>(); for(String e:data) {
		 * if(data.add(e)==false) { System.out.println(e); } }
		 */
		
		Map<String,Integer> infraMap= new HashMap<String,Integer>();
		for(String e2: infra) {
			Integer count=infraMap.get(e2);
			if(count==null) {
				infraMap.put(e2, 1);
				
			}
			else
			{
				infraMap.put(e2, count++);
			}
			
			Set<Entry<String,Integer>>entryset=infraMap.entrySet();
			for(Entry<String,Integer> entry:entryset) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey());
					
				}
			}
			
		}
		
		System.out.println("***********ThroughArrayList******************");
		Set<String>dataset= new HashSet<String>();
		
		Set<String>dupset=Arrays.asList(infra).stream().filter(e->!dataset.add(e)).collect(Collectors.toSet());
		System.out.println(dupset);
		
		System.out.println("**********--GroupingBy***************");
	Set<String>dupstring=Arrays.asList(infra).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toSet());
	System.out.println(dupset);
	
	System.out.println("************Through Freequency********************");
	
	List<String>list=Arrays.asList(infra);
	Set<String>ls=list.stream().filter(e->Collections.frequency(list,e)>1).collect(Collectors.toSet());
	System.out.println(ls);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
}
