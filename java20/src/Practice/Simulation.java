package Practice;

//private static void move() {
//	int Moving = 0;
//	int x = 1;
//	int y = 1;
//	int A = Moving - x;
//	int D = Moving + x;
//	int W = Moving + y;
//	int S = Moving - y;
//}
//
//public static void main(String[] args) {
//	Scanner sc= new Scanner(System.in);
//	String[][] location = new String[10][10];
//	for (int y = 0; y < 10; y++) {
//		for (int x = 0; x < 10; x++) {
//			location[y][x] = ".";
//			location[0][0] = " ";
//			location[1][0] = "1";
//			location[2][0] = "2";
//			location[3][0] = "3";
//			location[4][0] = "4";
//			location[5][0] = "5";
//			location[6][0] = "6";
//			location[7][0] = "7";
//			location[8][0] = "8";
//			location[9][0] = "9";
//			location[0][1] = "1";
//			location[0][2] = "2";
//			location[0][3] = "3";
//			location[0][4] = "4";
//			location[0][5] = "5";
//			location[0][6] = "6";
//			location[0][7] = "7";
//			location[0][8] = "8";
//			location[0][9] = "9";
//			System.out.print(location[y][x] + " ");
//		}
//		System.out.println();
//	}
//	System.out.println("\n 숫자 좌표를 입력하시오:");
//	int x = sc.nextInt();
//	int y = sc.nextInt();
//	System.out.println(location [x]+", " +location [y]);
//	location[1][1]="시작 좌표";
//	System.out.println();    잘못 생각하고 만든 코드 

import java.util.Scanner;

public class Simulation {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	    
		System.out.println("숫자를 입력하시오:");
	    int n = scan.nextInt();
		scan.nextLine();
		String route = scan.nextLine().replaceAll(" ", "");
	
		// 이동 명령어에 따라 좌표 이동
		int x = 1, y = 1;
		
		for(char direction : route.toCharArray()){
		    switch(direction){
		        case 'S':
		            x = (x - 1 < 1 ? x : x - 1);
		            break;
		        case 'W':
		            x = (x + 1 > n ? x : x + 1);
		            break;
		        case 'A':
		            y = (y - 1 < 1 ? y : y - 1);
		            break;
		        case 'D':
		            y = (y + 1 > n ? y : y + 1);
		            break;
		    }
		}
		
		System.out.println(String.format("result point = (%d, %d)", x, y));
	}
}
