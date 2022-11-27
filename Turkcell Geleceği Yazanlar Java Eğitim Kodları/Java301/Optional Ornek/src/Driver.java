import java.util.Optional;

public class Driver {

	public static String test() {
		System.out.println("Test Çalıştı!");
		return "test";
	}
	
	public static void main(String[] args) {
	
		/*Optional<String> bosNesne = Optional.empty();
		System.out.println(bosNesne.isPresent());
		System.out.println("-------------------");
		
		String deger = "Merhaba";
		Optional<String> optional = Optional.of(deger);
		System.out.println(optional.isPresent());
		System.out.println("-------------------");
		
		String s = null;
		// Optional<String> optional2 = Optional.of(s);
		Optional<String> optional2 = Optional.ofNullable(s);
		System.out.println(optional2.isPresent());
		System.out.println("-------------------");
		
		String s2 = "Selam";
		
		if(s2 != null) {
			System.out.println(s2.length());
		}
		
		Optional<String> optional3 = Optional.ofNullable(s2);
		optional3.ifPresent((x) -> System.out.println(x.length()));
		System.out.println("-------------------");*/
		
		/*String bosIsim = "Veli";
		String isim = Optional.ofNullable(bosIsim).orElse("Ali");
		System.out.println(isim);
		
		String sehir = "Ankara";
		String sehir2 = Optional.ofNullable(sehir).orElseGet(() -> "Istanbul");
		System.out.println(sehir2);*/
		
		String bos = "a";
		String string = Optional.ofNullable(bos).orElse(test());
		// bos'un içerisinde deger olduğu için orElseGet metodu çalışmadı!
		String string2 = Optional.ofNullable(bos).orElseGet(()->test());
		
		System.out.println(string);
		System.out.println(string2);
	}
}
