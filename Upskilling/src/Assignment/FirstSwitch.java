package Assignment;

import java.util.Scanner;

public class FirstSwitch {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter grades like A,B,C,D & F");
		
		String grade=s.nextLine().toUpperCase();
		
		switch (grade)
		{
		case "A":
			System.out.println("Excellent Job!!!");
			break;
		
		case "B":
			System.out.println("Good Job!!!");
			break;
		
		case "C":
			System.out.println("Average Job!!!");
			break;
		
		case "D":
			System.out.println("Needs Improvement ");
			break;
			
		case "F":
			System.out.println("Failed");
			break;
			
			
		 default:
			 System.out.println("Invalid Grades");
			 break;
			 
		
		
		
	}
	

}
}