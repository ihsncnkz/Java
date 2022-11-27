
public class Isci {

	private String isim;
	private double maas;
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) throws HataliDeger {
		if (isim == null || isim.trim().length() == 0 ) {
			throw new HataliDeger("isim", isim);
		}
		this.isim = isim;
	}
	
	public double getmaas() {
		return maas;
	}
	public void setmaas(double maas) throws HataliDeger {
		if(maas < 0 ) {
			throw new HataliDeger("maas", maas);
		}
		this.maas = maas;
	}
	
	@Override
	public String toString() {
		return "isim: " + isim + ",Maas: " + maas;
	}
}
