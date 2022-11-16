
public class Daire {

	private int x;
	private int y;
	private double yaricap;
	
	public int getX() {
		return x;
	}
	public void setX(int x){
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y){
		this.y = y;
	}
	
	public double getyaricap() {
		return yaricap;
	}
	public void setyaricap(double yaricap) {
		if (yaricap < 0) {
			throw new HataliYaricap(yaricap);
		}
		this.yaricap = yaricap;
	}
	
	@Override
	public String toString() {
		return "X: " + x + ",Y: " + y + ",R: " + yaricap;
	}
}