package DS_CollectionInterface;

import java.util.Stack;

public class LegacyStack {
	public static void main(String[] args) {
		
		
		Stack s= new Stack();
		s.push("jin");
		s.push("v");
		s.push(20);
		s.push(80.9);
		

		
		
		  System.out.println(s.pop()); System.out.println(s);
		  
		  System.out.println("------------"); System.out.println(s.peek());
		  System.out.println(s); System.out.println("------------");
		 
		
		System.out.println(s.search("jin"));
		
		System.out.println(s.empty());
		
		
	}

}
