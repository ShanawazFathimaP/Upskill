package assignment_2;


import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;


public class StringCaseConverter {
	

	public static void main(String[] args) {

		List<String> str= new ArrayList<>();
		str.add("Hello");
		str.add("How");
		str.add("Are");
		str.add("You");
		
		
		
		
		List<String> uppercasewords=convertToUpperrcase(str);
		System.out.println("Upper case words :  "+uppercasewords);
		
		
		List<String> lowercasewords=convertTolowercase(str);
		System.out.println("Lower case words :  "+lowercasewords);
		
		
	}

	private static List<String> convertToUpperrcase(List<String> str) {
	List<String> uppercaseStrings = str.stream()
			.map(String :: toUpperCase)
			.collect(Collectors.toList());
												
	
	return uppercaseStrings;
	}

	private static List<String> convertTolowercase(List<String> str) {
		List<String> lowercaseStrings = str.stream()
				.map(String :: toLowerCase)
				.collect(Collectors.toList());
		
		
		return lowercaseStrings;
		}
}
