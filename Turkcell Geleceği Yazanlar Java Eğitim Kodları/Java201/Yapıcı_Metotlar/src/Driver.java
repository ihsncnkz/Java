
public class Driver {
	
	int x;
	
	public Driver() {
		System.out.println("ctor");
		x = 20;
	} 
	
	public static void main(String[] args) {
		/*Driver driver = new Driver();
		System.out.println(driver.x);*/
		
		Ogrenci ogrenci = new Ogrenci("AK","calsikan", 15);
		System.out.println(ogrenci.ad);
		System.out.println(ogrenci.soyad);
		System.out.println(ogrenci.yas);
		
		Ogrenci ogrenci2 = new Ogrenci();
		System.out.println(ogrenci2.ad);
		System.out.println(ogrenci2.soyad);
		System.out.println(ogrenci2.yas);
	}
}
