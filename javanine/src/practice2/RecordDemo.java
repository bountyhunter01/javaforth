package practice2;


public class RecordDemo {
	public static void main(String[] args) {
		Person person1 = new Person("주연", 26);
		System.out.println("이름: "+ person1.name()+ ", 나이: " +person1.age());
		System.out.println("객체 정보: "+ person1.toString());
		Person person2 = new Person("주연", 26);
		Person person3 = new Person("진수", 23);
		
		if(person1.equals(person2)) System.out.println("회원 정보가 동일합니다");
		else System.out.println("회원 정보가 틀립니다 본인이 맞습니까?");
		
		if(person1.equals(person3))System.out.println("회원 정보가 동일합니다");
		else System.out.println("회원 정보가 틀립니다 본인이 맞습니까?");
	}
}
