package maybegame;

public class Subway {
	String lineNumber; // 지하철 노선
	int passenger;
	int money;
	
	public Subway(String lineNumber1) {
		this.lineNumber = lineNumber1;
	}
	//승객이 지하철을 탄다면
	public void take(int money1) {
		this.money = money1;//지하철 수입이 증가
		passenger++;
	}
	public void showInfo() {
		System.out.println(lineNumber+"의 승객은 "+passenger+
				"명이고 , 수입은 "+money+"입니다");
	}
}
