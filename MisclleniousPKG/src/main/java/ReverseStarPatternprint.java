
public class ReverseStarPatternprint {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {//----for create space in the paatern
				System.out.println(" ");
				
			}
			for(int k=1;k<=i;k++) {//print the star pattern(3 loop)
				System.out.print(" *");
			}
			System.out.println();
			
		}
	}
}
		

	


