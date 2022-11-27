
public class Calisan {

	private String isim;
	private String gorev;
	private int maas;
	
	public Calisan(String i, String g, int m) {
		isim = i;
		gorev = g;
		maas = m;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String _i) {
		isim = _i;
	}
	
	public String getGorev() {
		return gorev;
	}
	public void setGorev(String _g) {
		gorev = _g;
	}
	
	public int getMaas() {
		return maas;
	}
	public void setMaas(int _m) {
		maas = _m;
	}
	
	public void ozet() {
		System.out.println("İsim: "+(isim));
		System.out.println("Gorev: "+(gorev));
		System.out.println("Maas: "+(maas));
	}
}
