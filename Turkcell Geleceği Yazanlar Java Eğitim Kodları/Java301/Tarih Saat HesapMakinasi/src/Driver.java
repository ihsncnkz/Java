import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tarih: ");
		LocalDate tarih = LocalDate.parse(scanner.nextLine());
		
		System.out.print("Saat: ");
		LocalTime saat = LocalTime.parse(scanner.nextLine());
		
		LocalDateTime tarihSaat = LocalDateTime.of(tarih, saat);
		System.out.println("Tarih Saat: " + tarihSaat);
		
		System.out.println("İşlem (0 Ekle) (1 Çıkar) : ");
		int islem = Integer.parseInt(scanner.nextLine());
		if(islem == 0 || islem == 1) {
			ChronoUnit[] chronoUnit = ChronoUnit.values();
			System.out.print("Birim : ");
			for(int i = 0; i < chronoUnit.length; i++) {
				System.out.print(chronoUnit[i] + "(" + (i) + ") ");
			}
			ChronoUnit birim = chronoUnit[Integer.parseInt(scanner.nextLine())];
			System.out.print("Deger: ");
			int deger = Integer.parseInt(scanner.nextLine());
			
			if(islem == 0) {
				System.out.println(tarihSaat.plus(deger,birim));
			}else {
				System.out.println(tarihSaat.minus(deger,birim));
			}
			
		} else {
			System.out.println("Lütfen 0 veya 1 giriniz!");
		}
	}
}
