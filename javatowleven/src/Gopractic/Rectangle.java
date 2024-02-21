package Gopractic;

public class Rectangle {
	private double horiyson;
	private double selo;

	 Rectangle(double horiyson1, double selo1) {//생성자만들떄 void 필요없음
		this.horiyson = horiyson1;
		this.selo = selo1;
	}

	double getArea() {
		return horiyson * selo;
	}
	double getCircumference() {
		return (horiyson + selo)*2;
	}

	public static void main(String[] args) {
		Rectangle rc = new Rectangle(3.82,8.65);
		System.out.println( "면적:"+rc.getArea());
		System.out.println("둘레:"+rc.getCircumference());
	}

}
