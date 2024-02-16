package newobj;

enum Workday {
	MONDAY("9-5"), TUESDAY("9-5"), WEDNESDAY("9-5"), THURSDAY("9-5"), FRIDAY("9-5"), SATURDAY("10-1") {
		public String getWorString1() {
			return "Home";
		}
	};

	private String hoursOfWork1;

	Workday(String hoursofWork) {
		this.hoursOfWork1 = hoursofWork;
	}

	public String gethoursOfWork2() {
		return hoursOfWork1;
	}

	public String gethoursOfWorString1() {
		return "Office";
	}
}

public class complexeunms {

	public static void main(String[] args) {
		Workday Monday = Workday.MONDAY; 
		System.out.println(Monday.gethoursOfWork2()+", "
		+Monday.gethoursOfWorString1());
		
		
	}

}
