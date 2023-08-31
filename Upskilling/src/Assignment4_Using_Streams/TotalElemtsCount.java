package Assignment4_Using_Streams;

import java.util.Arrays;
import java.util.List;

public class TotalElemtsCount {
	public static void main(String[] args)
    {
  
        
        List<Integer> list = Arrays.asList(1,2,5,6,7);
  
        
        long total = list.stream().distinct().count();
  
  
        System.out.println(total);
    }
}


