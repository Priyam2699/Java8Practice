package NumericStreams;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(1);
		set.add(2);
		set.forEach(st -> System.out.println(st));

	}

}
