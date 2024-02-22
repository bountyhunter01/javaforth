package practice;

class Student {
	public String name;
	public String dept;
	static int kor;
	static int eng;

	Student(String name1, String dept1) {
		this.dept = dept1;
		this.name = name1;

	}

	static void total() {
		System.out.println("총합:" + (kor + eng));
	}

//	static int publicVar(int kor, int eng) {
//		return kor + eng;
//	}이거는 틀린 코드 부분이다
}

public class StaticIn {
	static int publicVar;//student 안에 넣으면 쓸때 student.publicVar로 써야 정상 

	public static void main(String[] args) {
		publicVar =100;
		Student.kor=100;
		Student.eng=80;
		
		Student.total();
		
		Student st = new Student("이보겸", "화학과");
		System.out.println("이름:" + st.name+"\n학과:" + st.dept);
	}

	static void sum() {
		System.out.println(publicVar);
	}

	static void rank() {
		publicVar++;
	}
}
