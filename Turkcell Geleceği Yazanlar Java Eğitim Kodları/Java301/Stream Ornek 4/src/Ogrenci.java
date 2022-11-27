import java.io.Serializable;

public class Ogrenci implements Serializable{

	private int no;
	private String isim;
	private int yas;
	
	public Ogrenci() {
		
	}
	public Ogrenci(int no, String isim, int yas) {
		this.isim = isim;
		this.no = no;
		this.yas = yas;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	@Override
	public int hashCode() {
		return no;
	}
	
	@Override
	public boolean equals(Object o) {
		Ogrenci ogrenci = (Ogrenci)o;
		return ogrenci.no == this.no;
	}
	
	@Override
	public String toString() {
		return "No: " + no + " ,Isim: " + isim + " ,Yas: " + yas;
	}
	
}
