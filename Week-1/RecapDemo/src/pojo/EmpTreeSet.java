package pojo;

import java.util.HashSet;
import java.util.Set;

public class EmpTreeSet {

	public static void main(String[] args) {
		
		Set<Employee> set = new HashSet<Employee>();
		
		set.add(new Employee(101,"King",8000));
		set.add(new Employee(102,"Ravi",9000));
		
		System.out.println(set);
	}

}
