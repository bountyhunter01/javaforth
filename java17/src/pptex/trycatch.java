package pptex;

import java.io.FileReader;
import java.io.IOException;

public class trycatch {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\Users\\a\\eclipse-workspace\\java17\\words.txt");
			int character;
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}

	}

}
