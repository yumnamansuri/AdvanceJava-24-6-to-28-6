package Code24_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamAPIDemo {

	public static void main(String[] args) {
		
		//Create a Stream from set of values
		
		Stream<Integer> stream = Stream.of(10,20,30,40,50,60,70);

		//counting the values
		
		System.out.println(stream.count());  //1 st Method for printing stream value
		
		//For - Each Loop
		
		//stream.forEach(System.out::println); // printing stream value ---> another way
		
		
	// creating array
		Integer[] values = new Integer[] {10,20,30,13,10,11,12,17};
		
	// creating the stream from array
		
		stream = Arrays.stream(values);
		
	//MAP
		System.out.println("Square of " + Arrays.toString(values) + "is as follows :-");
	
		stream.map(num -> num * num).forEach(System.out::println);
	
	//LIMIT
		
		System.out.println("First 2 Elements are => ");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		
	//SKIP
		
		System.out.println("Elements excepts first 4 => ");
		Arrays.stream(values).skip(4).forEach(System.out::println);
		
	//DISTINCT
		
		System.out.println("Distinct Elements are => ");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		List<String> words = Arrays.asList("Hello","Stream","Learning");
		
		 // creating a stream from a List
		Stream<String> stream1 = words.stream();
		
		//MAP
		
			//toUpperCase
		
			System.out.println("Strings in Upper Case => ");
			List<String> s1 = stream1.map(str -> str.toUpperCase()).collect(Collectors.toList());
			System.out.println(s1);


			//toLowerCase
			
			stream1 = words.stream();
			stream1.map(str -> str.toLowerCase()).forEach(System.out::println);
			System.out.println(words);
			
		//Collect --> Collectors --> applicable in list and set
		
		
	}

}
