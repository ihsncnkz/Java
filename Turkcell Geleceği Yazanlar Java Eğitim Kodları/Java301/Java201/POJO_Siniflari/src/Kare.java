
public class Kare {
	private int x;
	private int y;
	private int uzunluk;
	
	public void setX(int _x) {
		if(_x >= 0) {
			x = _x;
		}
		else {
			System.out.println("X degeri 0 veya 0'dan büyük bir deger alabilir!");
		}
	}
	public int getX() {
		return x;
	}
	
	public void setY(int _y) {
		if(_y >= 0) {
			y = _y;
		}
		else {
			System.out.println("Y degeri 0 veya 0'dan büyük bir deger alabilir!");
		}
	}
	public int getY() {
		return y;
	}
	
	public void setUzunluk(int _uzunluk) {
		if(_uzunluk >= 0) {
			uzunluk = _uzunluk;
		}
		else {
			System.out.println("Uzunluk degeri 0 veya 0'dan büyük bir deger alabilir!");
		}
	}
	public int getUzunluk() {
		return uzunluk;
	}
	
	public void ekranaBastit() {
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		System.out.println("Uzunluk: "+uzunluk);
	}
	
	
}
