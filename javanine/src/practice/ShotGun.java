package practice;

public class ShotGun extends Gun {
	public void fire() {
		bulletCount -= 1;
		System.out.printf("%s =}}}, %d\n", model, bulletCount);
	}

	public ShotGun(String model1) {
		super(model1);
	}

}
