package com.projects;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TRY - CATCH in Exception Handling
		
		
		int[] marks = {32,56,98};
		
		try {
		System.out.println(marks[5]);
		} catch(Exception exception)
		{
			System.out.println("We'll resolve");

		}
		
		System.out.println("After Code");

	}

}
