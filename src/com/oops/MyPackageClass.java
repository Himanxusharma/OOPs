package mypack;

public class MyPackageClass {

	public static void main(String[] args) {
		System.out.println("This is my package!");

	}

}


//C:\Users\Your Name>javac -d . MyPackageClass.java
//This forces the compiler to create the "mypack" package.
//
//The -d keyword specifies the destination for where to save the class file. 
//You can use any directory name, like c:/user (windows), or, 
//if you want to keep the package within the same directory, you can use the dot sign ".", 
//like in the example above.