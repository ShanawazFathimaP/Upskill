package Assignment;

import java.util.Scanner;

public class FactNum {
	
	public static void main(String[] args) {
		
		
		int A=1;
		int B=1;
		
		System.out.println("Enter the Number!!!!");
		Scanner s= new Scanner(System.in);
		int c=s.nextInt();
		
			  
		while(A<=c) {     
			B=B*A;
			A++;
		}
		System.out.println("Factorial is " +B);
		
	
		
		
	}
	

}
