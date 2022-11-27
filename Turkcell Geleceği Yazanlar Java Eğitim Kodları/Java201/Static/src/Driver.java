
public class Driver {
	
	public static void merhaba() {
		System.out.println("Merhaba");
	}
	
	public static void main(String[] args) {
		Driver.merhaba();
		
		// Javadaki math sınıfının bütün fonksiyonları static'tir.
		
		Math.pow(2,3);
		Math.sqrt(6);
		
		int parseint = Integer.parseInt("6");
		
		HesapMakinesi.topla(5, 6);
		HesapMakinesi.cikar(8, 9);
		HesapMakinesi.bol(2, 8);
		
	}
}
