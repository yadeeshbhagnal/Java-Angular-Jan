package streamapi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		List <Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(20);
		list.add(12);
		list.add(30);
		list.add(100);
		list.add(20);
		list.add(50);
		
		Stream <Integer> stream = list.stream();
		
		//stream.limit(3).forEach(System.out::println);
		
		//stream.skip(3).forEach(System.out::println);
		
		//stream.distinct().forEach(System.out::println);
		
		Integer result = stream.reduce((a,b)->{return a+b;}).orElse(0);
		System.out.println(result);
		
	}

}
