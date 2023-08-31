package DS_CollectionInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set_HashSet {
	public static void main(String[] args) {
		
		/*
		 * ArrayList al=new ArrayList(); al.add(20); al.add(30); al.add(990);
		 * al.add(209); al.add(200);
		 */
	
		
		List list1=List.of("v","kookie","jin");
		
		
		HashSet hs=new HashSet(list1);
		hs.addAll(list1);
		hs.add("jungkook");
		hs.add(100.90);
		hs.add("abc");
		
		 System.out.println(hs); 
		 
		 System.out.println(hs.contains("abc"));
		 System.out.println(hs.contains("me"));
		 System.out.println(hs.contains(00));
		 
		 System.out.println(hs.remove("abc"));
		 
		 System.out.println(hs);
		 
		 
			/*
			 * Iterator itr=hs.iterator(); while(itr.hasNext()) {
			 * System.out.println(itr.next()); }
			 */
		
		
		
	}

}
