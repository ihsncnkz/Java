import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Driver {

	public static void main(String[] args) {
		/*Matematik mat = new Matematik() {

			@Override
			public void islem(double a, double b) {
				System.out.println(a + b);
			}
		};*/
		
		/*Matematik mat = (x,y) -> System.out.println(x + y);
		mat.islem(25, 8);
		
		Matematik mat2 = (x,y) -> System.out.println(x - y);
		mat2.islem(25, 8);*/
		
		ArrayList<String> sehirler = new ArrayList<>();
		sehirler.add("Bursa");
		sehirler.add("Istanbul");
		sehirler.add("Afyonkarahisar");
		sehirler.add("Ankara");
		sehirler.add("Elazıg");
		
		/*sehirler.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});*/
		// Consumer
		//sehirler.forEach((s) -> System.out.println(s));
		
		/*Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.startsWith("A");
			}	
		};*/
		// Predicate'in amacı kendisine verilen değeri bir koşul içerisinde değerlendirdikten sonra bir deger döndürmektedir.
		Predicate<String> predicate2 = (s) -> s.startsWith("B");
		for (int i = 0; i < sehirler.size(); i++ ) {
			String sehir = sehirler.get(i);
			if(predicate2.test(sehir)) {
				System.out.println(sehir);
			}
		}
	}
}
