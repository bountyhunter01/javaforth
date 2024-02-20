package profile1;

public class wowgoodcode1 {

	public static void main(String[] args) {
for(int i =2; i<=9; i++) {
	System.out.printf("\n***%d단***\n",i);
	for(int j=1; j<=9; j++) {
		int k=i*j;
		//System.out.println(j+" x "+j+"= "+k); 한계의 구구단만 반복됨
		System.out.printf("%d x %d= %d\n",i , j ,k);
	}//printf는 input에서 type과 그 지정변수를 만드는것과 유사하다
}
	}

}
