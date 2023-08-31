package Assignment4_Using_Streams;

	import java.util.*;

	public class StartingWith1 {
	    public static void main(String args[]) {
	            List<Integer> myList = Arrays.asList(10,15,8,19,25,18,32);
	            myList.stream()
	                  .map(s -> s + "") // here it Converts integer to String
	                  .filter(s -> s.startsWith("1"))
	                  .forEach(System.out::println);
	    }
	}


