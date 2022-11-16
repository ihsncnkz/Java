import java.util.Date;

public class Driver {
	public static void main(String[] args) {
		/*Calisan calisan = new Calisan();
		calisan.setIsim("Ali Can");
		calisan.setMaas(2200);
		calisan.setIseGirisTarihi(new Date());
		
		System.out.println(calisan.getIsim());
		System.out.println(calisan.getMaas());
		System.out.println(calisan.getIseGirisTarihi());*/
		
		
		Kare kare = new Kare();
		kare.setUzunluk(100);
		kare.setX(10);
		kare.setY(5);
		kare.ekranaBastit();
		
		System.out.println(kare.getX());
		
	}
}
