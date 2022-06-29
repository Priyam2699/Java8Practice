package NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnBoxingExample {

	public static List<Integer> boxing() {

		return IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
	}
	
	
	
	public static int unboxing(List<Integer> list)
	{
		
		return list.stream().mapToInt(Integer:: intValue).sum();
		
		
	}

	public static void main(String[] args) {

		System.out.println("Boxing " + boxing());
		
		List<Integer> integers  = boxing();
		
		System.out.println(unboxing(integers));

	}

}
