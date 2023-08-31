package Assignment;

import java.util.Scanner;

public class ReverseString {
	String name;
		
	//Using Inbuilt Method
	public static String rev (String name) {

		StringBuilder sb=new StringBuilder(name);
		sb.reverse();
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		
		
		//without inbuilt method
		System.out.println("Enter a String to reverse");
		
		
		Scanner s =  new Scanner(System.in);
		String name= s.nextLine();
				
		System.out.println("After Reversing ");
		
		
		for(int i=name.length(); i>0;--i) 
		{
		  
		  System.out.print(name.charAt(i-1));
		  }
		
		
		
		System.out.println(" " +rev(name));//inbuilt sop
		  
		 
		
		
	}

}
