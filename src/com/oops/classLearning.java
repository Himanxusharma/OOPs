package com.oops;


class Car{
	
	String color; //Data -> properties
	String model; 
	int number;	
	
	//Members -> functions & methods
	public void driving() {
		System.out.println("User is Driveing the car.");
	}
	
	public void parking() {
		System.out.println("Car is at parking.");
	}
	
	public void speed() {
		System.out.println("User is Exceeding the speed limit.");
	}
	
	public void properties() {
		System.out.println("colour of the " + this.model + " is " + this.color);
		System.out.println("Model of the car is " + this.model);
		System.out.println("Number of the " + this.model + " is " + this.number);
	}
	
	Car(){
		System.out.println("This is manually calling a function .");		
	}
	
	Car(String color,String model, int number){
		this.color = color;
		this.model = model;
		this.number = number;
	}
	
}


public class classLearning {
	public static void main(String args[]) {
		// Intializing the properties.
		// Make a car1 using the properties of car.
		Car car1 = new Car();
		car1.color = "red";
		car1.model = "Maruti";
		car1.number =800;
		
		//Calling methods
		car1.driving();
		car1.parking();
		car1.speed();
		car1.properties();	
		
		// Make a car 2 using the properties of car.
		Car car2 = new Car();
		car1.color = "Matte Black";
		car1.model = "Mercedes S-class";
		car1.number = 999 ;
		
		//Calling methods
		car1.driving();
		car1.parking();
		car1.speed();
		car1.properties();
		
		
		
		
	}
}
