import java.util.ArrayList;
import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		/*int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("-------------------------");
		
		int i = 0;
		while(i < numbers.length) {
			System.out.println(numbers[i++]);
		}
		System.out.println("-------------------------");
		
		int x = 0;
		do {
			System.out.println(numbers[x++]);
		}while(x < numbers.length);*/
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(9);
		
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}
		System.out.println("---------------------------");
		
		// ForEach kullanıla bilmesi için listen Iterable nesnesini implements etmesi gerekiyor.
		for(Integer i:arrayList) {
			System.out.println(i);
		}
	}
}
