import java.io.Serializable;
import java.util.Date;

public class Kitap implements Serializable{

	private String ad;
	private Date yayinTarihi;
	private String yazar;
	
	public Kitap() {
		
	}
	public Kitap(String ad, Date yayinTarihi, String yazar) {
		this.ad = ad;
		this.yayinTarihi = yayinTarihi;
		this.yazar = yazar;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public Date getYayinTarihi() {
		return yayinTarihi;
	}
	public void setYayinTarihi(Date yayinTarihi) {
		this.yayinTarihi = yayinTarihi;
	}
	
	public String getYazar() {
		return yazar;
	}
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	
	@Override
	public int hashCode() {
		return ad.hashCode() + yazar.hashCode() + yayinTarihi.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		Kitap kitap = (Kitap)o;
		return kitap.ad.equals(this.ad) && kitap.yazar.equals(this.yazar) && kitap.yayinTarihi.equals(this.yayinTarihi);
	}
	
	@Override
	public String toString() {
		return "Ad: " + ad + " ,Yayinlanma Tarihi: " + yayinTarihi + " ,Yazar: " + yazar;
	}
	
}
