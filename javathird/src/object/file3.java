package object;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file3 {

	public static void main(String[] args) {
		try {
			File cgv = new File("out.txt");
			Scanner it = new Scanner(cgv);
			while ((it.hasNextInt())) {
				System.out.println(it.nextInt() * 100);
			}
			it.close();
		} catch (FileNotFoundException e) {//에외가 생겼을떄 에러를 출력해라는뜻
			e.printStackTrace();
		}
	}

}
