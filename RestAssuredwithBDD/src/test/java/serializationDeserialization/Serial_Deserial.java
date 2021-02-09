package serializationDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class test implements Serializable
{	int i=10,j=20;
	}



public class Serial_Deserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		test t1= new test();
		//Serialization
		
		FileOutputStream fos = new FileOutputStream("test.txt");//write our object in memory//
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(t1);
		
		
		//DeSerialize technique//
		
		FileInputStream fis= new FileInputStream("test.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		test t2=(test)ois.readObject();// test class type, upcasting
		
		System.out.println(t2.i+ " "+ "\n"+ t2.j);
	
		

	}

}