
public class Driver {

	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci(1);
		System.out.println(ogrenci.getNumara());
		
		UnivOgrenci ogrenc2 = new UnivOgrenci(10);
		System.out.println(ogrenc2.getNumara());
		ogrenc2.yazdir();
	}
}
