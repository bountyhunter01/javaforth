package pptex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryResouse {

	public static void main(String[] args) {
		try (FileReader fileReader = new FileReader("output.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader))
				
				 {FileWriter fileWriter = new FileWriter("input.txt");
					BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String upper = line.toUpperCase();
				bufferedWriter.write(upper);
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			System.out.println("oop:" + e.getMessage());
		}
	}

}
