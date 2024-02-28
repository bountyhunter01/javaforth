package pptex;

import java.io.FileReader;
import java.io.IOException;

public class Tryresoureces {

	public static void main(String[] args) {
		try (FileReader file = new FileReader("C:\\Users\\a\\eclipse-workspace\\javaforth\\input.txt")) {
			int character;
			StringBuilder content = new StringBuilder();
			while ((character = file.read()) != -1) {
				content.append((char) character);
			}
			System.out.println(content.toString());
		} catch (IOException e) {
			System.out.println("OOps:" + e.getMessage());
		}
	}

}
