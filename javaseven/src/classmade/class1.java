package classmade;

public class class1 {

	public static void main(String[] args) {
		/**
		 * 총 5개의 과목에서 한과목당 문제는 20개 
		 * 총 sum 이 60이 넘어야 합격 
		 * 단, sum 이 60이 넘어도 한과목이라도 8미만이면 탈락
		 */
		//본문의 문제는 랜덤 대신 스캐너를 썼다 그리고 num이랑 system을 합침
		int ran = (int) (Math.random() * 20) + 1;
		int ran2 = (int) (Math.random() * 20) + 1;
		int ran3 = (int) (Math.random() * 20) + 1;
		int ran4 = (int) (Math.random() * 20) + 1;
		int ran5 = (int) (Math.random() * 20) + 1;
		
		int num1 = ran;
		int num2 = ran2;
		int num3 = ran3;
		int num4 = ran4;
		int num5 = ran5;
		int sum = num1+num2+num3+num4+num5;
		
		
		System.out.println("1. 소프트웨어 설계: "+num1);
		System.out.println("2. 소프트웨어 개발: "+num2);
		System.out.println("3. 데이터베이스 구축: "+num3);
		System.out.println("4. 프로그래밍 언어 활용: "+num4);
		System.out.println("5. 정보시스템 구축 관리: "+num5);
		System.out.println("총합은: "+sum);
		if(ran<8||ran2<8||ran3<8||ran4<8||ran5<8) {
			System.out.println("하지만 8미만인 점수가 있어 탈락");
		}else if(sum<60){
			System.out.println("총합이 60미만은 탈락");
		}else {
			System.out.println("합격입니다");
		}
		
	}

}
