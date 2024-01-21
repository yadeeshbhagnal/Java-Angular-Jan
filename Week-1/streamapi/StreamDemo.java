package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		Stream stream = Stream.of(10,20,30,40,50);
		long count = stream.count();
		System.out.println(count);
		
		
		
		String names[] = {"ravi", "adam", "tom", "smith"};
		Stream <String> stream2 = Arrays.stream(names);
		
		stream2.map((str)->{System.out.println(str);return str.length();})
		.forEach((len)->{System.out.println(len);});
		
//		List list = Arrays.asList(names);
//		
//		Stream<String> stream3 = list.stream();
//		
//		stream3.map((str)->{return str.length();})
//		.filter((len)->{return len>7;})
//		.forEach(System.out::println);
	}

}
