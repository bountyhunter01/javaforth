package javasix;

import java.util.Scanner;

public class methodex1 {
	
public static int getNum() {
	Scanner gg = new Scanner(System.in);

	System.out.println("숫자를 입력하시오 -->");
	int num = gg.nextInt();
	if(num<1 || num<10) {
		System.out.println("입력된 숫자="+num);
	}else {
		System.out.println("틀렸습니다 다시 입력하시오");
	}
	return num;//closed 하면 제대로 출력이 안된다
	
}
	
	public static void main(String[] args) {
int num = getNum();
num = getNum();
num = getNum();
num = getNum(); // 이거의 개수가 입력창의 개수
	}

}
