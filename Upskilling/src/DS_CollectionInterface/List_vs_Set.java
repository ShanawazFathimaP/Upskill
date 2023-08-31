package DS_CollectionInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

//Difference between list and array
public class List_vs_Set {

	public static void main(String[] args) {

		// list example
		System.out.println("List example");
		List l = new ArrayList();
		l.add(100);
		l.add(20);
		l.add(10);
		l.add(60);
		l.add(null);
		l.add(null);

		System.out.println(l);

		// using Iterator
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------");

		ListIterator itr1 = l.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("--------------------------------------");

		// set example

		System.out.println("Set example");
		Set s = new HashSet();
		s.add(40);
		s.add(40);
		s.add(20);
		s.add(10);
		s.add(null);
		s.add(null);

		// there is no listiterator method available in set
		Iterator itr2 = s.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}
}
