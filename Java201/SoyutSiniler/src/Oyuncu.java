
public abstract class Oyuncu {
	
	/*Soyut sınıfların mantığı kendisinden türeyecek olan sınıflara ara bir katman olusturmak
	 * ve ortak özelliklerini belirli yerde tutmaktır.*/

	private String isim;
	private int numara;
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public int getNumara() {
		return numara;
	}
	public void setNumara(int numara) {
		this.numara = numara;
	}
	
	public abstract void sutCek();
	
	public abstract void pasVer();
}
