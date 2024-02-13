package javasix;

import java.util.Scanner;

public class now4 {
/**
 * 
 * @param 별로 다이아몬드 만드는 코드 
 */
	public static void printStars(int n) {
		int mid = (n/2)+1;
		
		for (int i = 1; i <= mid; i++) {//전체 공백에 정사각형 크기 상태
            for (int j = 1; j <= mid - i; j++)//그전체 에서 i값을 뺸거에서 1만큼더한 위치
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)//그공백 안에서 i값을 홀수(을 2를곱한 값에서 -1를) 한거를 1식 더한상태 
                System.out.print("*");
            System.out.println();
        }

        for (int i = mid - 1; i > 0; i--) {//mid전체 크기에서 점점 줄어들게 하는 크기
            for (int j = 1; j <= mid - i; j++)//점점 줄어들게하는 크기보다 크지 않게하면서 홀수를 유지 시킴
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
		
	
	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int way = se.nextInt();

		printStars(way);
		se.close();
	}

}
