package com.oops;

public class Vehicle {
	
	
	protected String brand = "Ford";
	public void honk() {
		System.out.println("Pee pee peep ee ! ! !");
		
	}
}
	
	 class Moto extends Vehicle {
		
		private String modelName = "Mustang";
		
		
		public static void main(String[] args) {
				Moto myCar = new Moto();
				myCar.honk();
				System.out.println(myCar.brand + " " + myCar.modelName);
				

		}

		
	}
	



