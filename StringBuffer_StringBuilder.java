package InterviewPrograms;
//StringBuffer is synchronous so slower in execution//
public class StringBuffer_StringBuilder {
	 public static void main(String[] args){  
	        StringBuffer buffer=new StringBuffer("hello");  
	        buffer.append("java");  
	        System.out.println(buffer);  
	    } 
}

//String builder is asynchronous so faster in execution//
public class StringBuffer_StringBuilder1{  
    public static void main(String[] args){  
        StringBuilder builder=new StringBuilder("hello");  
        builder.append("java");  
        System.out.println(builder);  
    }  
}  
