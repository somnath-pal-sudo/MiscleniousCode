package testmain;

public class testmain_overloaded {

	public static void main(String[] args) {
		System.out.println("main overloaded1");
		main(10);
		main(10,20);
		main("Somnath");
	}
		public static void main(int a) {
			System.out.println("main overloaded2");
		}
			public static void main(int a, int b) {
				System.out.println("main overloaded3");
			}
				public static void main(String args) {
					System.out.println("main overloaded4");
				}
			


	}


