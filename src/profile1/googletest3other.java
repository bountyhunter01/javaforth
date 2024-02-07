package profile1;

import java.util.Scanner;

public class googletest3other {

	public static void main(String[] args) {
		Scanner H = new Scanner(System.in);

		String gg;//String gg=""; 이것과 String gg;이것은 확실한 차이가 있다
		System.out.println("학점 검색하시오 ");
		while (H.hasNext()) {
			int you = H.nextInt();
			if (you >= 90) {
				gg ="A";
			} else if (you >= 80) {
				gg ="B";
			} else if (you >= 70) {
				gg ="C";;
			} else {
				gg ="F";
			
			}System.out.println("너 학점은"+gg+" 정도쯤 돼");
			
		}
		H.close();
		}

}
