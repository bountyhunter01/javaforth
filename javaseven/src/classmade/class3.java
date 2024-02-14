package classmade;


import java.util.Scanner;

public class class3 {

	/**
	 * 
	 * @param 숫자를 입력하면 그 수까지의 수의 약수를 모두 구하는 코드
	 */
	public static void main(String[] args) {
		Scanner gg = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num = gg.nextInt();
//	약수 구한다고 만든식	int div = num/num;
		
		for (int i=1; i<=num; i++) {			
			System.out.print(i+":");
			for(int j=1; j<=num; j ++) {
				if(i%j ==0) {//약수 구하는 식
					System.out.print(j+" ");
				}
			}System.out.println();//전체 식의 구조
		}
	}

}
