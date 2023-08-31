package DS_CollectionInterface;

import java.util.Vector;

public class LegacyVector {
	
	
	public static void main(String[] args) {
		
		
		Vector v= new Vector();
		v.add("sana");
		v.addElement("namjoon");
		v.add(10);
		v.add(20);
		
		
		/*
		 * System.out.println(v.lastElement()); System.out.println(v.firstElement());
		 */
		System.out.println(v.remove(3));
		System.out.println(v);	
	
	
	
	
	
	}

}
