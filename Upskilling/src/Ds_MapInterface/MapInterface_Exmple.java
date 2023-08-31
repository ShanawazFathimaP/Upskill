package Ds_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterface_Exmple {
	public static void main(String[] args) {
		
		
		
		Map map=new HashMap();
		
		map.put(101, "v");
		map.put(102, "sana");
		map.put(103, "sonu");
		map.put(104, "pyari");
		
		/* map.clear(); */
		/*
		 * System.out.println(map.containsKey(103));
		 * 
		 * System.out.println(map.containsValue("sonu"));
		 */
		/* System.out.println(map.get(103)); */
		
		
		map.remove(102);
		
		
		
		
		
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
