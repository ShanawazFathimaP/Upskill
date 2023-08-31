package DS_CollectionInterface;

import java.util.Enumeration;
import java.util.Vector;

public class Enum_Cursor {
	public static void main(String[] args) {
		
		
		Vector v=new Vector();
		v.add(10);
		v.add("sana");
		v.add(10.3);
		v.add('c');
		
		
		/* System.out.println(v); */
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) 
		{
			System.out.println(e.nextElement());
			
		}
		
		Enumeration e1=v.elements();
		while(e1.hasMoreElements()) 
		{
			System.out.println(e1.nextElement());
			
		}
		
		
	}

}
