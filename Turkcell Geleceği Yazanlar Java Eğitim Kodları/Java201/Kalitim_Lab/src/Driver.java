
public class Driver {
	public static void main(String[] args) {
		Kisi kisi = new Kisi();
		kisi.setIsim("Tugrul Caliskan");
		System.out.println(kisi.getIsim());
		
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setIsim("Ali Can");
		ogrenci.setDers("Matematik");
		System.out.println(ogrenci.getDers());
		System.out.println(ogrenci.getIsim());
		
		UniversiteOgrenci uniOg = new UniversiteOgrenci();
		uniOg.setIsim("Serat Çalıskan");
		uniOg.setDers("Trigonametri");
		uniOg.setKampus("Taksim");
		System.out.println(uniOg.getIsim());
		System.out.println(uniOg.getDers());
		System.out.println(uniOg.getKampus());
		
		Ogretmen ogretmen = new Ogretmen();
		ogretmen.setIsim("Ahmet Yılmaz");
		ogretmen.setOkul("X ilk ogretirm okulu");
		System.out.println(ogretmen.getIsim());
		System.out.println(ogretmen.getOkul());
		
		Doktor doktor = new Doktor();
		doktor.setIsim("Emre Aydın");
		doktor.setBrans("Beyin Cerrahisi");
		System.out.println(doktor.getIsim());
		System.out.println(doktor.getBrans());
		
	}
}
