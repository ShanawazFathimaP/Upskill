package assignment_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemover {
	
	public static void main(String[] args) {

		List<Integer> num= new ArrayList<>();
		num.add(5);
		num.add(10);
		num.add(60);
		num.add(20);
		num.add(50);
		num.add(20);
		
		
		

		List<Integer> uniqueNumber= removeDuplicates(num);
		System.out.println("Original Numbers  :  "+num);
		System.out.println("unique  Numbers  :  "+uniqueNumber);
	}

	private static List<Integer> removeDuplicates(List<Integer> list) {
		
		List<Integer> uniqueList= list.stream()
									.distinct()
									.collect(Collectors.toList());
		return uniqueList;
	}
	
	
	
	

}
