import com.example.Araba;

public class Driver {
	public static void main(String[] args) {
		//Ogrenci ogrenci = new Ogrenci();
		/*ogrenci.ad = "Goktug";
		ogrenci.soyad = "Çalışkan";
		ogrenci.numara = 1;*/
		//ogrenci.numarayiYazdır();
		
		/*Araba sınıfı ile aynı pakette yer almadığı için erişemedik*/
		//com.example.Araba araba = new com.example.Araba();
		/*Araba araba = new Araba();
		araba.marka = "Honda";*/
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.ad = "Goktug";
		ogrenci.soyad = "Çalışkan";
		ogrenci.numara = 1;
		ogrenci.setYas(12);
		
		ogrenci.bilgileriYazdir();
	}
}
