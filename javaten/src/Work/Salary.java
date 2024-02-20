package Work;

public class Salary {

	private int AnnualGross = 1000000;

	public  Salary(int AnnualGross1){
		this.AnnualGross=AnnualGross1;
	}
	public int getAnnualGross() {
		return AnnualGross * (500 / 1000);
	}
	public void setAnnualGross(int annualGross) {
        this.AnnualGross = annualGross;
    }

}
