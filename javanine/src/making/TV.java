package making;

public class TV {
	//예제 그대로 가져온 버전
	String brand;
	boolean power;
	int channel=1;
	int volume;

	void power() {
		power = !power;
		if (power) {
			System.out.println("전원이 켜집니다");
			display();
		} else {
			System.out.println("전원이 꺼집니다.");
			display();
		}
	}

	void display() {
		System.out.println("[" + brand + "TV]");
		if (power) {
			System.out.println("채널 : " + channel);
			System.out.println("볼륨 : " + volume);
		} else {
			System.out.println("꺼져있음");
		}
		System.out.println("---------------------");
	}

	void channelUp() {
		if (power) {
			System.out.println(channel++);
			display();
		}
	}

	void channelDown() {
		if (power) {
			System.out.println(--channel);
			display();
		}
	}
	void volumUp() {
		if(power) {
			System.out.println(++volume);
			display();
		}
	}
	void volumDown() {
		if(power) {
			System.out.println(--volume);
			display();
		}
	}
}
