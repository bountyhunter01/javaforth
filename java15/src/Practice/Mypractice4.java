package Practice;
class Number{
	static final double Kilograms_Pound = 0.45359237;
	static final double Pound_Kilograms = 1 /Kilograms_Pound;//나눠주어야한다
	static final double Centimeters_Inches = 2.54;
	static final double Inches_Cemtimeters = 1 /Centimeters_Inches ;
	public static double getKilogramsPound() {
		return Kilograms_Pound;
	}
	public static double getPoundKilograms() {
		return Pound_Kilograms;
	}
	public static double getCentimetersInches() {
		return Centimeters_Inches;
	}
	public static double getInchesCemtimeters() {
		return Inches_Cemtimeters;
	}

}

public class Mypractice4 {

	public static void main(String[] args) {
		Number nu = new Number();
		nu.getKilogramsPound();
		nu.getPoundKilograms();
		
		nu.getCentimetersInches();
		nu.getInchesCemtimeters();
		
		System.out.println(nu.getKilogramsPound()+" ,"+nu.getPoundKilograms());
		System.out.println(nu.getInchesCemtimeters()+" ,"+nu.getCentimetersInches());
			
	}

}
