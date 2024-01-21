package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List <Number> list = new LinkedList<Number>();
		list.add(30);
		list.add(20);
		list.add(12);
		list.add(18);
		list.add(4.55);
		list.add(47284567231L);
		System.out.println(list);
		
		System.out.println("Iterator");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("For each loop");
		for(Number n: list)
		{
			System.out.println(n);
		}
	}

}
