package DinosourWorld;

/**
 * 공룡 부모클래스 만들고 육식, 초식 타입인지 그리고 그 타입의 공룡이 . 익룡인지 해양공룡인지 육상공룡인지 공룡 수량 나이(수명)이 차면
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

class LandDinosaur extends Dinosour_parent_class {

	public LandDinosaur(String name, String type, int age, int height, int weight) {
		super(name, type, age, height, weight);
	}

	public static void run() {
		System.out.println("땅위를 달린다");
	}

	public static void shouting() {
		System.out.println("시끄러운 울음소리를 낸다");
	}
}

class AquaticDinosaur extends Dinosour_parent_class {

	public AquaticDinosaur(String name, String type, int age, int height, int weight) {
		super(name, type, age, height, weight);
	}

	public static void swim() {
		System.out.println("수영 하기 시작했다");
	}

	public static void chohumpa() {
		System.out.println("초음파를 발사한다");
	}
}

class FlyingDinosaur extends Dinosour_parent_class {

	public FlyingDinosaur(String name, String type, int age, int height, int weight) {
		super(name, type, age, height, weight);
	}

	public static void fly() {
		System.out.println("하늘로 날아오른다");
	}

	public static void madehome() {
		System.out.println("둥지를 짓는다");
	}
}

public class Dinosour {

}
