package DinosourWorld;

import java.util.Scanner;

/**
 * 직원 부모클래스만들고 공원 경비원(안전관리), 공원 매니저(관리자),공원직원(손님 응대 및 위생관리),공룡수의사 공원 사장(모든 권한을
 * 가짐 수의사등등 특별이벤트 생성 공룡 탑승하기)
 */
class Employee_parent_class {
	protected String name;
	protected String job;
	protected int age;// 나이
	protected int height;// 키
	protected int weight;// 몸무게

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Employee_parent_class(String name, String job, int age, int height, int weight) {
		super();
		this.name = name;
		this.job = job;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}


}

class Manager extends Employee_parent_class {

	public Manager(String name, String job, int age, int height, int weight) {
		super(name, job, age, height, weight);
	}

	public class Employee {
		Scanner sc = new Scanner(System.in);
//	  Manager ma = new Manager(name, job, getAge(), getHeight(), getWeight());

	public void managerAction() {

//		boolean end = true;
		while (true) {
			ManagerMenu();
			int choice = sc.nextInt();
			 boolean continueLoop = doAction1(choice);
			 if (!continueLoop) {
		            break;
		        }
		}
	}

	public void ManagerMenu() {
		System.out.println("1.직원 고용 2.직원 해고 3.종료");
	}

	boolean doAction1(int choice) {
		switch (choice) {
		case 1:
			System.out.println("고용할 직원 (1.경비원 2.직원 3.수의사) ->");
			Goyong();
			return true;
		case 2:
			System.out.println("해고할 직원 (1.경비원 2.직원 3.수의사) -> ");
			return true;
		case 3:
			System.out.println("이전 페이지로 이동 ->");
			managerAction();
			return false;
		default:
			System.out.println("Invalid choice. Please try again.");
			return true;
		}
	}

	public void Goyong() {
	    System.out.println("고용할 직원 (1.경비원 2.직원 3.수의사) ->");
	    int choice = sc.nextInt();
	    sc.nextLine();  // 입력 버퍼를 비웁니다.
	    System.out.println("직원의 이름을 입력하세요:");
	    String name = sc.nextLine();
	    System.out.println("직원의 나이를 입력하세요:");
	    int age = sc.nextInt();
	    System.out.println("직원의 키를 입력하세요:");
	    int height = sc.nextInt();
	    System.out.println("직원의 몸무게를 입력하세요:");
	    int weight = sc.nextInt();

          
	    switch (choice) {
	    case 1:
	        // 경비원을 생성합니다.
	    	 System.out.println("이름:"+name+" 직업:"+job +" 나이:"+age+" 키:" +height+" 몸무게:" +weight );
	        break;
	    case 2:
	        // 일반 직원을 생성합니다.
	    	 System.out.println("이름:"+name+" 직업:"+job +" 나이:"+age+" 키:" +height+" 몸무게:" +weight  );
	        break;
	    case 3:
	        // 수의사를 생성합니다.
	    	 System.out.println("이름:"+name+" 직업:"+job +" 나이:"+age+" 키:" +height+" 몸무게:" +weight );
	        break;
	    default:
	        System.out.println("Invalid choice. Please try again.");
	    }
	}
}

class Boss extends Manager.Employee {

	public Boss() {
		super();
	}

	@Override
	boolean doAction1(int choice) {
		switch (choice) {
		case 1:
			System.out.println("고용할 직원 (1.경비원 2.직원 3.수의사 4.매니저) ->");
			return true;
		case 2:
			System.out.println("해고할 직원 (1.경비원 2.직원 3.수의사 4.매니저) -> ");
//			fire()
			return true;
		case 3:
			System.out.println("이전 페이지로 이동 ->");
			return false;
		default:
			return true;
		}
	}

	void event() {
		System.out.println("트리케라톱스 탑승하기!!");
	}
}

class SecurityGuard extends Employee_parent_class {// 보안요원

	public SecurityGuard(String name, String job, int age, int height, int weight) {
		super(name, job, age, height, weight);
	}

	}

}

class Veterinarian extends Employee_parent_class {// 수의사

	public Veterinarian(String name, String job, int age, int height, int weight) {
		super(name, job, age, height, weight);
	}


}

class Staff extends Employee_parent_class {// 직원

	public Staff(String name, String job, int age, int height, int weight) {
		super(name, job, age, height, weight);
	}

	
}

