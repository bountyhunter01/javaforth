package javasix;

import java.util.Scanner;

public class now5 {
	
	public static int performCalc(int x, int y, String operation){ // "parameters"
	       int result = switch(operation) {
	          case "+" -> x + y;
	          case "-"  -> x - y;
	          case "*"  -> x * y;
	          case "/"  -> x / y;
	          case "%" -> x % y;
	          default -> {
	              System.out.println("Unknown operation: " + operation);
	              yield -1; // error
	          }
	       };
	     return result;
	}

	public static void main(String[] xrgs) {
		
	
		Scanner var = new Scanner(System.in);
		System.out.println("입력하시오");
		int x = var.nextInt();
		int y = var.nextInt();
		
		while(x>0&&y>0) {
			
			System.out.println(performCalc(x,y,"+"));
			System.out.println(performCalc(x,y,"-"));
			System.out.println(performCalc(x,y,"*"));
			System.out.println(performCalc(x,y,"/"));
			System.out.println(performCalc(x,y,"%"));
			break;
		}
		var.close();
	}

}
