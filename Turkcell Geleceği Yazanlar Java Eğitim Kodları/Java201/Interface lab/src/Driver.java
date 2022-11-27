
public class Driver {
	public static void main(String[] args) {
		Elma[] elmalar = new Elma[10];
		elmalar[0] = new Elma(10, "Sarı");
		elmalar[1] = new Elma(25, "Yeşil");
		elmalar[2] = new Elma(100, "Kırmızı");
		elmalar[3] = new Elma(12, "Sarı");
		elmalar[4] = new Elma(17, "Yeşil");
		elmalar[5] = new Elma(23, "Kırmızı");
		elmalar[6] = new Elma(7, "Kırmızı");
		elmalar[7] = new Elma(18, "Yeşil");
		elmalar[8] = new Elma(26, "Sarı");
		elmalar[9] = new Elma(30, "Yeşil");
		
		/*renkFiltrele("Kırmızı", elmalar);
		System.out.println("----------------------------");
		agirlikFiltrele(55, elmalar);
		System.out.println("----------------------------");
		agirlikFiltrele2(55, elmalar);*/
		
		/*RenkFiltresi renkFiltresi = new RenkFiltresi();
		filtrele(renkFiltresi, elmalar);
		
		AgirlikFiltresi agirlikFiltre = new AgirlikFiltresi();
		filtrele(agirlikFiltre, elmalar);*/
		
		ElmaFiltresi elmafiltresi = new AgirlikFiltresi();
		filtrele(elmafiltresi, elmalar);
		
	}
	
	public static void filtrele(ElmaFiltresi elmafiltresi, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elmafiltresi.filtrele(elma)) {
				System.out.println(elma.getAgirlik() + " " + elma.getRenk());
			}
		}
	}
	
	public static void renkFiltrele(String renk, Elma[] elmalar) {
		for(int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if(elma.getRenk().equals(renk)) {
				System.out.println(elma.getRenk() + " " + elma.getAgirlik());
			}
		}
	}
	
	public static void agirlikFiltrele(int agirlik, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getAgirlik() >= agirlik) {
				System.out.println(elma.getAgirlik() + " " + elma.getRenk());
			}
		}
	}
	
	public static void agirlikFiltrele2(int agirlik, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getAgirlik() <= agirlik) {
				System.out.println(elma.getAgirlik() + " " + elma.getRenk());
			}
		}
	}
}
