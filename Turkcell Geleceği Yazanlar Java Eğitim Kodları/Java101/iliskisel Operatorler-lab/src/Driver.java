import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		boolean sonuc = 2 > 5;
		System.out.println(sonuc);
		
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		System.out.println(str1 == str2);
		// String kümleri karşılaştırıken aşağıdaki metot kullanılmalı!
		System.out.println(str1.equals(str2));
		
	}
}
