
public class Driver {
	public static void main(String[] args) {
		Sekil sekil = new Sekil();
		sekil.setPosX(10);
		sekil.setPosY(10);
		sekil.setRenk("Lacivert");
		sekil.alanHesapla();
		
		Kare kare = new Kare();
		kare.setPosX(10);
		kare.setPosY(10);
		kare.setRenk("Sarı");
		kare.setKenaerUzunlugu(10);
		kare.alanHesapla();
		
		//System.out.println(kare.getKenarUzunlugu());
		
		Dikdortgen dikdortgen = new Dikdortgen();
		dikdortgen.setPosX(20);
		dikdortgen.setPosY(30);
		dikdortgen.setRenk("Siyah");
		
		dikdortgen.setUzunluk(5);
		dikdortgen.setYukseklik(10);
		dikdortgen.alanHesapla();
		
		Daire daire = new Daire();
		daire.setPosX(30);
		daire.setPosY(40);
		daire.setRenk("Mor");
		daire.setYaricap(5);
		daire.alanHesapla();
		
		
	}
}
