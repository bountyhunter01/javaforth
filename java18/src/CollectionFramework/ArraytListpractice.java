package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Person {
	 String name;
	String age;
	String sex;
	//객체연결
	public Person(String name, String age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
}

public class ArraytListpractice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Person> personList = new ArrayList<>();
		 personList.add(new Person("Daniel","23", "여"));
		 personList.add(new Person("Sam","40", "남"));
		 personList.add(new Person("Hugo","32", "남"));
		 
		 while(true) {
		 System.out.println("당신은 지금 용의자 정보를 검색해서 찾아야합니다");
		 System.out.println("\n이름:");
		 String Personname = sc.nextLine();
		 System.out.println("나이:");
		 String Personage = sc.nextLine();
		 System.out.println("성별:");
		 String Personsex = sc.nextLine();
		 
		 Iterator<Person> it = personList.iterator();//이게 중요
		 while(it.hasNext()) {
			 Person person = it.next();
			 if(Personname.equals(person.name)&& Personage.equals(person.age)&&  Personsex.equals(person.sex)) {
				 System.out.println("용의자와 범인의 정보가 일치합니다");
				 return;
			 }
		 }
//		 personList.set(0,new Person ("bob", "40","남")); 이렇게 써야 바뀜
		 System.out.println("다른 사람이야 다시 찾아보자");
		 } 
	}

}
