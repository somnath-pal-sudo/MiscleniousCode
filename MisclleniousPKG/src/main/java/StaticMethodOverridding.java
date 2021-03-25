
public class StaticMethodOverridding {
	
	
	
	public static  boolean display() { 
        System.out.println("Static or class method from Base");
		return false; 
    } 
      
     // Non-static method which will be overridden in derived class  
     public void print()  { 
         System.out.println("Non-static or Instance method from Base"); 
    } 

      static class Derived extends StaticMethodOverridding{
    	 public static void display(boolean arg) { 
    	        System.out.println("Static or class method from Base"); 
    	    } 
    	      
    	     // Non-static method which will be overridden in derived class  
    	     public void print()  { 
    	         System.out.println("Non-static or Instance method from Base"); 
    	    } 
    	 
    	 
    	 
     }

	public static void main(String[] args) {
		StaticMethodOverridding sm= new StaticMethodOverridding();
		/*
		 * boolean b=sm.display(); if(b==true) { System.out.println(b); }
		 */
		sm.print();
		
		
		
		
		
		
		

	}

}
