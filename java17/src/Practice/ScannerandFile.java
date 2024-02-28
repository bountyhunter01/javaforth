package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerandFile {

	public static void main(String[] args) {
//		try (FileReader wr = new FileReader("words.txt")) {
//			BufferedReader bu = new BufferedReader(wr);
//			int line;
//			while ((line = bu.read()) != -1) {
//				System.out.print((char)(bu.read()));
//			}
//
//		} catch (IOException e) {
//			System.out.println(" Error file do will again");
//		}

		try (FileReader wr = new FileReader("C:\\Users\\a\\eclipse-workspace\\java17\\words.txt")) {
			BufferedReader bu = new BufferedReader(wr);
			int character;
			while ((character = wr.read()) != -1) {
				System.out.print((char) character);
			}
		} catch (IOException e) {
			e.printStackTrace();

		}
		Scanner sc = new Scanner(System.in);
		System.out.println("\n회원 정보를 입력하시오(이름, 나이, 아이디, 비번)");
		String inputString = sc.nextLine();

		try {
			File file = new File("words.txt");
			Scanner fileReader = new Scanner(file);

			while (fileReader.hasNextLine()) {
				String name = sc.nextLine();// 이름
				
//				sc.nextLine();// 줄바꿈

				String Id = sc.nextLine();// 아이디
				String password = sc.nextLine();// 비번
				String age = sc.nextLine();// 나이
				String fileContent = fileReader.nextLine();
				if (inputString.equals(fileContent)) {
					System.out.println(" log in complete");
					return;
				} else {
					System.out.println("log in fault");
					return;
				}
			}
			fileReader.close();
		} catch (IOException e) {
			System.out.println("file not found");
			e.printStackTrace();

		}
		sc.close();
	}
}
