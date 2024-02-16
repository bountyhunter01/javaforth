package obj;

class Tag {
}

public class cow {
	Tag tag;
	String country;

	public static void main(String[] args) {
		cow cow1 = new cow();
		cow cow2 = new cow();
		cow2.tagAnimal(cow1);

	}
	public void setContry(String country) {
		this.country = country;
	}
	void setCountry(String country) {
		this.country = country;
	}
	void tagAnimal(cow cow1) {
		tag = new Tag();
		cow1.setContry("france");
		System.out.println(cow1.country);
//		System.out.println(cow.setCountry("france")); 잘못된 표현
	}
	
}
