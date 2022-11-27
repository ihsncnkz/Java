import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i<100; i++) {
			arrayList.add(random.nextInt(100));
		}
		
		System.out.println("ArrayList Size: " + arrayList.size());
		
		/*for(int i = 0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}*/
		
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Integer integers = iterator.next();
			System.out.println(integers);
			if(integers < 50 ) {
				iterator.remove();
			}
		}
		
		System.out.println("Last ArrayList Size: " + arrayList.size());
	}
}
