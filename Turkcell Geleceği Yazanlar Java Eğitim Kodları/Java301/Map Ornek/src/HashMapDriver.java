
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDriver {

	public static void main(String[] args) {
		HashMap<Integer, Sehir> hashMap = new HashMap<>();
		hashMap.put(34, new Sehir("Isyanbul", 20_000_000));
		hashMap.put(35, new Sehir("Izmir", 6_000_000));
		hashMap.put(6, new Sehir("Ankara", 8_000_000));
		
		System.out.println(hashMap.size());
		
		Sehir sehir = hashMap.get(34);
		System.out.println(sehir);
		System.out.println("-------------------------------------");
		/*Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key + " " + hashMap.get(key));
		}*/
		
		/*Collection<Sehir> values = hashMap.values();
		Iterator<Sehir> iterator = values.iterator();
		while(iterator.hasNext()) {
			Sehir next = iterator.next();
			System.out.println(next);
		}*/
		
		Set<Entry<Integer, Sehir>> entries = hashMap.entrySet();
		Iterator<Entry<Integer, Sehir>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, Sehir> next = iterator.next();
			System.out.println(next.getKey());
			System.out.println(next.getValue());
			System.out.println("-----------------------");
			
		}
	}
}
