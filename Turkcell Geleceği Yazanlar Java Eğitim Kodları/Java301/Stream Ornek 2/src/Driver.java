import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		/*IntStream.range(1, 10)
			.forEach(System.out::println);
		
		Arrays.stream(new int[] {2,3,5,7,8,9})
			.map((x) -> x * 2)
			.average()
			.ifPresent(System.out::println);
		
		int sum = IntStream.range(1, 101)
				.sum();
		System.out.println(sum);*/
		
		/*Stream.of("1","2","3","4")
			.mapToInt(Integer::parseInt)
			.max()
			.ifPresent(System.out::println);*/
		/*IntStream.range(1, 10)
			.mapToObj((i) -> i + ". Sayi")
			.forEach(System.out::println);*/
		
		/*Stream.of(1.1,2.2,3.3,4.4)
			.mapToInt(Double::intValue)
			.max()
			.ifPresent(System.out::println);*/
		
		Stream.of("Ali","Ahmet","Cem","Burak")
			.filter(new Predicate<String>() {

				@Override
				public boolean test(String t) {
					System.out.println("Çalıstı");
					return true;
				}
			})
			.forEach(System.out::println);
	}
}
