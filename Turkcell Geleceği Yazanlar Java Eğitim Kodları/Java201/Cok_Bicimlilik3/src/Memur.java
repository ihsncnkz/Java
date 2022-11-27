
public class Memur extends Calisan {
	
	private String birim;
	
	public Memur(String i, String g, int m, String b) {
		super(i,g,m);
		birim = b;
	}
	
	public String getBirim() {
		return birim;
	}
	public void setBirim(String _b) {
		birim = _b;
	}
	
	public void ozet() {
		System.out.println("İsim: "+(getIsim()));
		System.out.println("Gorev: "+(getGorev()));
		System.out.println("Maas: "+(getMaas()));
		System.out.println("Birim: "+(birim));
	}

}
