package pptex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistandList {
	public static void listProperties() {
//	List<String>list = new ArrayList<>();
//	list.add();
		List<String> list = Arrays.asList("j", "a", "v", "a");//이 코드는 변경을 해도 추가및 삭제는 안됨
		System.out.println(list);
		list.set(0, "J");
		list.set(3, "A");
//		list.set(4, "A");
//		list.remove(0);
		System.out.println(list);
	}
	public static void name() {
		ArrayList<String> list1 = new ArrayList<>();//다형성과 수정부분때문에 이것보다는 위에것을 선호
	}

	public static void main(String[] args) {
		listProperties();
	}

}
