package object;

import java.util.Scanner;

public class file1 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);//()파일이름을 넣으면 파일을 스캔함 
		double i = it.nextDouble();
		System.out.println(i*10000);
		it.close();//닫아 줘야 warring이 안뜬다
	}

}
