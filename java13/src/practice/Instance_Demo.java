package practice;

public class Instance_Demo {
	int age;
	String name;
	static String tel;
	static String dept;

	void output() {
		name = "corner";
		age = 26;
		tel = "112";
		dept = "정보통신보안";

		System.out.println("method of instance");
		System.out.println("이름:" + name + "\n나이:" + age + "세\n번호:" + tel + "\n지역:" + dept);
		outputSt();
	}    
	static void outputSt() {
//		name = "corner";
//		age = 26; 
		// don't use , 빌드단계 즉, 로더 단계에서 집어 넣을 공간이 없기 때문에 에러 발생
//		클래스 변수는 인스턴스 변수보다 뒤로 들어갈 수 없다.
		
		tel = "112";
		dept = "정보통신보안";
		
		System.out.println("Method of Class Member");
		System.out.println("번호 : 82-"+tel+"\n지역 : "+dept);
//		output(); //output 메소드에는 인스턴스 변수가 들어가기 때문에 호출 불가능!
	}

	public static void main(String[] args) {
		Instance_Demo in = new Instance_Demo();
		Instance_Demo.tel="82821004";
		Instance_Demo.dept="응 아니야";
//		Instance_Demo.name="응 아니야";//static이 없어서 안만들어짐
		
//		 in.tel="82821004";//static은 원래 안돼는데 버전이 올라갈수록 편의적으로 정상 출력
//		 in.dept="muyo";
		 System.out.println(Instance_Demo.tel+" == "+Instance_Demo.dept);
		Instance_Demo.outputSt();
	}

}
