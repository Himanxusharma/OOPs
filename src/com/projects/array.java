package com.projects;

import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int [] age = new int [10];
		age[0] = 10;
		age[1] = 15;
		age[2] = 20;
		age[3] = 25;
		age[4] = 30;
		System.out.println(age.length);
		Arrays.sort(age);
		
		
		int[] age2 = {10,15,16};
		
		//2D array
		int[][] age3 = {{10,20,30},{15,30,35}};
		
		boolean [] isAdult = new boolean[6];
		
		System.out.println(age[9]);
		System.out.println(isAdult[0]);
		
		Scanner sc = new Scanner (System.in);
		for ( int i=0; i<3; i++)
		{
			age[i] = sc.nextInt();
		}
	}

}
