package EncapsulationConcept;

public class EmployeeData {
	private int SSN;
	private String empname;
	private int age;
	

	public int getSSN() {
		return SSN;
	}


	public void setSSN(int SSN) {
		this.SSN = SSN;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public getter and setter method else we need to call it inside class scope
		//encapsulation is also --data hiding
		
		EmployeeData ed= new EmployeeData();
		ed.setEmpname("tom Peter");
		ed.setAge(25);
		ed.setSSN(43264);
		System.out.println("EmployeeName is " +ed.empname);
		System.out.println("EmployeeAge is " +ed.age);
		System.out.println("EmployeeSSN is " +ed.SSN);
		

	}

}
