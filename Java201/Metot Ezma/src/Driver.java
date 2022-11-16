
public class Driver {

	public static void main(String[] args) {
		Araba araba = new Araba("X Marka", "Y Marka", 2020);
		System.out.println(araba.toString());
		
		araba.setMarka("Q marka");
		System.out.println(araba.toString());
	}
}
