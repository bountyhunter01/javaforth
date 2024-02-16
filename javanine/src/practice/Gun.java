package practice;

public class Gun {
	/**
	 * 기본 생성자 총알을 10로 초기화
	 * fire 메서드 총알 카운트 1감소
	 * 멤버필드들은 서브 클래스에서 사용해야 하므로 protected 로 설정
	 * 생성자에서 인자를 받아 총기 모델을 설정
	 */
	protected String model;
	protected int bulletCount;

	public void fire() {
		System.out.println(model + "=>");
		bulletCount -= 1;
	}

	public Gun(String model1) {// 생성자 => 상속시킨거임
		bulletCount = 10;
		this.model = model1;
	}


}
