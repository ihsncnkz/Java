import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*int starCount = scanner.nextInt();
		int i = 1;
		while(i <= starCount) {
			int j = 0;
			while(j<i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		/*long total = 0;
		while(true) {
			int x = scanner.nextInt();
			if (x == 0) {
				break;
			}
			total += x;
		}
		System.out.println(total);*/
		
		/*int i = 0;
		while(i<=100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}*/
		
		/*int x = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while(x<10) {
			int sayi = scanner.nextInt();
			if (sayi > max) {
				max = sayi;
			}
			else if (sayi < min) {
				min = sayi;
			}
			x++;
		}
		System.out.println("Girmis olduğunuz en buyuk sayi: "+ max);
		System.out.println("Girmis olduğunuz en kucuk sayi: "+ min);*/
		
		/*
		float total = 0f;
		int i = 0;
		while(true) {
			float sayi = scanner.nextFloat();
			if(sayi == 0) break;
			total += sayi;
			i++;
		}
		System.out.println("Girmiş olduğunu sayıların toplamı: " + total);
		System.out.println("Girmiş olduğunu sayıların ortalaması: " + (total / i));*/
		
		int neg = 0;
		int pos = 0;
		int i = 0;
		while(i < 10) {
			int sayi = scanner.nextInt();
			if (sayi < 0) neg++;
			else pos++;
			i++;
		}
		System.out.println("Girmiş olduğunuz sayilardan negatif değerlerin sayısı: "+ neg);
		System.out.println("Girmiş olduğunuz sayilardan positif değerlerin sayısı: "+ pos);
	}
}
