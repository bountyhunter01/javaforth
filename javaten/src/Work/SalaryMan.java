package Work;

public class SalaryMan {
	int salary;

	SalaryMan() {
		this.salary = 1000000;
	}

	  SalaryMan(int salary1) {//void 가 있으면 에러가 뜬다
		this.salary = salary1;
	}

	public int getAnnualGross() {
		return (this.salary * 12) + (this.salary * 5);
	}

	public static void main(String[] args) {

		Salary user = new Salary(15000000);
		System.out.println(user.getAnnualGross());
		System.out.println();
		System.out.println(new Salary(1000000).getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

}
