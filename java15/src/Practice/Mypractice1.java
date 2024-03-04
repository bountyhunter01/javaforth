package Practice;


 interface  Meter{
	abstract void start();
	abstract int stop(int distace);
}
 class Taxi implements Meter{
	@Override
	public void start() {
		System.out.println("출발합니다");
	}
	@Override
	public int stop(int distace) {
		System.out.println("도착했습니다 요금은 "+distace*2+"원 입니다");
		return distace*2;
	}
}

public class Mypractice1 {

	public static void main(String[] args) {
		Taxi taxi = new Taxi();
        taxi.start();
        taxi.stop(3000);
	}

}
