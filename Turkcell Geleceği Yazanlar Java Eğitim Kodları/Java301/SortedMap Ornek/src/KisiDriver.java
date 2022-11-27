import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class KisiDriver {

	public static void main(String[] args) {
		SortedMap<Integer, Kisi> sortedMap = new TreeMap<>();
		sortedMap.put(1, new Kisi("123","Ahmet","Kalkan",Cinsiyet.BAY));
		sortedMap.put(2, new Kisi("456","Fatma","Ak",Cinsiyet.BAYAN));
		sortedMap.put(3, new Kisi("789","Nusret","Ok",Cinsiyet.BAY));
		
		System.out.println(sortedMap.size());
		
		Set<Entry<Integer,Kisi>> entrySet = sortedMap.entrySet();
		Iterator<Entry<Integer, Kisi>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, Kisi> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
