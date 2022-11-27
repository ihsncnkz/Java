import java.util.Vector;

public class Driver {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>(4);
		vector.add("Kedi");
		vector.add("Kopek");
		vector.add("Kaplan");
		vector.add("At");
		vector.add("Tavsan");
		
		for (int i = 0; i < vector.size(); i++) {
			String string = vector.get(i);
			System.out.println((i) + " " + string);
		}
		
		System.out.println("---------------------");
		System.out.println(vector.capacity());
		
		System.out.println("---------------------");
		System.out.println(vector.contains("Kedi"));
		
		System.out.println("---------------------");
		System.out.println(vector.contains("Serce"));
		
		System.out.println("---------------------");
		int indexOf = vector.indexOf("Kaplan");
		System.out.println(indexOf);
		
		int indexOf2 = vector.indexOf("Serce");
		System.out.println(indexOf2);
		
		// Vectorün içerisindeki bütün elemanlar temizlemek için
		vector.clear();
		System.out.println("---------------------");
		System.out.println(vector.size());
		System.out.println(vector.capacity());
	}
}
