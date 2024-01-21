package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import collections.MyComparator;
import pojo.Employee;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		

		Map<Integer,String> map = new TreeMap <Integer,String>();
		
		map.put(105,"Adam");
		map.put(102,"Sam");
		map.put(107, "Ram");
		map.put(104, "Jason");
		
		System.out.println(map);  //getting values in asc order
	}
	
	/*
	 * Map<Employee,String> map3 = new TreeMap<Employee,String>(new MyComparator());
	 * 
	 * map3.put(new Employee(101,"King",8000),"Hyderabad"); map3.put(new
	 * Employee(102,"Ravi",9000),"Pune");
	 * 
	 * map3.put(new Employee(104,"Tom",8000),"Chennai"); map3.put(new
	 * Employee(103,"Adam",9000),"Banglore");
	 */

}
