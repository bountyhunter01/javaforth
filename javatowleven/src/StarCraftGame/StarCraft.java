package StarCraftGame;

import java.util.Scanner;

public class StarCraft {
	String name;
	int x, y, speed;

	void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println(this.name + "이(가) [" + this.x + "," + this.y + "]지점으로 이동(속도:" + this.speed + "km/h)");
	}

	void stop() {
		System.out.println(this.name + "이(가) [" + this.x + "," + this.y + "]에서 정지!");
	}

	public static void main(String[] args) {
		Marine1 ma = new Marine1();
		Tank1 ta = new Tank1();
		Dropship1 dr = new Dropship1();
		Scanner sc = new Scanner(System.in);
		System.out.println("좌표를 입력하시오");

		int ta1 = sc.nextInt();
		int ta2 = sc.nextInt();
		ta.move(ta1, ta2);
//		boolean mode1 = sc.equals(ta.mode);
//		ta.changeMode();
		System.out.println("명령어를 입력하세요. (이동모드, 공격모드)");
		sc.nextLine(); // nextLine() 메소드를 호출하기 전에 nextInt(),
//	       			 				nextFloat() 등의 다른 Scanner 메소드를 호출한 경우,
//	        						줄바꿈 문자(\n)가 입력 스트림에 남아있을 수 있습니다. 이 경우,
//	       					 		nextLine() 메소드는 줄바꿈 문자를 만나자마자 종료되므로,
//	        						예상치 못한 빈 문자열을 반환할 수 있습니다.
		String command = sc.nextLine();
		while (true) {
			if (command.equals("공격모드")) {
				ta.changeMode();
				System.out.println("미사일 ==}}");
				break;
			} else if (command.equals("이동모드")) {
				System.out.println(ta.name + "이(가) 이동모드로 변경");
				break;
			}
		}
		// System.out.printf("마린이(가) [%d, %d]으로 이동 (속도:10km/h)", 10, 0);

	}

}
