package profile1;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력해: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max=a;
		int mini=a;
		int sum= a+b+c;
		float ave= sum / 3.0f;
		
	if(max<b)max=b;//이부분이 이 코드에서 제일 기억해야하는 부분
	if(max<c)max=c;
		
	if(mini>b)mini=b;
	if(mini>c)mini=c;
	
	
		System.out.println("최대값: "+max+"\n최소값: "+mini+
				"\n합계: "+sum+"\n평균"+ave);
		sc.close();
	}
}
