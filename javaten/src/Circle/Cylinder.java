package Circle;



public class Cylinder {
	Circle cir;// circle 을 정의해놓은 클래스 떄문에 가능
	double height;

	public  Cylinder(Circle cir1, double height1) {
		this.cir = cir1;
		this.height = height1;
	}

	public double Volum() {// 부피 는 반지름 *반지름 *3.14 * 높이이다
		return cir.getArea() * height;
	}

	public static void main(String[] args) {
		Circle cp = new Circle(2.8);
		Cylinder cd= new Cylinder(new Circle(2.8) , 5.6);//새 객체의 수로 적어야한다
		double height = 5.6;
		
		System.out.println("부피: "+(cp.getArea()*height));
//		System.out.println(cd.Volum()); 동일한 결과
	}

}
