
public class Sekil {
	private String renk;
	private int posX;
	private int posY;
	
	public void setRenk(String _renk) {
		renk = _renk;
	}
	public String getRenk() {
		return renk;
	}
	
	public void setPosX(int _x) {
		posX = _x;
	}
	public int getPosX() {
		return posX;
	}
	
	public void setPosY(int _y) {
		posY = _y;
	}
	public int getPosY() {
		return posY;
	}
	
	public void alanHesapla() {
		System.out.println("Alan hesaplanamadi!");
	}
}
