
public class Driver {
	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.isim = "ihsan";
		ogrenci.yas = 3;
		
		Driver driver = new Driver();
		driver.ogrenciBilgileri(ogrenci);
		
		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);
	}
	
	public void ogrenciBilgileri(Ogrenci ogrenci) {
		ogrenci = new Ogrenci();
		ogrenci.isim = "Hasan";
		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);
	}
}
