
public class Driver {

	public static void main(String[] args) {
		/*Sekil sekil = new Sekil();
		sekil.alan();
		
		Kare kare = new Kare(10);
		kare.alan();
		
		Daire daire = new Daire(10);
		daire.alan();
		
		Dikdortgen dikdortgen = new Dikdortgen(20,10);
		dikdortgen.alan();*/
		
		Sekil sekil = new Kare(2);
		sekil.alan();
		
		Sekil sekil2 = new Daire(2);
		sekil2.alan();
		
		Sekil sekil3 = new Dikdortgen(2,3);
		sekil3.alan();
	}
}
