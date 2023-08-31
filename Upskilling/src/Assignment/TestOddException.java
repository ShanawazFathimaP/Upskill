package Assignment;

import java.util.Scanner;

public class TestOddException  {

	
	public static void test(int number)throws OddException {
		if(number%2!=0) {
			throw new OddException("Number should be Even");
		}
		else {
			System.out.println("Number is Even");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Number");
		int var =s.nextInt();
		try {
			test(var);
		}
		catch (OddException e) {
		System.out.println("Error "   +e.getMessage());	
		}
		
		
		
	}

}
