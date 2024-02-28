package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInOut {

	public static void main(String[] args) {
		String[] words = new String[87314];
		int i = 0;
		Scanner input = null;
		String fileName = "C:\\Users\\a\\eclipse-workspace\\java17\\words.txt";
		try {
			input = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			System.exit(0);
		}
		while (input.hasNextLine()) {
			String lineString = input.nextLine();
			words[i] = lineString + " ";
			i++;
		}
//		for (int j = 0; j < words.length; j++) {
//			if(words[j].contains("dous")) System.out.println(words[j]);
//		}
		input.close();
	}

}
