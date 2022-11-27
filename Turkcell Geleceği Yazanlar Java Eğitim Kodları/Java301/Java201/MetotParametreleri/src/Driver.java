import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		Driver driver = new Driver();
		/*int x = 20;
		System.out.println(x);
		driver.passByValue(x);
		System.out.println(x);*/
		
		/*int[] sayilar = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(sayilar));
		driver.degistir(sayilar);
		System.out.println(Arrays.toString(sayilar));*/
		
		
		Driver driver2 = new Driver();
		driver2.test(5);
		
		driver2.varArgs(2, 1,2,3);
	}
	
	// int[] = int...
	public void varArgs(int a,int... numbers) {
		int x = numbers[0];
		int y = numbers[1];
		
		System.out.println((x*a) + (y*a));
	}
	
	// Eger bir degisken final olarak ifade edildi ise o degisken metot içerisinde değiştirilemez.
	public void test(final int x) {
		// x = 10;
		System.out.println(x);
	}
	
	public void degistir(int[] sayilar) {
		for (int i = 0; i<sayilar.length; i++) {
			sayilar[i] = sayilar[i] * 2;
		}
	}
	
	public void passByValue(int x) {
		System.out.println("PBV " + x);
		x = 10;
		System.out.println("PBV " + x);
	}
}
