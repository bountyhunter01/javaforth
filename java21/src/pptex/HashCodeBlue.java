package pptex;

import java.util.HashSet;
import java.util.Set;

public class HashCodeBlue {

	public static void main(String[] args) {
		Set<String> PhoneNumber = new HashSet<>();
		PhoneNumber.add("010-3323-4112");
		PhoneNumber.add("010-5263-7211");
		PhoneNumber.add("010-4223-9172");
		PhoneNumber.add("112");
		PhoneNumber.add("119");
		for (int i = 0; i < PhoneNumber.size(); i++) {
			if (PhoneNumber.contains("112")) {
				PhoneNumber.remove("112");

			}
		}
		System.out.println(PhoneNumber);
	}

}
