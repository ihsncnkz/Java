import java.util.Scanner;

public class Driver {
	
	public static void merhaba() {
		System.out.println("Merhaba");
	}
	
	public int topla(int x, int y) {
		int toplam = x + y;
		return toplam;
	}
	
	// Java uygulamalarında mutlaka bir main metotu olmak zorundadır!
	public static void main(String[] args) {
		// Eger driver metotodundan bir istek alamaz isek metot çalışmaz!
		// Çalışması için Static olması gerekir!
		/*Driver driver = new Driver();
		driver.merhaba();*/
		
		// Static olmus hali!
		/*merhaba();
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		Driver driver = new Driver();
		int sonuc = driver.topla(a,b);
		System.out.println(sonuc);*/
		
		
		HesapMakinesi hesapmakinesi = new HesapMakinesi();
		float toplama = hesapmakinesi.topla(4.0f, 5.0f);
		System.out.println(toplama);
		System.out.println(hesapmakinesi.cikar(6.0f, 7.0f));
		System.out.println(hesapmakinesi.carp(5.0f, 6.0f));
		System.out.println(hesapmakinesi.bol(8.0f, 2.0f));
		System.out.println(hesapmakinesi.kare(2));
		System.out.println(hesapmakinesi.karekok(9));
		
		
		
	}
}
