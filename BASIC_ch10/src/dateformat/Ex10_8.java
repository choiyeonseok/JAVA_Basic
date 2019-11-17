package dateformat;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex10_8 {

	public static void main(String[] args) {
		
		ZonedDateTime zdt = ZonedDateTime.now();    // ¼­¿ï
		ZoneId nyId = ZoneId.of("America/New_York");// ´º¿å
		ZonedDateTime zdtNY = ZonedDateTime.now().withZoneSameInstant(nyId);
		
		System.out.println(zdt);
		System.out.println(zdtNY);
		
		long sec1 = zdt.getOffset().getTotalSeconds();
		long sec2 = zdtNY.getOffset().getTotalSeconds();
		
		long diff = (sec1 - sec2)/3600;
		
		System.out.println("sec1="+sec1);
		System.out.println("sec2="+sec2);
		System.out.printf("diff=%d hrs%n",diff);


	}

}
