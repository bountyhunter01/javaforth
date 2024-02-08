package Array;


public class exmade2 {

	public static void main(String[] args) {

//		int[] arr = {10,20,60,40,55};
//		int index= arr[2];
//		System.out.println(index);
		int[] arr = {10,20,60,40,55};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==60) {
				System.out.println(i);
			}if(i>2) {
				System.out.println(arr[i]);
			}
		}
	}
}
