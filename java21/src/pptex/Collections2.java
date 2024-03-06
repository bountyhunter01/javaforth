package pptex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Collections2 implements Comparable<Collections2> {
	int age;
	private String name;

	public Collections2(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Collections2 other) {
		return Integer.compare(this.age, other.age);
		/*compareTo() 메서드는 같은 타입의 다른 객체를
		 *  인수로 받아서 음수, 0, 양수를 
		 *  두 객체가 어떻게 비교됐는지에 따라 반환한다.*/
	}

	@Override
	public String toString() {
		return "Collections2 [age=" + this.age + ", name=" + name + "]";
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
//		Collections2 cu = new Collections2("name", 20);
//		System.out.println(cu+"\n");
		
		List<Collections2> person = new ArrayList<>();
		person.add(new Collections2("Huub", 1));
		person.add(new Collections2("Josi", 4));
		person.add(new Collections2("Anne", 3));
		person.add(new Collections2("Sper", 7));
		for(Collections2 por: person) {
			System.out.println(por);
		}
		Comparator<Collections2> nameperson =(p1, p2)->
		Integer.compare(p1.getName().length(),p2.getName().length());
		
		
		Collections.sort(person);//정렬해줌s
	}
	Comparator<Collections2> nameComparator = new Comparator<Collections2>() {
//		
		@Override
		public int compare(Collections2 o1, Collections2 o2) {
			return o1.getName().compareTo(o2.getName());//이게 이름을 중심으로 정리하게 출력만들수 있음
		}
	};
	

}
