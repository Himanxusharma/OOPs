package abs;

interface I1{	
	void show();
	void display();
	//body of method is created by only these threee
	default void print( ){
			}
	
	static void see()
	{
		
	}
	
	private void nothing()
	{
		
	}
	
	
	
}


	interface I2{
		
		
	}



class Test implements I1,I2{
	
	
	public void show() {
		
		System.out.println("Hello");
	
	}
	
	public void see()
	{
		
	}
	public void display()
	{
		
	}
	public void print()
	{
		
	}
	
	public static void main(String args[]) {
		
		Test  t = new Test();
		t.show();

	}
	
	
	
	
	
	
}