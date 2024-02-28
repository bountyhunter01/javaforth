package pptex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throw2 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("input.txt");
			int character;
			while ((character = fr.read()) != -1) {
				System.out.println((char) character);
			}
			fr.close();
//		} catch (FileNotFoundException e) { //하위 예외를 먼저 처리해야 특정이 된다
//			System.out.println("Not found:"+e.getMessage());
		}catch (IOException e) {
			System.out.println("IO error:"+e.getMessage());
		}
	}
}
