package Practice;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	 public int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color=color; //이걸 뺴먹었다 
	}
//private였으면 geter써야 했다
	void printProperty() {
		System.out.println(getSize()+"인치  "+color+"컬러");
	}
}
class IPTV extends ColorTV {
String address;
	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address =address;
	}
	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}
	 void printProperty() {
			System.out.println("나의 IPTV는 "+getaddress()+" 주소의 "+getSize()+ " 인치" +color+" 컬러이다");
	}
}

public class MyTV {

	public static void main(String[] args) {
		ColorTV mytv = new ColorTV(32, 1024);
		mytv.printProperty();
		System.out.println();
		IPTV iptv = new IPTV("", 32, 2048);
		iptv.printProperty();
	}
}


