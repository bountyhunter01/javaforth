package pptex;

public class StringBuilder1 {//불변의 참조타입을 변경가능상태로 만듬
	public static void howManyobj() {
		StringBuilder sb = new StringBuilder("The");
		sb.append(" quick");// add랑 비슷한역할
		System.out.println(sb);
		sb.append(" brown fox");
		System.out.println(sb);
//변수가 아닌값은 새 객체뒤에 붙는다
	}
	public static void whatHappens(String s , StringBuilder sb1) {
		s= s.concat("is there");
		sb1.append("there is");
		System.out.println("what:" +s);
		System.out.println("what:" +sb1);
		//변수값으로 주면 앞에 붙는다
	}

	public static void main(String[] args) {
		howManyobj();
		whatHappens("hi ", new StringBuilder("D "));
//		String s ="hi";//이 두개가 저 하나랑 같은 결과
//		StringBuilder suv = new StringBuilder("d");
		System.out.println();
	}

}
