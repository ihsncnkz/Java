
public class Driver {
	public static void main(String[] args) {
		Kisi kisi1 = new Kisi("1","Ahmet Geldi");
		System.out.println(kisi1.toString());
		
		Kisi kisi2 = new Kisi("1","Hasan Geldi");
		System.out.println(kisi2.toString());
		
		System.out.println(kisi1 == kisi2);
		System.out.println(kisi1.equals(kisi2));
	}
}
