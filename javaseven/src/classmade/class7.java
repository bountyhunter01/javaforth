package classmade;

import java.util.Objects;

public class class7 {
	int brithyear;
	String number;
	String name;

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		class7 other = (class7) obj;
		return Objects.equals(number, other.number);
	}

	public static void main(String[] args) {
		class7 c1 = new class7();
		c1.name = "이보겸";
		c1.number = "1234";
		c1.brithyear = 2001;
		
		class7 c2 = new class7();
		c2.name = "이보겸";
		c2.number = "1234";
		c2.brithyear = 2001;
		
		if(c1.equals(c2))
			System.out.println("c1 ==c2");
		else {
			System.out.println("c1 !=c2");//override을 하면 같아진다 원래는 메모리 주소가 다르다
		}
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1);//소스 에서 to string을 쓰면 .to string이랑 같다
	}

	@Override
	public String toString() {
		return "class7 [brithyear=" + brithyear + ", number=" + number + ", name=" + name + "]";
	}

}
