
public class Telefon {
	TelefonTipi tip;
	String marka;
	String model;
	boolean wifi;
	boolean mobilVeri;
	boolean aramaVarmi;
	
	void aramaYap(String telefonNumarası) {
		System.out.println(telefonNumarası);
		aramaVarmi = true;
	}
	
	void aramaSonladir() {
		if(aramaVarmi) {
			System.out.println("Arama Sonlandir!");
		}
	}
	
	void mesajGonder(String mesaj) {
		if (mobilVeri || wifi) {
			System.out.println("Mesaj Gonderildi");
		}
	}
	
}
