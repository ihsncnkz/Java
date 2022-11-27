import java.util.Date;

public class Driver {
	
	public static void main(String[] args) {
		/*Calisan calisan = new Calisan();
		calisan.setIsim("Ali Can");
		calisan.setMaas(2200.0);
		calisan.setIseBaslamaTarihi(new Date());
		calisan.yazdir();*/
		
		Calisan calisan = new Calisan("Alican",2200, new Date());
		calisan.yazdir();
	}
}
