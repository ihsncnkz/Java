import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. Sayı: ");	
		float x = Float.parseFloat(scanner.nextLine());
		System.out.print("2. Sayı: ");	
		float y = Float.parseFloat(scanner.nextLine());
		System.out.print("Islem: ");
		char islem = scanner.nextLine().charAt(0);
		
		switch (islem) {
		case '+':
			System.out.print("Sonuc: " + (x + y));
			break;
		case '-':
			System.out.print("Sonuc: " + (x - y));
			break;
		case '*':
			System.out.print("Sonuc: " + (x * y));
			break;
		case '/':
			System.out.print("Sonuc: " + (x / y));
			break;
		default:
			System.out.println("Bilinmeyen değer.");
			break;
		}
		
	}
}
