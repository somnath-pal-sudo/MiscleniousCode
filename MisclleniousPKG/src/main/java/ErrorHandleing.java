public class ErrorHandleing{
	
	static void dividedByZero() {
		throw new ArithmeticException("Trying to divide by 0");
	}
	public static void main(String[] args) {
		dividedByZero();
	  }
}

