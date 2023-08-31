package Assignment5;

import java.util.Arrays;
import java.util.List;

public class MaxValue {
	public static void main(String[] args)
    {
  
     
        List<Integer> list = Arrays.asList(99, 18, 0, 25, 4);
  
        System.out.print("The maximum value is : ");
  
        // Using stream.max() to get maximum
        // element according to provided Comparator
        // and storing in variable var
        Integer var = list.stream().max(Integer::compare).get();
  
        System.out.print(var);
    }
}


