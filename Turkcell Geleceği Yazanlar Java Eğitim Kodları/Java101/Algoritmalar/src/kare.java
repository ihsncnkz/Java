import java.util.Scanner;

public class kare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen karnin bir kösinin değerini giriniz: ");
		int x = scanner.nextInt();
		
		int cevre = 4 * x;
		int alan = (int) Math.pow(x, 2);
		
		System.out.println("Karenin alanı: "+ alan);
		System.out.println("Karenin cevre: "+ cevre);
	}
}
