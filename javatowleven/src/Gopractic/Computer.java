package Gopractic;


class Com {
	public static final String[] osType = { "윈도우", "애플 os x", "안드로이드" };
	private int OS;// 배열의 인덱스 i의 역할
	int Memory ;

	Com(int OS1, int Memory1) {
		this.OS = OS1;
		this.Memory = Memory1;
	}

	void show() {
		System.out.printf("운영체제: %s, 메인메모리%d %n", osType[OS], Memory);
	}
}

public class Computer {

	public static void main(String[] args) {
		Com pc = new Com(0, 16);
		Com apple =new Com(1, 32);
		Com Android =new Com(2, 8);
		pc.show();
		apple.show();
		Android.show();
	}

}
