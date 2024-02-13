package javasix;

public class rainnow {

	public static void main(String[] args) {

		// 비가 내리는 것을 시뮬레이션 하기 위한 랜덤 숫자 출력
		// 아래 변수로 출력될 줄의 수와 비의 양을 조절할 수 있습니다.
		int lines = 100; // 출력할 줄의 수
		int width = 50; // 각 줄의 너비 (비가 내릴 수 있는 위치의 수)

		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < width; j++) {

				if (Math.random() < 0.1) { // 0.1는 비가 내릴 확률을 의미합니다.
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); // 줄바꿈을 통해 다음 줄로 이동합니다.
		}
		int person = (int) (Math.random() * width);
		for (int i = 0; i < width; i++) {
			System.out.print(i == person ?"  ● " : " ");
		}
		System.out.println();
		for (int i = 0; i < width; i++) {
			System.out.print(i == person ?" / \\" : " ");
		}
		System.out.println();
		for (int i = 0; i < width; i++) {
			System.out.print(i == person ?"/(|)\\" : " ");
		}
		System.out.println();
		for (int i = 0; i < width; i++) {
			System.out.print(i == person ? "  | O " : " ");
		}
		System.out.println();
		for (int i = 0; i < width; i++) {
			System.out.print(i == person ? "  |/|\\" : " ");
		}
		System.out.println();
		for (int i = 0; i < width; i++) {
			System.out.print(i == person ? "   / \\" : " ");
		}
		System.out.println();
	}
}
