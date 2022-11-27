import java.util.Date;

public class Calisan {

	private String isim;
	private String bolum;
	private Date iseGirisTarih;
	
	public Calisan() {}
	
	public Calisan(String isim) {
		this.isim = isim;
	}
	
	public Calisan(String isim, String bolum) {
		this.isim = isim;
		this.bolum = bolum;
	}
	
	public Calisan(String isim, String bolum, Date iseGirisTarih) {
		this.isim = isim;
		this.bolum = bolum;
		this.iseGirisTarih = iseGirisTarih;
	}
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	
	public Date getIseGirisTarih() {
		return iseGirisTarih;
	}
	public void setIseGirisTarih(Date iseGirisTarih) {
		this.iseGirisTarih = iseGirisTarih;
	}
	
	public void BilgileriYazdir() {
		System.out.println("isim : " + isim);
		System.out.println("bolum : " +  bolum);
		System.out.println("iseGirisTarih : " + iseGirisTarih);
	}
}
