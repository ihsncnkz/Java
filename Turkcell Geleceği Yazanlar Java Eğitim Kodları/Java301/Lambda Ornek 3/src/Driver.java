
public class Driver {

	public static void main(String[] args) {
		merhaba merhaba0 = () -> "Merhaba";
		System.out.println(merhaba0.selam());
		
		Merhaba2 merhaba2 = (s) -> "Merhaba " + s;
		System.out.println(merhaba2.selam("Ali"));
		
		Topla topla = (a,b) -> a + b;
		System.out.println(topla.tople(45, 1));
	}
}
