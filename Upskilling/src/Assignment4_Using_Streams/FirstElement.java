package Assignment4_Using_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElement {
	public static void main(String[] args)
    {
  
       
        List<Integer> list = Arrays.asList(1,2,4,6,9);
  
        
        Optional<Integer> answer = list.stream().findFirst();
  
        
        if (answer.isPresent()) {
            System.out.println(answer.get());
        }
        else {
            System.out.println("no value");
        }
    }
}

