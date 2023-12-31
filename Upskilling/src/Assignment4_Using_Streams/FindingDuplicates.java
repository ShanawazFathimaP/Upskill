package Assignment4_Using_Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindingDuplicates {
	public static void main(String[] args) {
		
	
	Integer[] numbers = new Integer[] { 1, 2, 1, 3, 4, 4 };
	 Set<Integer> allItems = new HashSet<>(); 
	Set<Integer> duplicates = Arrays.stream(numbers)
	        .filter(n -> !allItems.add(n)) 
	        .collect(Collectors.toSet());
	System.out.println(duplicates);
}
}


