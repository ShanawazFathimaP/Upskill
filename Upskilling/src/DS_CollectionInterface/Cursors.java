package DS_CollectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cursors {
	public static void main(String[] args) {
		List l= new ArrayList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(10);
		
		
		
		
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------");
		
		ListIterator itr1=l.listIterator();
		while(itr1.hasPrevious()) {
			System.out.println(itr1.next());
		}
		
		
	}

}
