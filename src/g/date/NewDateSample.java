package g.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class NewDateSample {

	public static void main(String[] args) {

		NewDateSample sample = new NewDateSample();
		sample.printNewDate();
		//sample.printDayOfWeek();
		//sample.printDayOfWeekLocales();
	}
	
	private void printNewDate() {
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		System.out.println("zoneDateTime : " + zoneDateTime.toString());
		
		//private ZonedDateTime(LocalDateTime dateTime, ZoneOffset offset, ZoneId zone) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate.toString());
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : " + localDateTime.toString());
		
		
		
		ZoneId zoneId = ZoneId.systemDefault();
		ZoneOffset zoneOffset = ZoneOffset.UTC;
		
		ZonedDateTime zoneDateTime2 = ZonedDateTime.of(localDateTime, zoneId);
		System.out.println("zoneDateTime2 : " + zoneDateTime2.toString());
	}
	
	private void printDayOfWeek() {
		DayOfWeek[] dayOfWeek = DayOfWeek.values();
		Locale locale = Locale.getDefault();
		for(DayOfWeek day : dayOfWeek) {
			System.out.print(day.getDisplayName(TextStyle.FULL, locale) + " / ");
			System.out.print(day.getDisplayName(TextStyle.SHORT, locale) + " / ");
			System.out.println(day.getDisplayName(TextStyle.NARROW, locale));
		}
		
	}
	
	private void printDayOfWeekLocales() {
		DayOfWeek day = DayOfWeek.SUNDAY;
		Locale[] locales = Locale.getAvailableLocales();
		for(Locale locale : locales) {
			System.out.print(locale.getCountry() + " / ");
			System.out.print(day.getDisplayName(TextStyle.FULL, locale) + " / ");
			System.out.print(day.getDisplayName(TextStyle.SHORT, locale) + " / ");
			System.out.println(day.getDisplayName(TextStyle.NARROW, locale));
		}
		
	}

}
