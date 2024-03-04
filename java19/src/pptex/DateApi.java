package pptex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;//MONTH라는 열거형 파일을 임포트 해야함
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateApi {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = LocalDate.parse("2025-03-17");//parse는 , 는 인식못함
		System.out.println(ld2.getDayOfWeek());
		System.out.println(ld1);
		LocalDate ld3 = ld2.withMonth(5);//3월을 5월로
		System.out.println(ld3);
		LocalDate ld4 = ld3.plusYears(1);//1년더하기
		System.out.println(ld4);
		LocalDate ld5= ld4.minusDays(5);//-5일
		System.out.println(ld5);
		LocalDateTime ldt1 = ld5.atTime(13,45,10);//13시 45분 10초
		System.out.println(ldt1+"\n");
		
		LocalDateTime flightTime = LocalDateTime.of(2023, Month.NOVEMBER,24,13,00);
		ZonedDateTime depTimeZonedDateTime = flightTime.atZone(ZoneId.of("Europe/Dublin"));
		System.out.println(depTimeZonedDateTime);
		
		ZonedDateTime arrivalTime= depTimeZonedDateTime.withZoneSameInstant(ZoneId.of("Europe/Paris"))
				//유럽에 나라이름도 정확하게 입력하지 않으면 에러가 난다
				.plusHours(1)
				.plusMinutes(45);
		System.out.println("\n"+arrivalTime);
		System.out.println(arrivalTime.getHour()+":::"+arrivalTime.getMinute());
//		2023-11-24T15:45+01:00[Europe/Paris]
//				15:::45 출력결과
	}

}
