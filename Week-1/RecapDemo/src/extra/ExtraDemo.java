package extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraDemo {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<Integer>();
		
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(60);
		
		Object[] arr = list.toArray();
		System.out.println(arr);
		
		int a[]= {22,23,53,56,63};
		
		List<int[]> list2 = Arrays.asList(a);

	}

}
