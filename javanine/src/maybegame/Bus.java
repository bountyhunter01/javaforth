package maybegame;

public class Bus {
	int busNumber; // 버스 번호
	int passenger; // 승객 수
	int money; // 수입

	public Bus(int busNumber1) {
		this.busNumber = busNumber1;

	}
	public void take(int money1) {
		this.money += money1;
		passenger++;
	}
	public void showInfo ( ) {
		System.out.println("버스 "+busNumber+"번의 승객은 "+passenger+
				"명이고, 수입은"+money+"입니다");
	}
}
