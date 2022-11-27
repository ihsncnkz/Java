import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDriver {

	public static void main(String[] args) {
		LocalDateTime dataTime = LocalDateTime.now();
		System.out.println(dataTime);
		System.out.println("----------");
		
		LocalDateTime localDateTime = LocalDateTime.of(2022, 10, 5, 14, 34);
		System.out.println(localDateTime);
		System.out.println("----------");
		
		LocalDateTime localDateTime2 = localDateTime.plus(4, ChronoUnit.DAYS);
		System.out.println(localDateTime2);
		System.out.println("----------");
		
		
		LocalDate localDate = LocalDate.parse("2022-01-22");
		LocalDateTime birinci = LocalDateTime.of(localDate, LocalTime.parse("04:12"));
		LocalDateTime ikinci = LocalDateTime.of(localDate, LocalTime.parse("09:00"));
		System.out.println(birinci.isAfter(ikinci));
		System.out.println(birinci.isBefore(ikinci));
		System.out.println("----------");
		
		System.out.println(ChronoUnit.SECONDS.between(birinci, ikinci));
		System.out.println("----------");
	}
}
