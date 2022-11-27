import java.util.Iterator;
import java.util.Vector;

public class VectorDriver {

	public static void main(String[] args) {
		Vector<Kitap> vector = new Vector<>();
		vector.add(new Kitap("X" , 2022, new Yazar("Ali" , "Can")));
		vector.add(new Kitap("Y" , 2019, new Yazar("Gamze" , "Dal")));
		vector.add(new Kitap("Z" , 2021, new Yazar("Kamil" , "Ata")));
		
		System.out.println(vector.size());
		System.out.println("-----------------------------");
		System.out.println(vector.capacity());
		System.out.println("-----------------------------");
		
		/*for (int i = 0; i < vector.size(); i++ ) {
			System.out.println(vector.get(i));
		}*/
		
		Iterator<Kitap> iterator = vector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
