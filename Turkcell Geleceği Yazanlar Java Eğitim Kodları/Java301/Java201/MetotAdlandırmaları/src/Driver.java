
public class Driver {
	private void helloWorld() {
		System.out.println("Hello World!");
	}
	
	// Aynı isimde başka bir metot olusturamazsınız!
	// Eger aldığı parametler farklı ise java buna izin veriyor!
	private int topla(int x, int y) {
		int toplam = x + y;
		return toplam;
	}
	
	private float topla(float x, int y) {
		float toplam = x + y;
		return (float) toplam;
	}
	
	private float topla(float x, float y) {
		float toplam = x + y;
		return (float) toplam;
	}
	
	private int topla(byte x, byte y) {
		int toplam = x + y;
		return toplam;
	}
	
	public static void main(String[] args) {
		new Driver().helloWorld();
		Driver driver = new Driver();
		int sonuc =driver.topla(20, 30);
		System.out.println(sonuc);
	}
}
