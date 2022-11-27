
public class Dikdortgen extends Sekil{
	
	private int genislik;
	private int yukseklik;
	
	public Dikdortgen(int g, int y) {
		genislik = g;
		yukseklik = y;
	}
	
	public int getGenislik() {
		return genislik;
	}
	public void setGenislik(int _g) {
		genislik = _g;
	}
	
	public int getYukseklik() {
		return yukseklik;
	}
	public void setYukseklik(int _y) {
		yukseklik = _y;
	}
	
	public void alan() {
		System.out.println("Dikdortgen alan: " + (genislik * yukseklik));
	}

}
