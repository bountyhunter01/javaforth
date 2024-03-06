package pptex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections1 {
	
	public static void main(String[] args) {
		List<String> studentNames = new ArrayList<>();
		studentNames.add("Sarah-milon");
		studentNames.add("tjed");
		studentNames.add("fahya");
		
		Set<String> emailAddresseSet = new HashSet<>();
		emailAddresseSet.add("sarahmilon@amsterdam.com");
		emailAddresseSet.add("tjed@gmail.com");
	
		Map<String, String> userinfo = new HashMap<>();
		userinfo.put("sarah", "new-sarah");
		userinfo.put("tjed", "new-sarah");//k(key)는 중복x but v(value)는 중복O
		System.out.println(userinfo);
		
		
	}

}
