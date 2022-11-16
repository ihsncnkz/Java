import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		Calisan calisan1 = new Calisan();
		calisan1.BilgileriYazdir();
		System.out.println("---------------");
		Calisan calisan2 = new Calisan("Alican");
		calisan2.BilgileriYazdir();
		System.out.println("---------------");
		Calisan calisan3 = new Calisan("Alican", "IT");
		calisan3.BilgileriYazdir();
		System.out.println("---------------");
		Calisan calisan4 = new Calisan("Alican", "IT", new Date());
		calisan4.BilgileriYazdir();
		System.out.println("---------------");
	}
}
