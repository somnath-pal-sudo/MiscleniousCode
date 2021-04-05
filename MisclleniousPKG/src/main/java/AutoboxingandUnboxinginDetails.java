import java.awt.List;
import java.util.ArrayList;

public class AutoboxingandUnboxinginDetails {
	public static int SumofNumber(ArrayList<Integer> ls) {
	int sum=0;
	for(Integer i:ls) {
		if(i%2!=0)
			sum+=i;
	}
	return sum;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> ls= new ArrayList<Integer>();
		for(int i=0;i<10;i++) 
			ls.add(i);
			int sumofOdd=SumofNumber(ls);
			System.out.println(sumofOdd);
	

	}

}
