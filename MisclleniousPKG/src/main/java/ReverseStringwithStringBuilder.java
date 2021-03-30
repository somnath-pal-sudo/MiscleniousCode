
public class ReverseStringwithStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Somnath";
		StringBuilder sb= new StringBuilder(input);
		sb.reverse();
		System.out.println(sb.toString());
		
		StringBuffer sb2= new StringBuffer(input);
		sb2.reverse();
		System.out.println(sb2.toString());

	}

}
