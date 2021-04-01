
public class NormalStaticProgram {
	
	int age;
	String name;
	static String collegename="KIIT";
	
	static void change() {
		collegename="GNIT";
	}
	
	
	public NormalStaticProgram(int age, String name) {
		this.age=age;
		this.name=name;
		
	}
	void display() {
		System.out.println(age+name+collegename);
	}
	

	public static void main(String[] args) {
		NormalStaticProgram np= new NormalStaticProgram(100,"GIST");
		NormalStaticProgram np2= new NormalStaticProgram(101,"KALYAN");
		NormalStaticProgram.change();
		np.display();
		np2.display();
		
		

	}

}
