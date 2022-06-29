package NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static int sumofNumbers(List<Integer> list) {
		return list.stream().reduce(0, (x, y) -> x + y);

	}

	public static int sumOfIntStream() {
		return IntStream.rangeClosed(1, 6).sum();
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println("Sum of N numbers :" + sumofNumbers(integers));
		System.out.println("Sum of N numbers using IntStream: " + sumOfIntStream());

	}

}
