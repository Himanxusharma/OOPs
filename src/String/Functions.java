package String;
import java.util.*;
public class Functions {

	public static void main(String[] args) {


		String s1 = "Himanshu";
		String s2 = "";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1+12+5665);
		System.out.println(12+5665+s1);
		
		
		System.out.println(s1.concat(s2));
		
		
		System.out.println(String.join(";",s1,s2,s1));
		
		
		System.out.println(s1.subSequence(3, 5)); // return the char sequence value
		System.out.println(s1.substring(3)); // return the string value
		System.out.println(s1.substring(0, 5));
		
		
		String s3 = "this is demo";
		System.out.println(s3.replace("is","was"));
		System.out.println(s3.replaceFirst("is","wasss"));
		System.out.println(s3.replaceAll("is", "waszzz"));
		System.out.println(s3.replaceAll("is(.)","wass"));
		System.out.println(s3.replaceAll("is(.*)", "wassss"));
		
		
		String s= "deepak";
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf("pa"));
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.charAt(4));
		System.out.println(s.contains("z"));
		System.out.println(s.endsWith("k"));
		System.out.println(s.startsWith("a"));
		
		
		String s5= "pak";
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		
		int z= 10;
		String s6 = String.valueOf(z);
		char[] ch = s6.toCharArray();
		System.out.println(s6);
		System.out.println(ch);
		
		
		

	}

}
