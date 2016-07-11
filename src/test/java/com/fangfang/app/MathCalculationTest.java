package com.fangfang.app;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.fangfang.app.MathCalculation;

public class MathCalculationTest {
	private MathCalculation mathTest = new MathCalculation();
	
	@BeforeClass
	public void BeforeClass(){
		System.out.println("before class!");
	}

  @Test
  public void add() {
	  int result = mathTest.add(4, 5);
	  Assert.assertEquals(result, 9);
  }

  @Test
  public void divide() {
	  float actual = mathTest.divide(8, 3);
	  Assert.assertEquals(actual, 2.7, 0.2);
  }
  
  @Test(expectedExceptions  = { ArithmeticException.class })
  public void divideException(){
	  float actual = 6/0;
  }

  @Test
  public void minus() {
	 int actual = mathTest.minus(9, 3);
	 Assert.assertEquals(actual, 6);
  }
  
  @AfterClass
  public void afterClass(){
	  System.out.println("after class!!");
  }
  
}
