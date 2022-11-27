
public class Driver {

	public static void main(String[] args) {
		/*SayıOlustur sayıOlustur = new SayıOlustur() {

			@Override
			public double olustur() {
				return 15.0;
			}
		};*/
		
		SayıOlustur sayıOlustur = () -> 15.0;
		System.out.println(sayıOlustur.olustur());
	}
}
