
public class threadPriorities extends Thread {
	
	void demo() {
		
		System.out.println("child thraed");
		System.out.println(Thread.currentThread().getPriority());
		System.out.println();
		Thread.currentThread().setPriority(10);
	}

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(10);
		threadPriorities tp= new threadPriorities();
		tp.start();
		tp.setPriority(MIN_PRIORITY);
		
		

	}

}
