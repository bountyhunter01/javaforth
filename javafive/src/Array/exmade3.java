package Array;

public class exmade3 {

	public static void main(String[] args) {
		int[] arr = { 10, 22, 576, 11, 3, 465, 74 };
		int sum= 0;
		double ace=0;//평균 값
		for(int i =0; i<arr.length; i++) {
			sum=arr[i]+sum;
			ace=sum/arr.length;
		}System.out.println("합은= "+sum+" 평균은= "+ace);
	}

}
