package com.projects;
import java.util.Scanner;

public class PrintString {

	public static void main(String[] args) {
		
		//variables
		String Name = "Himanshu Sharma";
		String Apartment = Name;
		int Age = 20;
		int Date = Age;
		System.out.println(Name);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter : ");
		String name = sc.nextLine();
		System.out.println(name);

	}

}
