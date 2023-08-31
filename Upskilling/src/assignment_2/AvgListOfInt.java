package assignment_2;

import java.util.ArrayList;
import java.util.List;



public class AvgListOfInt {
	
public static void main(String[] args) {
	
	List<Integer> num= new ArrayList<>();
	num.add(5);
	num.add(10);
	num.add(30);
	num.add(20);
	num.add(50);
	num.add(60);
	
	
	double average = calculateAverage(num);
	System.out.println("Average  :  "+average);
	
	}

public static double calculateAverage(List<Integer> num) {
	int sum = (int) num.stream()
			.mapToDouble(Integer:: intValue )
			.sum();
	
	double average = (double) sum / num.size();
	return average;
			
}
			
	
	
}



