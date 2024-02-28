package pptex;

import java.io.FileWriter;
import java.io.IOException;

public class TryWrite {

	public static void main(String[] args) {
try {
	FileWriter writer = new FileWriter("C:\\Users\\a\\eclipse-workspace\\javaforth\\input.txt");
			String content = "l can write!";
	writer.write(content);
	writer.close();
}catch (IOException e) {
e.printStackTrace();
}
	}

}
