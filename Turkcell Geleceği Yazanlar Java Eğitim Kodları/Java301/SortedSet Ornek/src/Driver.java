import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		/*SortedSet<String> sortedSet = new TreeSet();
		sortedSet.add("Ahmet");
		sortedSet.add("Hasan");
		sortedSet.add("Kamil");
		sortedSet.add("Tuğrul");
		sortedSet.add("Kaan");
		
		Iterator<String> iterator = sortedSet.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}*/
		
		SortedSet<Ogrenci> sortedSet = new TreeSet<>();
		sortedSet.add(new Ogrenci(5, "Ahmet"));
		sortedSet.add(new Ogrenci(1, "Hakan"));
		sortedSet.add(new Ogrenci(9, "Gamze"));
		// isimler aynı olduğu için sortedSet içerisine eklemedi.
		sortedSet.add(new Ogrenci(5, "Ahmet2")); 
		
		System.out.println(sortedSet.size());
		
		Iterator<Ogrenci> iterator = sortedSet.iterator();
		while(iterator.hasNext()) {
			Ogrenci next = iterator.next();
			System.out.println(next);
		}
	}
}
