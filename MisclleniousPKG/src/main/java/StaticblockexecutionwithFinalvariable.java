
public class StaticblockexecutionwithFinalvariable {
	
	
	static {
		System.out.println("This is to print static block");
		
	}
	
	{
//		System.out.println("print");//instant initialization block will be excute on higher priority/
	}
	
	public  final int q=200;
	
	public StaticblockexecutionwithFinalvariable() {
		System.out.println("constructor block");
		long StartTime=System.nanoTime();
		long EndTime=System.nanoTime();
		System.out.println(Math.abs(StartTime-EndTime));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new StaticblockexecutionwithFinalvariable().q);
		System.out.println("main method");
		new StaticblockexecutionwithFinalvariable();

	}

}

