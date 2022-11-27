import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamDriver {

	public static void main(String[] args) {
		int[] numaralar = {2,3,4,5,7,8,9};
		Arrays.stream(numaralar)
		.filter((x)-> x > 3)
		.map((x) -> x * 2)
		.sorted()
		.forEach(System.out::println);
		
		Stream.of("a","g","z","f")
		.findFirst()
		.ifPresent(System.out::println);
	}
}
