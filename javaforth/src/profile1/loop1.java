package profile1;

public class loop1 {

	public static void main(String[] args) {
		int[] ia = { 1, 2, 3 };
		for (int n : ia) {// 이렇게 쓰면 3개의 조건이 불필요
			System.out.println(n);
		}
		int[] data = { 9, 3, 5, 7 };
		System.out.println("[]\t[n]\t histogram");
		for (int i = 0; i < data.length; i++) {
			
			System.out.print(i + "\t" + data[i] + "\t");
			//println쓰면 다른 줄로 가기 떄문에 이쁘게 안나옴 주의
			for (int j = 1; j <= data[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}/*\t: 탭을 삽입  \b: 백스페이스 삽입 
		 \n: 뉴라인(개행문자) 삽입
         \”: 따옴표 삽입 \\: 백슬래시 삽입*/
	}

}
