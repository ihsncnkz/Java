
public class Driver {

	public static void main(String[] args) {
		Arac arac = new Arac("34TT1234","X Marka");
		arac.yazdir();
		System.out.println("--------------------------------------");
		
		Araba araba = new Araba("34trf125", "Y Marka", 4, 5);
		araba.yazdir();
		System.out.println("--------------------------------------");
	}
}
