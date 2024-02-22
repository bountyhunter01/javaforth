package DinosourWorld;

import java.util.Scanner;

/**
 * 공룡 부모클래스 만들고 육식, 초식 타입인지 그리고 그 타입의 공룡이 .
 *  익룡인지 해양공룡인지 육상공룡인지 공룡 수량 나이(수명)이 차면
 * 죽는나이 형성
 */
 class Dinosour_parent_class {
	protected String name;
	protected String type;
	protected int age;// 나이
	protected int height;// 키
	protected int weight;// 몸무게

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	Dinosour_parent_class(String name, String type1, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.type = type1;
	}
}
class  DinoMain extends Dinosour_parent_class{
public DinoMain(String name, String type1, int age, int height, int weight) {
		super(name, type1, age, height, weight);
	}

String  answer() {
	Scanner sc = new Scanner(System.in);
	System.out.println("생성할 공룡의 수를 입력하시오");
	int num = sc.nextInt();
	sc.nextLine(); // 줄바꿈 문자를 소비

	Dinosour_parent_class[] dinosours = new Dinosour_parent_class[num];

	for (int i = 0; i < num; i++) {
		System.out.println("공룡의 이름을 입력하시오");
		String name = sc.nextLine();
		System.out.println("공룡의 타입을 입력하시오 (육식 또는 초식)");
		String type = sc.nextLine();
		System.out.println("공룡의 나이를 입력하시오");
		int age = sc.nextInt();
		System.out.println("공룡의 키를 입력하시오");
		int height = sc.nextInt();
		System.out.println("공룡의 몸무게를 입력하시오");
		int weight = sc.nextInt();
		sc.nextLine(); // 줄바꿈 문자를 소비

		dinosours[i] = new Dinosour_parent_class(name, type, age, height, weight);
	}

	// 생성된 공룡 객체들을 출력
	for (Dinosour_parent_class dinosour : dinosours) {
		System.out.println(answer());
	}

	if (getType().equals("육식") || getType().equals("초식")) {
		return "이름:" + name + " 타입:" + type + " 나이:" + age + " 키:" + height + " 몸무게:" + weight + "이다";
	} else {
		return "잘못 입력하셨습니다";
	}
}
}

	class FlyingDinosaur extends  DinoMain {

		public FlyingDinosaur(String name, String type, int age, int height, int weight) {
			super(name, type, age, height, weight);
		}

		@Override
		public String toString() {
			return "FlyingDinosaur [answer()=" + answer() + "]";
		}
		

//		public String flytype() {
//			return "이 친구는 익룡이네요";
//		}
	}

	class LandDinosaur extends  DinoMain {

		public LandDinosaur(String name, String type, int age, int height, int weight) {
			super(name, type, age, height, weight);
		}

		@Override
		public String toString() {
			return "LandDinosaur [answer()=" + answer() + "]";
		}
	}
		class AquaticDinosaur extends  DinoMain {

			public AquaticDinosaur(String name, String type, int age, int height, int weight) {
				super(name, type, age, height, weight);
			}

			@Override
			public String toString() {
				return "AquaticDinosaur [answer()=" + answer() + "]";
			}
		}
	public class Dinosour {

	}

