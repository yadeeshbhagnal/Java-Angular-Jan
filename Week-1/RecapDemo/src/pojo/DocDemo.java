package pojo;

import java.util.HashSet;
import java.util.Set;

public class DocDemo {

public static void main(String[] args) {
		
		Set<Doctor> set = new HashSet<Doctor>();
		
		set.add(new Doctor(101,"David","ENT"));
		set.add(new Doctor(105,"Adam","Ortho"));
		
		System.out.println(set);
	}

}
