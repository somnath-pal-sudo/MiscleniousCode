import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.*;

public class PrintonetohundredwithaRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Printnum(3,1200);
		IntStream stream = IntStream.range(1, 101);
		stream.forEach(System.out::println);

	}
	
	
	public static void Printnum(int stnum,int endnum) {
		if(stnum<=endnum) {
			System.out.println(stnum);
			stnum++;
			Printnum(stnum,endnum);
		}
	}
	

}
