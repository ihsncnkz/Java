import java.util.Arrays;

public class Driver {
	
	private static int x = 20;
	
	public static void main(String[] args) {
		/*Driver driver = new Driver();
		driver.normalMetot();*/
		
		/*Driver.staticMetot();
		
		Math.abs(x);
		
		int max = Driver.max(1,5,8);
		System.out.println(max);
		
		double max2 = Driver.max(1.0,5.0,8.0);
		System.out.println(max2);
		
		boolean majority = Driver.majority(true, false, true);
		System.out.println(majority);
		
		int[] x = {1,2,3,5};
		int[] y = {1,2,3,4};
		
		System.out.println(Driver.eq(x, y));
		
		System.out.println(Driver.kup(2));
		
		System.out.println(Driver.toplam(x));
		
		int[] sonucCiftSayilar = Driver.ciftSayilar(new int[] {1,2,3,4,5,6,7,8,9,0});
		System.out.println(Arrays.toString(sonucCiftSayilar));*/
		
		int x2 = 20;
		int y2 = 30;
		
		int[] sayilar = {2,3};
		System.out.println(Arrays.toString(sayilar));
		Driver.degistir(sayilar);
		System.out.println(Arrays.toString(sayilar));
		
		
		/*System.out.println(x2 + " " + y2);
		degistir(x2, y2);
		System.out.println(x2 + " " + y2);*/
	}
	
	public static void degistir(int[] sayilar) {
		int temp = sayilar[0];
		sayilar[0] = sayilar[1];
		sayilar[1] = temp;
	}
	
	// Bunu kullanarak x2 ve y2 degerlerini değiştiremedik!
	/*public static void degistir(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}*/
	
	public static int[] ciftSayilar(int[] sayilar) {
		int[] sonuc = null;
		int adet = 0;
		for (int i = 0; i<sayilar.length; i++) {
			if (sayilar[i] % 2 == 0) {
				adet++;
			}
		}
		
		sonuc = new int[adet];
		int index = 0;
		for (int i = 0; i<sayilar.length; i++) {
			if (sayilar[i] % 2 == 0) {
				sonuc[index++] = sayilar[i];
			}
		}
		
		return sonuc;
	}
	
	public static int toplam(int[] x) {
		int result = 0;
		for (int i = 0; i<x.length; i++) {
			result += x[i];
		}
		return result;
	}
	
	public static int kup(int x) {
		return x*x*x;
	}
	
	public static boolean eq(int[] x, int[] y) {
		boolean result = true;
		if (x.length == y.length) {
			for(int i =0; i< x.length; i++) {
				if (x[i] != y[i]) {
					result = false;
					break;
				}
			}
		}
		else {
			result = false;
		}
		
		return result;
	}	
	public void normalMetot() {
		System.out.println(x);
	}
	
	public static void staticMetot() {
		System.out.println(x);
	}
	
	public static int max(int x, int y, int z) {
		int max = x;
		if (y>max) max = y;
		if (z>max) max = z;
		return max;
	}
	
	public static double max(double x, double y, double z) {
		double max = x;
		if (y>max) max = y;
		if (z>max) max = z;
		return max;
	}
	
	public static boolean majority(boolean x, boolean y, boolean z) {
		return (x && y) || (x && z) || (y && z);
	}
}
