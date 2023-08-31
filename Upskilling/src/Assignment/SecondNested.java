package Assignment;

import java.util.Scanner;

public class SecondNested {
	
	public static void main(String[] args) {
		

		Scanner s=new Scanner(System.in);
		System.out.println("Enter grades like A,B,C,D & F");
		
		 String grade=s.nextLine();
		
		if(grade.equalsIgnoreCase("A")) {
			System.out.println("Excellent Job !!!");
		}
		
		else if(grade.equalsIgnoreCase("B")){
			System.out.println("Good Job !");
		}
		
		else if(grade.equalsIgnoreCase("C")){
			System.out.println("Average Job");
		}
		
		else if(grade.equalsIgnoreCase("D")){
			System.out.println("Needs Improvement");
		}
		
		else if(grade.equalsIgnoreCase("F")){
			System.out.println("Failed");
			
		}
		else {
			System.out.println("Invalid Grade");
		}
	}

}
