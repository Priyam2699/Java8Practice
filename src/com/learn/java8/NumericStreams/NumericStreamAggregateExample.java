package NumericStreams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {

		int sum = IntStream.rangeClosed(1, 50).sum();

		System.out.println(sum);

		OptionalInt max = IntStream.rangeClosed(1, 50).max();

		System.out.println(max.getAsInt());

		int asInt = IntStream.rangeClosed(1, 50).min().getAsInt();

		System.out.println(asInt);

		double asDouble = IntStream.rangeClosed(1, 50).average().getAsDouble();

		System.out.println(asDouble);
	}

}
