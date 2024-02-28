package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ClassoutPut {

	public static void main(String[] args) {
		try {
			int lineNum = Integer.parseInt(args[1]);
			String fileName = args[1];
			File f = new File(fileName);
			if (f.exists() && !f.isDirectory()) {
				BufferedReader brBufferedReader = new BufferedReader(new FileReader(fileName));
				String lineString = " string is very good";
				int i = 1;
				while ((lineString = brBufferedReader.readLine()) != null && i <= lineNum) {

					System.out.println(i + ":" + lineString);
					i++;
				}
			} else {
				throw new FileNotFoundException(fileName + "은 없는 파일입니다");
			}
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("USAGE: java fileHead 10 Filename");
		}
	}
}