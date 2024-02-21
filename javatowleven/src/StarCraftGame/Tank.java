package StarCraftGame;

class Tank1 extends StarCraft {
	int speed = 20;
	String name = "시즈탱크";
	boolean mode = false;

	@Override
	void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println(this.name + "이(가) [" + this.x + "," + this.y + "]지점으로 이동(속도:" 
		+ this.speed + "km/h)");
	}

	void stop() {
	}

	boolean changeMode() {/* 공격모드로 변신 */
		if(this.mode == true) {
			System.out.println(this.name+"이(가) 이동모드로 변경");
			this.mode = true;
		}else {
			System.out.print("시즈모드 : ");
			this.stop();
			System.out.println(this.name+"이(가) 공격모드를 변경");
			this.mode = false;
		}
		return this.mode;
	}
}
public class Tank {

}
