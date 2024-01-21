package collections;

import java.util.Set;
import java.util.TreeSet;

import pojo.Employee;

public class TreeDemo {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("B");
		set.add("C");
		set.add("A");
		set.add("D");
		
		System.out.println(set);
		
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(10);
		set2.add(18);
		set2.add(12);
		set2.add(20);
		
		System.out.println(set2);
		for (Integer i : set2) {
			System.out.println(i);
		}
		
		Set<Employee> set3 = new TreeSet<Employee>(new MyComparator());

		set3.add(new Employee(101,"King",8000));
		set3.add(new Employee(102,"Ravi",9000));

		set3.add(new Employee(104,"Tom",8000));
		set3.add(new Employee(103,"Adam",9000));
		
		System.out.println(set3);
	}

}
