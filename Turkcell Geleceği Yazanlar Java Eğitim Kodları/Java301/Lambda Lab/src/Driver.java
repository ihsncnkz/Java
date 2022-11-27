import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void cinsiyeteGoreFiltrele(List<Kisi> kisiler , Kisi.Cinsiyet cinsiyet) {
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if (kisi.getCinsiyet().equals(cinsiyet)) {
				System.out.println(kisi);
			}
		}
	}
	
	public static void yasaGoreListele(List<Kisi> kisiler, int yas) {
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if (kisi.getYas() >= yas) {
				System.out.println(kisi);
			}
		}
	}
	
	public static void yasaAraligaGoreListele(List<Kisi> kisiler, int min, int max) {
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if (kisi.getYas() > min && kisi.getYas() <= max) {
				System.out.println(kisi);
			}
		}
	}
	
	public static void kisiFiltrele(List<Kisi> kisiler, KisiFiltresi kisiFiltrele) {
		for(int i =0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if (kisiFiltrele.filtrele(kisi)) {
				System.out.println(kisi);
			}
		}
	}
	
	public static void main(String[] args) {
		Kisi kisi1 = new Kisi("Ali Can", LocalDate.parse("1990-11-23"), "ali.can@example.com", Kisi.Cinsiyet.ERKEK);
		Kisi kisi2 = new Kisi("Seyhan Çalışkan", LocalDate.parse("1998-01-01"), "seyhan.caliskan@example.com", Kisi.Cinsiyet.KADIN);
		Kisi kisi3 = new Kisi("Tuğrul Yılmaz", LocalDate.parse("2020-05-29"), "tugrul.yilmaz@example.com", Kisi.Cinsiyet.ERKEK);
		
		/*System.out.println(kisi1);
		System.out.println(kisi2);
		System.out.println(kisi3);*/
		
		ArrayList<Kisi> kisiler = new ArrayList<>();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		
		//cinsiyeteGoreFiltrele(kisiler, Kisi.Cinsiyet.KADIN);
		//yasaGoreListele(kisiler, 1);
		//yasaAraligaGoreListele(kisiler, 0,5);
		
		/*kisiFiltrele(kisiler, new KisiFiltresi() {

			@Override
			public boolean filtrele(Kisi kisi) {
				return kisi.getYas() > 15 && kisi.getCinsiyet().equals(Kisi.Cinsiyet.ERKEK);
			}
			
		});*/
		
		kisiFiltrele(kisiler, (k) -> k.getYas()>=15 && k.getCinsiyet().equals(Kisi.Cinsiyet.KADIN));
		
	}
}
