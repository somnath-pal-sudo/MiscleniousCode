package com.qa.test;

import org.testng.Assert;
//import org.junit.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum() {
		System.out.println("Sum");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void sum1() {
		System.out.println("Sum2");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}

	@Test
	public void sum2() {
		System.out.println("Sub");
		int a=10;
		int b=20;
		Assert.assertEquals(-10, a-b);
	}

	@Test
	public void sum3() {
		System.out.println("Sum3");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}


}
