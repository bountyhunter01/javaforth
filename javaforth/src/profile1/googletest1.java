package profile1;

import java.util.Scanner;

public class googletest1 {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		
		System.out.println("점수를 입력 하..시..오: ");//있으면 좀더 있어보임
		int score = y.nextInt();
		//for(int i=0; i<=100; i++) {} 이거 필요없어!!!
			if (score>79) {
				System.out.println(score+" 합격");
				
			}else
				System.out.println(score+" 불합격");
		y.close();
	}

}
