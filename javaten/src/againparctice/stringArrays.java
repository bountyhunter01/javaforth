package againparctice;

import java.util.Arrays;
import java.util.Scanner;



public class stringArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 3;
		int increase = 3;
		String[] name = new String[num];
		String[] backUpname = new String[num];
		

		for (int i = 0; i < num; i++) {
			boolean repeat = false;
//			System.out.print("입력(현재길이:" + num + ") :");
			//위에 거는 유동적이지 못한다 예시로 num 이 변하지않고 배열도 3개 안차도 3씩증가함
			 System.out.printf("입력(현재길이:%d) :",num);
			name[i] = sc.nextLine();

			for (int j = 0; j < i; j++) {//입력한 숫자의 이전 인덱스들과 비교하는 반복문
				if(name[i].equals(name[j])) {//equals는 주로 이전 객체값이 동등하지 판단하는데 사용
					repeat=true;
				
				}

			}
			if(repeat) {
				System.out.println("중복!");
				i--;
				continue;
			}
			if(i==num -1) {
				for(int j=0; j<num; j++) {
					backUpname[j]=name[j];
				}
				num+=increase;
				name = new String[num]; //원본 배열을 초기화를 대비해 백업 늘어난 길이로 배열 재생성
				for(int j =0; j<num -increase; j++) {
					name[j]=backUpname[j];
				}
				backUpname= new String[num]; //백업용 배열길이 원본길이에 맞춰줌
				i=-1;
			}
			System.out.println(Arrays.toString(name));
			for(int j = 0; j<i+1; j++) {
				System.out.print(name[j]+", ");
			}
			System.out.println();
		}
		sc.close();
	}

}
//Scanner sc = new Scanner(System.in);
//int num = 3;
//int increase = 3;
//String[] name = new String[num];
//
//for (int i = 0; i < num; i++) {
//    // 중복 체크를 위한 변수
//    boolean isDuplicated = false;
//
//    System.out.printf("입력(현재길이:%d) :", i+1);
//    String input = sc.nextLine();
//
//    // 이미 입력된 값과 비교
//    for (int j = 0; j < i; j++) {
//        if(input.equals(name[j])) {
//            isDuplicated = true;
//            break;
//        }
//    }
//
//    // 중복된 경우, 경고 메시지 출력 후 다시 입력
//    if(isDuplicated) {
//        System.out.println("중복된 값입니다. 다시 입력해주세요.");
//        i--;
//        continue;
//    }
//
//    // 중복되지 않은 경우, 값을 배열에 저장
//    name[i] = input;
//
//    // 배열이 가득 찬 경우, 배열 크기를 늘림
//    if(i == num - 1) {근데 이코드 부분은 안배운거 라 조금 알아가는 시간이 필요
//        String[] temp = new String[num + increase];
//        System.arraycopy(name, 0, temp, 0, num);
//        name = temp;
//        num += increase;
//    }
//}sc.close();

//}
//}
