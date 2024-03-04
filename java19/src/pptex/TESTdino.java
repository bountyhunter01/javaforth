package pptex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;

class Event {
	HashMap<String, LocalTime> sck;

	public Event() {
		sck = new HashMap<>();
	}

	public void logEvent(String event, LocalTime eventTime) {
		sck.put(event, eventTime);
	}
}

public class TESTdino {

	public static void main(String[] args) {
		Event ev = new Event();
		ev.logEvent("event1",LocalTime.of(12,00,00));
		LocalTime event1Time =  ev.sck.get("event1");
		System.out.println("급식시간:" + event1Time);
		
		ev.logEvent("event2", LocalTime.of(16,00,00));
		LocalTime event2Time = ev.sck.get("event2");
		System.out.println("청소시간:"+event2Time);
		
		ev.logEvent("event3", LocalTime.of(13,00,00));
		LocalTime event3Time = ev.sck.get("event3");
		System.out.println("비상훈련:"+event3Time);
	}

}
