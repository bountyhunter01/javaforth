package pptex;

import java.io.FileReader;
import java.io.IOException;

public class ThrowFinally2 {

	public static void main(String[] args) {

	FileReader re = null;

	try {
		 re = new FileReader("C:\\Users\\a\\eclipse-workspace\\javaforth\\input.txt");
		int character;
		while ((character = re.read()) != -1) {
			System.out.print((char) character);
		}
		}catch (IOException e) {//에러가 있으면 이거만 출력
			System.out.println("IO error:"+e.getMessage());
		}finally {//에러가 없으면 이거랑 같이 출력
			if (re !=null) {
				try {
					re.close();
					System.out.println("file close good");
				}catch (Exception e) {
					System.out.println("err close"+e.getMessage());
				}
			}
		}

	}
	
}
