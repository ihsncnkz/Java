import java.util.Iterator;
import java.util.LinkedHashSet;

public class Driver {

	public static void main(String[] args) {
		/*LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
		hashSet.add(2);
		hashSet.add(5);
		hashSet.add(3);
		hashSet.add(3);
		hashSet.add(4);
		
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
		System.out.println("-----------------------");
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}*/
		
		LinkedHashSet<Araba> hashSet = new LinkedHashSet<>();
		hashSet.add(new Araba("34ABC1234" , "X" , "A"));
		hashSet.add(new Araba("03ABC1234" , "Y" , "B"));
		hashSet.add(new Araba("35ABC1234" , "Z" , "C"));
		hashSet.add(new Araba("35ABC1234" , "Z" , "C"));
		
		Iterator<Araba> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
