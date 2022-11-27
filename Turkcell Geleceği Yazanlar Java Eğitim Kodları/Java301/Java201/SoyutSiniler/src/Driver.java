
public class Driver {
	
	public static void main(String[] args) {
		Oyuncu oyuncu = new Futbolcu();
		oyuncu.setIsim("Hasan");
		oyuncu.setNumara(21);
		oyuncu.sutCek();
		oyuncu.pasVer();
		
		Oyuncu oyuncu2 = new Basketbolcu();
		oyuncu2.setIsim("Hasan");
		oyuncu2.setNumara(21);
		oyuncu2.sutCek();
		oyuncu2.pasVer();
	}
}
