package pptex;

public class Throw1 extends Exception {

	public Throw1() {
		super();
	}

//	public Throw1(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//		super(message, cause, enableSuppression, writableStackTrace);
//		// TODO Auto-generated constructor stub
//	}

	public Throw1(String message, Throwable cause) {
		super(message, cause);
	}

	public Throw1(String message) {
		super(message);
	}

	public Throw1(Throwable cause) {
		super(cause);
	}

	public Throw1(Exception e) {
		super(e);
	}
	

	public static void main(String[] args) {

	}

}
