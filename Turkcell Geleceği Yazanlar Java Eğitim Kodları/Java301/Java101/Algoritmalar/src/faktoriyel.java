import java.util.Scanner;

public class faktoriyel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int number = scanner.nextInt();
		/*
		
		for(int i = number - 1; i > 0;i--) {
			sonuc = sonuc * i;
		}*/
		
		int sonuc = 1;
		for (int i = 0; i < number; i++) {
			sonuc *= (number - i);
		}
		
		System.out.println(sonuc);
	}
}
