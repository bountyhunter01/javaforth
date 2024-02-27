package Practice2;

public class For_each {

	public static void main(String[] args) {
		int[] n = { 10, 22, 19, 14, 35 };
		String  names[] = {"탄산수", "두유", "젤리", "커피", "사탕"};
		int sum=0;
		
		for (int k:n) {//index k 가 [k]가 반복되는 구조랑 비슷하다
			System.out.print(k+ " ");
			sum+=k;
		}
		System.out.println("합은 "+sum );
		for(String s:names) {
			System.out.print(s+" ");
//			if(s!=null) {
//				System.out.println(s-names[1]); 이런 작업은 적합하지않음
//			}
			
		}
	}

}
