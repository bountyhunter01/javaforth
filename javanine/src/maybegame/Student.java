package maybegame;

public class Student {
	public String studentName; // 학생 이름
	public int money; // 가진 돈

	public Student(String studentName1, int money1) {
		this.studentName = studentName1;
		this.money = money1;
	}

	// 버스를 탄다
	public void takeBus(Bus bus) {//버스라는 클래스의 버스로 생성자 만듬
		bus.take(1500);
		this.money -= 1500;
	}

	// 지하철을 탄다
	public void takeSubway(Subway subway) {
		subway.take(1550);
		this.money -= 1550;
	}

	// 택시를 탄다
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}

	public void showInfo() {
		System.out.println(studentName+"님와~ 남은 돈이"+money+"원 밖에 안남았네. ");
	}

}
