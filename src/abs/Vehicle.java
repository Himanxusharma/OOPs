package abs;
	abstract class Vehicle{
		
		int tyres;
		int model;
		abstract void start();
		abstract void brake();
	}
	class Car extends Vehicle{
		
		void start() {
			
			System.out.println("The car is starting... ...");
		}
		
		void brake()
		{
			System.out.println("The car is stopped... ... ");
		}
			

		public static void main(String args[]) {
		Car c = new Car();
		c.start();
		c.brake();	
	}

	}
