
public class Calisan {

	private String tcNo;
	private String isim;
	
	public Calisan() {
		
	}
	public Calisan(String tcNo, String isim) {
		this.tcNo = tcNo;
		this.isim = isim;
	}
	
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	@Override
	public String toString() {
		return "TcNo: " + tcNo + " ,Isim: " + isim;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(tcNo);
	}
	// aynı değerleri hashset aldığı için bunu olusturduk ve tcno karşılaştırması ile aynı tcno'ya sahip olan değerler hashset içerisen alınmadı.
	@Override
	public boolean equals(Object other) {
		Calisan calisan = (Calisan) other;
		return this.tcNo.equals(calisan.tcNo);
	}
}
