package practice;

public class GunGame {

	public static void main(String[] args) {
		Gun gun1 = new ShotGun("S12K");	
		Gun gun2 = new Rifle("M416");	
		
		gun1.fire();
		gun2.fire();
	}

}
