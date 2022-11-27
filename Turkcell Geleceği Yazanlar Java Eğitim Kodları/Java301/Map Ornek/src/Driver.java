import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(34, "istanbul");
		hashMap.put(35, "izmir");
		hashMap.put(6, "ankara");
		// Aynı kay degerine sahip başka bir değer olduğu için bu eleman eklenmez.
		// Ama ilk göderdiğimi değeri aşağıdaki değer ezmiş oldu eğer biz istanbul2 yaparsak istanbul2 değerini geri göderir.
		//hashMap.put(34, "Istanbul");
		
		System.out.println(hashMap.size());
		
		// eğer 34 yerine 10 yazarsak önceden tanımlamadığımız için null değeri geri göderir.
		String string = hashMap.get(34);
		System.out.println(string);
		
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key + " " + hashMap.get(key));
		}
	}
}
