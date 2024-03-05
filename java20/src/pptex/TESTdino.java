package pptex;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;

class Event {
	private HashMap<String, LocalDateTime> sck;
	private HashMap<String, DayOfWeek> everyWeek;
	private HashMap<String, HashMap<DayOfWeek,LocalTime>> everyWeekTime;

	public Event() {
		sck = new HashMap<>();
		everyWeek = new HashMap<>();
		everyWeekTime = new HashMap<>();
	}
	//1
	public void logEvent(String event, LocalDateTime eventTime) {
		sck.put(event, eventTime);
	}

	public LocalDateTime  getSck(String event) {
		return this.sck.get(event);
	}

	public void setSck(HashMap<String, LocalDateTime> sck) {
		this.sck = sck;
	}
	
	
	//2
	public void logWeek(String eventString ,DayOfWeek dayof) {
		everyWeek.put(eventString, dayof);
	}
	
	
	//3
	public void logEventWeekTime(String event2 , HashMap<DayOfWeek, LocalTime> weekEvent) {
		everyWeekTime.put(event2, weekEvent);
	}
	public HashMap<DayOfWeek, LocalTime> getweeEvent(String event){
		return this.everyWeekTime.get(event);
	}
}

public class TESTdino {

	public static void main(String[] args) {
		Event ev = new Event();
//		ev.logEvent("event1",LocalTime.of(12,00,00));
		ev.logEvent("event1",LocalDateTime.of(LocalDate.now(), LocalTime.of(12, 00)));//get메서드로 객체입력위치를 연결해야 에러안뜸
		LocalDateTime event1Time =  ev.getSck("event1");
		System.out.println("급식시간:" + event1Time);
		
		
		
		HashMap<DayOfWeek, LocalTime> weekTime = new HashMap<>();
		weekTime.put(DayOfWeek.SATURDAY,LocalTime.of(14, 00));//구조가 어렵네
		ev.logEventWeekTime("event2", weekTime);
		System.out.println("비상탈출~"+ev.getweeEvent("event2"));
		
//		ev.logEvent("event2", LocalTime.of(16,00,00));
//		LocalTime event2Time = ev.sck.get("event2");
//		System.out.println("청소시간:"+event2Time);
//		
//		ev.logEvent("event3", LocalTime.of(13,00,00));
//		LocalTime event3Time = ev.sck.get("event3");
//		System.out.println("비상훈련:"+event3Time);
	}

}
