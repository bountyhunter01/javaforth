package Practice;

import java.util.Scanner;

class Seat {
	private String name;

	public void reserve(String name) {
		this.name = name;
	}

	public void cancel() {
		this.name = null;
	}

	public boolean isOccupied() {
		return name != null;// true x  이미 예약된자리인지 확인하는 불린
	}

	public boolean match(String checkName) {
		return name.equals(checkName); //예약된 이름의 중복체크
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Theater {
	private Seat[][] seats;
	private int rowCount, colCount;

	public Theater(int rowCount, int colCount) {
		this.rowCount = rowCount;
		this.colCount = colCount;
		// 이렇게 구조짜는거는 ai랑 예제랑 같다
		seats = new Seat[rowCount][colCount];// seat배열을 for문안에 넣어서 필드생성
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				seats[i][j] = new Seat();
			}
		}
	}
	public boolean reserveSeat(int row, int col, String name) {
        if (row >= 1 && row <= rowCount && col >= 1 && col <= colCount && !seats[row-1][col-1].isOccupied()) {
            seats[row-1][col-1].reserve(name);
            return true;
        }
        return false;
    }

    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= colCount; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < rowCount; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < colCount; j++) {
                System.out.print(seats[i][j].isOccupied() ? "[O]" : "[ ]");
            }
            System.out.println();
        }
    }
}

public class Mypractice {
    public static void main(String[] args) {
        Theater th = new Theater(9, 9);
        Scanner sc = new Scanner(System.in);

        while (true) {
            th.printSeatMatrix();
            System.out.println("좌석을 입력하시오 (예: 2, 3)");
            int row = sc.nextInt();
            int col = sc.nextInt();
            sc.nextLine(); // 줄바꿈 문자 제거
            System.out.println("성함을 입력해주세요");
            String name = sc.nextLine();
            if (!th.reserveSeat(row, col, name)) {
                System.out.println("이미 예약되어 있는 자리이거나 범위를 벗어났습니다. 다시 입력하세요.");
            } else {
                System.out.println("예약이 완료되었습니다.");
            }
        }
    }
}
//	public boolean reserveSeat(int row, int col, String name) {
//        if (row >= 0 && row < rowCount && col >= 0 && col < colCount && !seats[row][col].isOccupied()) {
//            seats[row][col].reserve(name);
//            return true;
//        }
//        return false;
//    }
//	
//	public void printSeaMatrix() {
//		System.out.println("  ");
//		for(int i = 1; i<9; i++){
//			System.out.println(" "+i);
//		}
//		System.out.println();
//		
//		
//		
//	}
//}
//
//public class Mypractice {
//
//	public static void main(String[] args) {
//		Theater[][] th = new Theater[11][11];
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.println("좌석을 입력하시오 (1 , 2)");
//		 int row = sc.nextInt();
//	        int col = sc.nextInt();
//	        sc.nextLine(); // 줄바꿈 문자 제거
//	        System.out.println("성함을 입력해주세요");
//	        String re =sc.nextLine();
//	       
//            if (!th.reserveSeat(row, col, name)) {
//                System.out.println("잘못된 정보입니다. 다시 입력하세요.");
//            }
//            th.printSeaMatrix();
//        }
//        // sc.close(); // 종료 조건이 없으므로 Scanner를 닫을 수 없습니다.
//}


