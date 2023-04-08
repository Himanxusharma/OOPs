package com.oops;
import java.util.*;
class Employe {

	
		float salary = 40000;
		
}	
		class programmer extends Employe
		{
			float bonus = 10000;
			
			
			public static void main(String[] args) {
			
				programmer p = new programmer();
				System.out.println("Salary : " + p.salary);
				System.out.println("Bonus : " + p.bonus);
				
			}
			}
		

