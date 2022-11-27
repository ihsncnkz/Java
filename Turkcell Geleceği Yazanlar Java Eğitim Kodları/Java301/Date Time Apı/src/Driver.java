import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("-------------------");
		
		LocalDate of = LocalDate.of(1990, 5, 26);
		System.out.println(of);
		System.out.println("-------------------");
		
		LocalDate localDate2 = LocalDate.parse("2012-12-12");
		System.out.println(localDate2);
		System.out.println("-------------------");
		
		System.out.println(localDate.plus(1, ChronoUnit.DAYS));
		System.out.println("-------------------");
		
		System.out.println(localDate.plusDays(2));
		System.out.println("-------------------");
		
		System.out.println(localDate.minus(1, ChronoUnit.MONTHS));
		System.out.println("-------------------");
		
		LocalDate localdate3 = LocalDate.parse("2020-11-22");
		System.out.println(localdate3.getDayOfWeek());
		System.out.println("-------------------");
		
		int dayOfMouth = localdate3.getDayOfMonth();
		System.out.println(dayOfMouth);
		System.out.println("-------------------");
		
		LocalDate birinciTarih = LocalDate.parse("2022-02-11");
		LocalDate ikinciTarih = LocalDate.parse("2022-02-18");
		System.out.println(birinciTarih.isAfter(ikinciTarih));
		System.out.println(birinciTarih.isBefore(ikinciTarih));
		System.out.println("-------------------");*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Doğum Tarihiniz: ");
		String line = scanner.nextLine();
		LocalDate dogumTarih = LocalDate.parse(line);
		System.out.println("Doğum tarihiniz: " + dogumTarih);
		System.out.println("Yaşınız: " + (LocalDate.now().getYear() - dogumTarih.getYear()));
	}
}
