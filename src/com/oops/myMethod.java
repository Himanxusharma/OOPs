package com.oops;
// Multiple methods can have the same name as long as the number and/or type of parameters are different.
public class myMethod {

	
		static float myMethod2(float n, String s )
		{
			
			n = n*100;
			return n;
			//System.out.println("Hello method is called successfully " + n + s);
		}
		
		
		
		
		static int addition(int a, int b)		
		{
			return a+b;
		}
		
		
		static float addition(float a, float b)
		{
			return a+b;
		}
		
		static double addition(double a, double b)
		{
			return a+b;
		}
		
		static long addition(long a, long b)
		{
			return a+b;
		}
		
		
		
		
		
		
	public static void main(String[] args) {
		
		//myMethod2(1112, "Hello"); // Calling a method
		//System.out.println(myMethod2(22,"Hello"));
		
		System.out.println(addition(1231231231.23L,1231231.23123D));
		
		
		
	}

}
