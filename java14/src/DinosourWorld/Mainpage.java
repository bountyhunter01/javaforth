package DinosourWorld;

import java.util.Scanner;

import DinosourWorld.Manager.Employee;

/**
 * 사장및 매니저가 죽은 공룡 삭제 태어난 공룡 추가 아니면 없던 공룡 친구를 데려오기 직원도 해고 및 고용 특별 이벤트가 일어나는
 * 요일or날짜기간 생성 하고 발생 직원들 출근 시간및 퇴근시간 주말과 평일 시간 조정
 */
public class Mainpage {
	Scanner sc = new Scanner(System.in);

	Manager manager = new Manager("","",0, 0, 0);
	Manager.Employee employee = manager.new Employee();

	public static void main(String[] args) {

		Mainpage mainpage = new Mainpage();
		mainpage.start();
		mainpage.employee.managerAction();

	}//메인 메뉴 안에 매서드로 연결한 그메서드안에 스위치메뉴 그안에 매서드를 연결한 스위치메뉴 의 구조이다

	public void start() {
		while (true) {
			displayMenu();
			int choice = sc.nextInt();
			handleMenuChoice(choice);
			handleChoice(choice);

		}
/*1. manage dinosaurs
2. Manage Employees
Enter your choice
2
1.직원 고용 2.직원 해고 3.종료
1
고용할 직원 (1.경비원 2.직원 3.수의사) ->
고용할 직원 (1.경비원 2.직원 3.수의사) ->
1
직원의 이름을 입력하세요:
이보겸
직원의 나이를 입력하세요:
24
직원의 키를 입력하세요:
169
직원의 몸무게를 입력하세요:
69
이름:이보겸 직업: 나이:24 키:169 몸무게:69
1.직원 고용 2.직원 해고 3.종료

3
이전 페이지로 이동 ->

1.직원 고용 2.직원 해고 3.종료
3
이전 페이지로 이동 ->
1.직원 고용 2.직원 해고 3.종료
//콘솔창
1
고용할 직원 (1.경비원 2.직원 3.수의사) ->
고용할 직원 (1.경비원 2.직원 3.수의사) ->
2
직원의 이름을 입력하세요:
3
직원의 나이를 입력하세요:
3
직원의 키를 입력하세요:
3
직원의 몸무게를 입력하세요:
3
이름:3 직업: 나이:3 키:3 몸무게:3
1.직원 고용 2.직원 해고 3.종료*/
	}

	public void displayMenu() {

		System.out.println("1. manage dinosaurs");
		System.out.println("2. Manage Employees");
		System.out.println("Enter your choice");
	}

	public void handleMenuChoice(int choice) {
		switch (choice) {
		case 1:
			manageDinosaurs();
			break;
		case 2:
			employee.managerAction();
			break;

		case 3:
			System.out.println("Exiting....");
			System.exit(0);
		default:
			System.out.println("Invalid choice. Please try again.");

		}
	}

	public void manageDinosaurs() {
		boolean end = true;
		while (end) {
			displayMenu();
			int choice = sc.nextInt();
			end = handleChoice(choice);
		}
	}

	public boolean handleChoice(int choice) {
		switch (choice) {
		case 1:
			// manageDinosaurs()
			return true;
		case 2:
			//
			return true;

		case 3:
			System.out.println("Exiting....");
			return false;
		default:
			System.out.println("Invalid choice. Please try again.");
			return true;
		}

	}}

	/*
	 * 
	 * class DinoMain extends Dinosour_parent_class { public DinoMain(String name,
	 * String type1, int age, int height, int weight) { super(name, type1, age,
	 * height, weight); }
	 * 
	 * void answer() {// 공룡을 추가및 삭제등을 하는 ui Scanner sc = new Scanner(System.in);
	 * 
	 * System.out.print("행 크기 -> "); int row = sc.nextInt(); sc.nextLine();
	 * Dinosour_parent_class[] dinos = new Dinosour_parent_class[row];
	 * 
	 * for (int i = 0; i < row; i++) {
	 * System.out.println("공룡의 종류를 입력하세요 (walking, flying, aquatic):"); String kind
	 * = sc.nextLine();
	 * 
	 * System.out.println("공룡의 이름을 입력하시오"); String name = sc.nextLine();
	 * 
	 * System.out.println("공룡의 타입을 입력하시오 (육식 또는 초식)"); String type = sc.nextLine();
	 * 
	 * System.out.println("공룡의 나이를 입력하시오"); int age = sc.nextInt();
	 * 
	 * System.out.println("공룡의 키를 입력하시오"); int height = sc.nextInt();
	 * 
	 * System.out.println("공룡의 몸무게를 입력하시오"); int weight = sc.nextInt();
	 * sc.nextLine(); // 줄바꿈 문자를 소비
	 * 
	 * switch (kind) { case "walking": dinos[i] = new LandDinosaur("name", "초식",
	 * 1000, 100, 200); break; case "flying": dinos[i] = new FlyingDinosaur("name",
	 * "육식", 1, 100, 200); break; case "aquatic": dinos[i] = new
	 * AquaticDinosaur("name", "육식", 1, 3, 10); break; default:
	 * System.out.println("잘못된 kind가 입력되었습니다. 다시 시도해주세요."); i--; // 잘못된 입력이 있을 경우 다시
	 * 입력받기 위해 인덱스를 감소 break; } } }
	 * 
	 * 
	 * 
	 * 
	 * 
	 *
	 *
	*switch(type){ // case "육식": // System.out.println( // "이름:" + name + " 타입:" +
	*type+" 나이:"+age+" 키:"+height+" 몸무게:"+weight+"이다"); // break;
	* // case "초식": // System.out.println( // "이름:" + name + " 타입:" + type + " 나이:"
	*+age+" 키:"+height+" 몸무게:"+weight+"이다"); // break; //default: //
	*System.out.println("잘못된 type가 입력되었습니다. 다시 시도해주세요."); // i--; // 잘못된 입력이 있을 경우
	*

	다시 입력받기
	위해 인덱스를 감소 // break; //}if(this.age>100) // { //
	*System.out.println("공룡이 나이가 많아서 죽어버렸네 ㅠㅠ"); // }System.out.println(); //
	* //// if (getType().equals("육식") || getType().equals("초식")) { ////
	*System.out.println( //// "이름:" + name + " 타입:" + type + " 나이:" + age + " 키:"
	*+height+" 몸무게:"+weight+"이다"); //// } else if (this.age > 100) { ////
	*System.out.println("공룡이 나이가 많아서 죽어버렸네 ㅠㅠ"); //// } else ////
	*System.out.println("잘못 입력하셨습니다"); // // Dinosour_parent_class dino = new
	*

	Dinosour_parent_class(name, type, age, height, weight);dinos[i]=dino;} //
	* //// 생성된 공룡 객체들을 백업 // for( // int i = 0;i<row;i++) // { //
	*System.out.print("공룡을 추가 해주세요 -> "); // // dinos[row] = dinos[row]; // } ////
	*출력 // for( // int i = 0;i<row;i++) // { //
	*System.out.println(dinos[row].toString()); //
	*System.out.println(dinos[row].toString()); //
	*
}System.out.print("삭제할 공룡정보 > "); // int idx = sc.nextInt(); // //
*if(idx<0||idx>=row) // { // System.out.println("잘못된 정보 입니다"); // }else // {
* //// 공룡정보 삭제 // for (int i = idx; i < row - 1; i++) { // dinos[i] = dinos[i +
*1]; // } // row--; // System.out.println(idx + "공룡정보 삭제 완료"); // } // // }}
* // DinoMain dinoMain = new DinoMain("", "", 0, 0, 0);dinoMain.answer(); //}
*/
