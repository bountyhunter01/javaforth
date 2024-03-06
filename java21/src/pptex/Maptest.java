package pptex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Maptest {

	public static void main(String[] args) {
//		Map<String, String> testMap = new HashMap<>();
//		testMap.put("sarah mlion", "sarah doyle");
//		testMap.put("ted", "sarah doyle");
//		testMap.put("fahys", "fahys osei");
//		
//		Set<String> keys = testMap.keySet();
//		Set<String> values = testMap.values();
//			System.out.println(" first:"+key+" fulls: "+testMap.get(key));
//			System.out.println(testMap.hashCode());
//			
//		}
		Map<String, String> tMap = new LinkedHashMap<>();//linked라고해서 해시코드값이 서로 다르진않다
		tMap.put("sarah mlion", "sarah doyle");
		tMap.put("ted", "holly");
		tMap.put("fahys", "fahys osei");
		
		Set<String> keys = tMap.keySet();
		for(String key: keys) {
			System.out.println(" first:"+key+" fulls: "+tMap.get(key));
		System.out.println(tMap.hashCode());
		}
		
//		for(Map.Entry<String, String> entry : testMap.entrySet()) {
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
		List<String> names = new ArrayList<>();
		names.add("julia");//0에서 1로 밀림
		names.add(0,"Jenny");
		String name2 = names.get(1);
		System.out.println("\n"+names);
		names.set(1, "monica");
		String name3 = names.get(1);
		System.out.println(names);
	}

}
