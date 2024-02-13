package javasix;

public class methodex2 {

	public static void main(String[] args) {
		int x = 19;
		int[] arr = { 1, 2 };
		callBy(x, arr);
		System.out.println(x);
		System.out.println(arr[0]+","+arr[1]);
		x= callBy(x, arr);
		System.out.println(x);
	}
	public static int callBy(int x , int[]arr) {
		x=-1;
		arr[0]=-1;
		return x;
	}

}
