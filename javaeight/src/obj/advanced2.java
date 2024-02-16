package obj;

public class advanced2 {

	public static void main(String[] args) {
		advanced seniors2 = new advanced();
		
		int num = seniors2.geter();
		System.out.println(num); //2
		num = -100;
		int number = seniors2.geter();
		System.out.println(number);
		
		int[] ggagse = seniors2.getname();
		System.out.println(ggagse[0]+","+ggagse[1]);
		ggagse[0]= -9;
		ggagse[1]= -29;
		
		int[] num2 = seniors2.getname();
		System.out.println(num2[0]+","+num2[1]);
	}

}
