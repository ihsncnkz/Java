import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// String userinput = scanner.nextLine(); // Kullanıcıdan string değeri alır.
		// System.out.println(userinput);
		// System.out.println(userinput.toLowerCase());
		StringBuffer buffer = new StringBuffer();
		System.out.print("Adınız: ");
		buffer.append("Ad: ");
		buffer.append(scanner.nextLine());
		System.out.print("Soyadı: ");
		buffer.append(" Soyadı: ");
		buffer.append(scanner.nextLine());
		System.out.println(buffer.toString());
	}
}
