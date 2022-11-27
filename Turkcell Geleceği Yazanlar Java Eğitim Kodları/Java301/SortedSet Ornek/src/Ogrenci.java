
public class Ogrenci implements Comparable<Ogrenci>{

	private int numara;
	private String isim;
	
	public Ogrenci() {
		
	}
	public Ogrenci(int numara, String isim) {
		this.numara = numara;
		this.isim = isim;
	}
	
	public int getNumara() {
		return numara;
	}
	public void setNumara(int numara) {
		this.numara = numara;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	@Override
	public String toString() {
		return "Numara: " + numara + " ,Isim: " + isim;
	}
	@Override
	public int compareTo(Ogrenci o) {
		// return this.numara - o.numara; // Kucukten buyuge dogru sıralar.
		// return o.numara - this.numara; // Bütükten küçüğe soğru sıralar.
		return this.isim.compareTo(o.isim);
	}
	
	
}
