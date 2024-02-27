package Arraytestme;

import java.util.ArrayList;//데이터를 저장하고 관리하는 데에 집중되어 있으며, 
import java.util.Arrays;
//import java.util.Collection; 이거랑 헷갈리지 말기!!!
import java.util.Collections;
import java.util.Iterator;//이미 저장된 데이터를 어떻게 효율적으로 순회하고 접근할지에 집중되어 있다는 것입니다. 이 둘은 보통 함께 사용되며,
//ArrayList에 저장된 요소들을 이터레이터를 통해 순차적으로 접근하고 처리하는 방식으로 활용됩니다.
import java.util.Scanner;

public class ExampleCode {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력해");
//		Integer nu = sc.nextInt();
//		
//		ArrayList<Integer> inArray = new ArrayList<Integer>();
//		inArray.add(1);
//		inArray.add(11);
//		inArray.add(9);
//		inArray.add(7);
//		inArray.add(2);
//		inArray.add(nu);
//		
//		Iterator<Integer> in = inArray.iterator();
//		while(in.hasNext()) {
//			Integer Number = in.next();
//			if(Number>10) {
//				in.remove();//break
//			}
//			
//		}  System.out.println(inArray);//inArray.add(nu); 이거는 결과가 다르다
//	}
//
//}
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력해주세요.");
		ArrayList<Integer> inArray = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
		    Integer num = sc.nextInt();
		    if (num > 5) {
		    	System.out.println("5이상의 수는 입력할수 없습니다");
		        break;
		    }
		    inArray.add(num);
		}
//		Arrays.sort(inArray);//array 메서드 배열이 아니어서 그렇지 이걸 쓰면 순서대로 정리해줌
		Collections.sort(inArray);
		System.out.println(inArray);
	}
}//이거 만드는건 좀 재밌는듯
