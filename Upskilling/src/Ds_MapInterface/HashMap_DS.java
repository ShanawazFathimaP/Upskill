package Ds_MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_DS {
	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap();
		hm.put(101, "Rm");
		hm.put(102, "jin");
		hm.put(103, "suga");
		hm.put(104, "hobi");
		hm.put(105, "jimin");

		System.out.println(hm);
		//this is new way of getting elementss
		for(Map.Entry me:hm.entrySet())
		{
			System.out.println(me.getKey()+"  "+me.getValue()+"  ");
		}
		
		
		

		// we can retieve elemets by usinng iterator and set
		// in both the cases we use Map.Entry interface
		/*
		 * Set set=hm.entrySet(); System.out.println(set);
		 */
		// by using iterator we can print key & values separately//this is old way of getting elements
		/*
		 * Iterator itr=set.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); Map.Entry entry=(Map.Entry)itr.next();
		 * System.out.println(entry.getKey()+"   " +entry.getValue()+"   ");
		 * 
		 * 
		 * }
		 */

	}

}
