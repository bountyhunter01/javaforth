package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listcollection {

	public static void main(String[] args) {
		List<String>list1 = Arrays.asList("홍길동 " , "전우치 " ,"광해 ");
		for(String name:list1) {
			System.out.print(name);
		}
		List<Integer>list2 = Arrays.asList(1,2 ,3);//aslist는 고정이라 추가 제거가 불가
		List<Integer> fixedList = new ArrayList<>(list2);
		fixedList.add(3, 4);
		for(Integer i =0; i<fixedList.size(); i++) {//추가할려면 이렇게 변경해야함
			
			System.out.print("\n"+ fixedList.get(i)+ " ");
		}//Set<String> set = new HashSet<String>(); 이걸로 만들면 중복저장안함
	}

}
