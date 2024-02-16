package newobj;

public record Person(String name, Integer age) {
	public Person {
		if (age < 18) {
			name = "error";
			age = -1;
		}
	}
}

class PersonTest{
	public static void main(String[]args) {
		Person p1 = new Person("Joe Bloggs", 20);
		System.out.println(p1);
		System.out.println(p1.name());
		System.out.println(p1.age());
	}
}