import java.util.Scanner;

public class daire {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen yarı çapı giriniz: ");
		int yaricap = scanner.nextInt();
		
		float alan = (float) (Math.PI * Math.pow(yaricap, 2));
		float cevre = (float) (2 * Math.PI * yaricap);
		
		System.out.println("Dairenin alanı: "+ alan);
		System.out.println("Dairenin cevre: "+ cevre);
	}
		
}
