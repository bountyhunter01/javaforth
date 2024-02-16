package practice;



public class Rifle extends Gun {
	public void fire() {
//		for(int i =0; i<; i++) { 뒤에 숫자만 바뀌게 하고 싶었는데 마지막 값만 출력되
		bulletCount -= 5;
				
		System.out.printf("%s => => => => => , %d\n", model, bulletCount);
	}

	public Rifle(String model1) {
		super(model1);
		bulletCount = 40;
	}

}
