package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set <String> set = new HashSet<String>();
		
		set.add("Yadeesh");
		set.add("Ravi");
		set.add("Adam");
		set.add("Kush");
		
		System.out.println(set);
		
Set <Integer> set2 = new HashSet<Integer>();
		
		set2.add(12);
		set2.add(34);
		set2.add(54);
		set2.add(10);
		
		System.out.println(set2);
		
Set <Integer> set3 = new LinkedHashSet<Integer>();
		
		set3.add(12);
		set3.add(34);
		set3.add(54);
		set3.add(10);
		
		System.out.println(set3);
		for (Integer i : set3) {
			System.out.println(i);
		}
	}

}
