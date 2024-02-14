package classmade;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class class5 {

	public static void main(String[] args) {
       
		/**
		 * 날짜 시간을 구하는 코드
		 * 
		 */
		//of가 지정 날짜와 시간 
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.of(2019, 10, 10);
		
		LocalTime t1 = LocalTime.now();
		LocalTime t2 = LocalTime.of(7, 20 , 20);
		
		System.out.printf("localdate.now() : %s\n", d1);
		System.out.printf("localdate.of() : %s\n", d2);
		System.out.printf("localtime.now() : %s\n", t1);
		System.out.printf("localtime.of() : %s\n", t2);
		
		LocalDateTime dt1 = LocalDate.now().atTime(LocalTime.MIDNIGHT);
		LocalDateTime dt2 = LocalDate.now().atTime(LocalTime.MAX);
		
		System.out.printf("localdate.now() ~ : %s\n",dt1);
		System.out.printf("localdate.now() ~ : %s\n",dt2);
		
	}

}
