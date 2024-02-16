package obj;

import java.util.Arrays;

public class advanced {
	private int[] name = new int[2];
	private int num;
 
	advanced() {
		num=2;
		name[0] = 30;
		name[1] = 50; //private의 사본 버전을 pubilc클래스 안에 만듬
		
	}
	public int geter() {return num;}
	public int[] getname() {return Arrays.copyOf(name, num);}
		//arrays copyof 는 원본이아닌 사본 버전을 출력시켜 마음대로 바꾸지 못하게 하는것

	
}
