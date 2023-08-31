package assignment_2;

import java.util.Arrays;
import java.util.List;

public class SecondLargestAndSmallest {
	
	
	
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(12,30,60,40,33,66);
		
		
		int secondSmallest = numbers.stream()
									.distinct()
									.sorted()
									.skip(1)
									.findFirst()
									.orElse(-1);
									
		int secondLargest = numbers.stream()
				.distinct()
				.sorted((a,b) -> b.compareTo(a))
				.skip(1)
				.findFirst()
				.orElse(-1);
									
			System.out.println("List of Numbers :  "+numbers );						
			System.out.println("Second Smallest :  "+secondSmallest );	
			System.out.println("Second  Largest :  "+secondLargest );	
			
			
									
	}

}
