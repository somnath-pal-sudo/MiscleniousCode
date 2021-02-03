package Abstarction;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("game of thrones");
		al.add("Breaking bad");
		al.add("bigBang theory");
		al.add("waliking dead");
		al.add("prision break");
		
		
		//1. using foreach loop and lambda exp.
		/*
		 * al.forEach(shows ->{ System.out.println(shows); });
		 */
		
		//2.through iterator//
		Iterator<String> it= al.iterator();
		while(it.hasNext()) {
			@SuppressWarnings("unused")
			String shows= it.next();
			System.out.println(shows);
		}
		
		

	}

}
