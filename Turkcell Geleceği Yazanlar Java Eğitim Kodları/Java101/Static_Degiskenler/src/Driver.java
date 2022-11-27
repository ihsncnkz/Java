import static java.lang.Math.PI;

public class Driver {
	
	static int i; // Eger basına static yazmasaydım main metodumda ulasamazdım.
	
	static {
		System.out.println("Static Blok");
		i = 20;
	}
	
	public static void main(String[] args) {
		
		System.out.println(i);
		
		
		/*Driver driver = new Driver();
		driver.i = 20;*/
		
		/*Driver.i = 20;
		System.out.println(Driver.i);*/
		
		System.out.println(Math.PI);
		System.out.println(PI); // import ile belirtikten sonra bu şekilde kullanıla bilinir!
	}
}
