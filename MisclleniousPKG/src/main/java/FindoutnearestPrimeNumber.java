import java.util.Scanner;

public class FindoutnearestPrimeNumber {
	 int n;
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter any number");
		s.nextLine();
		
	}
	
	@SuppressWarnings("unused")
	boolean IsPrime(int n) {
		
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
				
			}
			if(count==0) {
				return true;
				
			}
			else
				return false;
		
		}
		return false;
	}
		
		int beforePrime(int n) {
			int c=0;
			while(true) {
				if(IsPrime(n)) {
					return c;
					
				}
				else {
					n=n-1;
					c++;
				}
			}
		}
				
				int afterPrime(int n) {
					int c=0;
					while(true) {if(IsPrime(n)) {
						return c;
						
					}
					else {
						n=n+1;
						c++;
					}
						
					}
					
				}
		void nearestPrime() {
			int ap= afterPrime(n);
			int bp= beforePrime(n);
			
			if(ap>bp) {
				System.out.println("Nearest prime is :");
				System.out.println(n-bp);
			}
			else if(ap<bp) {
				System.out.println("Nearest prime is :");
				System.out.println(n+ap);
				
			}
			else if(ap==bp){
				
				System.out.println("Nearest Primes are:");
				System.out.println((n-bp)+" "+(n+ap));
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindoutnearestPrimeNumber fp= new FindoutnearestPrimeNumber();
		fp.input();
		fp.nearestPrime();
		

	}
		}



