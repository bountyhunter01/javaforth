package maybegame;

public class TakeTrans {

	public static void main(String[] args) {
		Student jameStudent = new Student("JAMES", 20000);
		Student tomasStudent = new Student("TOMASE", 12000);
		Student edwardStudent = new Student("EWARD", 25000);
		
		Bus bus100 = new Bus(100);
		jameStudent.takeBus(bus100);
		jameStudent.showInfo();//학생클래스 쇼
		bus100.showInfo();//버스 클래스의 쇼
		
		Subway subwayGreen  = new Subway("2호선");
		tomasStudent.takeSubway(subwayGreen);
		edwardStudent.takeSubway(subwayGreen);
		tomasStudent.showInfo();
		edwardStudent.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi1004 = new Taxi(1004);
		edwardStudent.takeTaxi(taxi1004);
		edwardStudent.showInfo();
		taxi1004.showInfo();
	}

}
//총 5개의 클래스로 설정한 값인데 스캐너 넣고 if문 달면 더 재밌었을 거 같다