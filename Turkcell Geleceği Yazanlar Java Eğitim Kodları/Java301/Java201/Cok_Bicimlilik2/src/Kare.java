
public class Kare extends Sekil {
	
	private int kenarUzunlugu;
	
	public Kare(int u) {
		kenarUzunlugu = u;
	}
	
	public int getKenarUz() {
		return kenarUzunlugu;
	}
	public void setKenarUz(int _uz) {
		kenarUzunlugu = _uz;
	}
	
	public void alan() {
		System.out.println("Kare Alan: "+(Math.pow(kenarUzunlugu, 2)));
	}

}
