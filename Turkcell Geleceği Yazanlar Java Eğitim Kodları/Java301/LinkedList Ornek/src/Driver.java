import java.util.Iterator;
import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		LinkedList<Integer> integers = new LinkedList<>();
		integers.add(10);
		integers.add(20);
		integers.add(33);
		// Aynı değerleri liste içerisinde taşıya bilirizi.
		integers.add(20);
		
		// index ile eleman ekleme
		integers.add(3, 55);
		
		System.out.println("Eleman sayısı: " + integers.size());
		Iterator<Integer> iterator = integers.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}
		
		System.out.println("-------------------------------");
		System.out.println(integers.get(0));
		System.out.println(integers.get(integers.size() - 1));
		
		System.out.println("-------------------------------");
		integers.addFirst(38);
		System.out.println(integers.getFirst());
		
		System.out.println("-------------------------------");
		integers.addLast(52);
		System.out.println(integers.getLast());
		
		System.out.println("-------------------------------");
		int indexOf = integers.indexOf(33);
		System.out.println(indexOf);
		
		System.out.println("-------------------------------");
		System.out.println(integers.indexOf(20));
		System.out.println(integers.lastIndexOf(20));
		
		// Listeden eleman kaldırma!
		integers.remove(); // Listenin en başındaki elemanı kaldırır!
		integers.remove(4); // 4. index'teki elemanı kaldırır.
		integers.remove(33); // degeri 33 olan elemanı kaldırır.
	}
}
