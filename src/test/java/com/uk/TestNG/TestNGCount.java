package com.uk.TestNG;

import org.testng.annotations.Test;

public class TestNGCount {
	
	@Test(invocationCount = 4)
	public void MyNumber(){
		System.out.println("Honda");
		
	}

}



