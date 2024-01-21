package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new LinkedHashMap <Integer,String>();
		
		map.put(105,"Adam");
		map.put(102,"Sam");
		map.put(107, "Ram");
		map.put(105, "Jason");  // will replace value of same key with recent value
		
		System.out.println(map);
		
		Set<Integer> set = map.keySet();
		Iterator <Integer> it = set.iterator(); //generics helping to avoid explicit typecasting
		
		while(it.hasNext())
		{
			Integer k  =it.next();
			System.out.println(k+" "+map.get(k));
		}
		
		Collection <String> list = map.values();
		for(String name:list)
		{
			System.out.println(name);
		}
	}

}
