package making;

public class TV1 {
	//예제 안보고 메인 화면만 보고 필요하다고 생각한 것들만 만든 클래스 버전
	String brand;

	public void TV(String brandString) {
		String brand = brandString;
	}

	void display() {
		for (int on = 1; on <= 2; on++) {
			if (on == 1) {
				System.out.println("전원이 켜졌습니다");
			} else {
				System.out.println("전원이 꺼졌습니다");
			}
		}
	}

	void channelUp() {
		for (int i = 0; i < 10; i++) {
			System.out.println("채널 : " + i);
			break;
		}
		System.out.println();
	}

	void power() {
		for (int i = 0; i < 10; i++) {
			System.out.println("볼륨 : " + i);
			break;
		}
		System.out.println();
	}

}
