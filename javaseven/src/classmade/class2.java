package classmade;

public class class2 {

	public static void main(String[] args) {
		/**
		 * 홀수는 + 짝수는 -로 출력한 값의 총합을 출력하기
		 */
//int[] bell = {1,-2,3,-4,5,-6,..,99,-100};
		//본문은 배열을 쓰지 않았다
	int sum= 0;
	for(int i=1, j=-2; i<=99&&j<=100; i=i+2, j=j-2) {
		System.out.println(i+" "+j+" ");
		sum+= i+j;
		
	}
	System.out.println();
	System.out.print("의 합은="+sum);
	}
}
