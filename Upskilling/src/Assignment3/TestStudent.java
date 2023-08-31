package Assignment3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class TestStudent {
	
	public static void main(String[] args) {
		
		ArrayList<Student> s= new ArrayList<Student>();
		s.add(new Student("Vasanth", 24, 9.5));
		s.add(new Student("Sana", 23, 8.5));
		s.add(new Student("Priya", 26, 5.5));
		s.add(new Student("Bts", 25, 9.9));
		
		
		//Sorting according to age
		Collections.sort(s,Comparator.comparingInt(var1 -> var1.age));
		
		Collections.reverse(s);
		
		for(Student stu:s ) {
			
			System.out.println(stu.name +"  "+stu.age+"   "+stu.grade);
		}
		
		System.out.println("---------------------------------------------------------");
		
		//by name 
		
		Collections.sort(s,Comparator.comparing(var2 -> var2.name));
		
		for(Student stu:s ) {
			
			System.out.println(stu.name +"  "+stu.age+"   "+stu.grade);
		}
		
		
		System.out.println("---------------------------------------------------------");
		
		
		
		Collections.sort(s, Comparator.comparingDouble(var3 -> var3.grade));
		
		Collections.reverse(s);

		for (Student stu : s) {

			System.out.println(stu.name + "  " + stu.age + "   " + stu.grade);
		}

		
		
		
		
		
	}

}
