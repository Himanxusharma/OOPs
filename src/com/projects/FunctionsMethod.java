package com.projects;

public class FunctionsMethod {

	
	public static void RepeatOperations()
	{
		System.out.println("Repeat this operation.");
	}
	
	public static void printName(String name)
	{
		System.out.println(name);
	}
	
	
	public static void addNum(int a, int b)
	{
		int sum = a + b;
		System.out.println(sum);
		
	}
	
	
	
	public static void main(String[] args) {

		//METHODS
		RepeatOperations();
		RepeatOperations();
		RepeatOperations();
		RepeatOperations();
		RepeatOperations();
		
		printName("Himanshu this side.");
		addNum(6,6);


	}

}
