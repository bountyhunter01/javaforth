package supermaket;

class Employee {
	private int empld;
	private String name;

	public Employee(int empld1, String name1) {
		this.empld = empld1;
		this.name = name1;
	}

	@Override
	public String toString() {
		return "Employee [empld=" + empld + ", name=" + name + "]";
	}
}
	class Manager extends Employee {
		private String deptName;

		public Manager(int empld, String name, String deptName) {
			super(empld, name);
			this.deptName = deptName;
		}
	

		@Override
		public String toString() {
			return super.toString()+ "Manager [deptName=" + deptName + "]";
		}

	}

	class Director extends Manager {
		private double budget;

		public Director(int empld2, String name2, String department, double budget1) {
			super(empld2, name2, department);
			this.budget = budget1;
		}

		@Override
		public String toString() {
			return super.toString()+"Director [budget=" + budget + "]";
		}
	}


public class EmployeeTest {

	public static void main(String[] args) {
		Employee em = new Director(754,"joe", "making ", 10_000);
		System.out.println(em);
	}

}

