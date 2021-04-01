
public class Printonetohundredwithoutloop {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum(1);

	}
	
	public static void printNum(int num) {
		
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
		
	}

}
