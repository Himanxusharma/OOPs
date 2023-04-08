package com.projects;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		int[] age = new int[5];
		
		// for loop
		Scanner sc = new Scanner (System.in);
		for ( int i=0; i<3; i++)
		{
			age[i] = sc.nextInt();
		}
		
		
		//while loop
		int i = 100;
		while( i >= 1 )
		{
			System.out.println(i);
			i--;
		}
		
		
		//Do while
		
		int k=100;
		int num;
		do {
			
			num = sc.nextInt();
			System.out.println(num);
			
		} while( num >= 0);
		System.out.println("The END");
		
		
		//Break and continue
		int j = 0;
		while(true)
		{
			if(i==3)
			{
				i=i+1;
				continue;
			}
			System.out.println(j);
			j++;
			if(j>5)
			{
				break;
			}
		}
		

	}

}
