package pptex;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Comparerandnew extends Collections2{

	public Comparerandnew(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Comparator<Collections2> yourName = (p1,p2)->
		p1.getName().compareTo(p2.getName());
		
		TreeSet<Collections2> personTree = new TreeSet<>(yourName);
		personTree.add(new Collections2("Tom", 1));
		personTree.add(new Collections2("Jon", 4));
		personTree.add(new Collections2("Ang", 2));
		
//		Collections.sort(personTree,yourName);//treeset은 정렬시키기 떄문에 할필요없음
		System.out.println(personTree);
		
		TreeMap<Collections2, Integer>perTreeMap = new TreeMap<>();
		perTreeMap.put(new Collections2("garly", 1), 3);
		perTreeMap.put(new Collections2("golala", 2), 2);
		perTreeMap.put(new Collections2("dochtml", 3), 1);//뒤에 값은 이 객체의 값으로 출력
		System.out.println(perTreeMap);
		
	}

}
