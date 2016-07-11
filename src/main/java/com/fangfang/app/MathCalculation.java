package com.fangfang.app;

public class MathCalculation {
	
	public int add(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b){
		return a - b;
	}
	public float divide(int a, int b){
		return (float)a / b;
	}
	
	public String testBranch(boolean condition){
		if(condition){
			return "correct";
		}
		return "false";
	}
}
