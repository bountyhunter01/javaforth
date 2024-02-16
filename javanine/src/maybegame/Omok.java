package maybegame;
import java.util.Scanner;

public class Omok {
	
    public static void main(String[] args) {
        String[][] board = new String[11][11];  // 10x10 오목판
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {//이거 따로 안만들면 에러 떠서 따로 만들어야함
                board[i][j] = ".";
                board[0][0] = " ";
                board[1][0] = "1";
                board[2][0] = "2";
                board[3][0] = "3";
                board[4][0] = "4";
                board[5][0] = "5";
                board[6][0] = "6";
                board[7][0] = "7";
                board[8][0] = "8";
                board[9][0] = "9";
                
                board[0][1] = "1";
                board[0][2] = "2";
                board[0][3] = "3";
                board[0][4] = "4";
                board[0][5] = "5";
                board[0][6] = "6";
                board[0][7] = "7";
                board[0][8] = "8";
                board[0][9] = "9";
                
                    }
                
                }

        // 게임 루프
        for (int turn = 1; turn < 100; turn++) {
            // 현재 플레이어 결정 ('B': 흑돌, 'W': 백돌)
            String currentPlayer = (turn % 2 == 0) ? "●" : "o";// 턴 수를 2로 나눈 나머지를 사용
            System.out.println(currentPlayer + " 차례입니다. 좌표를 입력하세요 (예: 0 0):");

            // 사용자로부터 좌표 입력 받기
            int y = scanner.nextInt();
            int x = scanner.nextInt();

            // 좌표 범위 확인
            if (x <= 0 || x >= 10 || y <= 0 || y >= 10) {
                System.out.println("범위 밖입니다. 다시 입력하세요.");
                turn--;  // 다시 입력받기 위해 turn을 하나 줄임
                continue;
              
            }

            if(!board[x][y].equals(".") ) {//이거는 진짜 논리구조 발상하기힘들었다 
        		System.out.println("겹치면 안돼요 다시 입력하세요!");
        		turn--;
        		continue;
        	}

            // 돌 놓기
            board[x][y] = currentPlayer;

            
            // 오목판 출력
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                	
                    System.out.print(board[i][j] + " ");
                }
               
                System.out.println();
            }
            
         // 가로 방향 검사
            for (int i = 1; i < board.length; i++) {
                for (int j = 1; j < board[i].length - 4; j++) {
                    if (board[i][j] == currentPlayer && 
                        board[i][j] == board[i][j+1] && 
                        board[i][j] == board[i][j+2] && 
                        board[i][j] == board[i][j+3] && 
                        board[i][j] == board[i][j+4]) {
                        System.out.println(currentPlayer + "님, 축하합니다! 승리하셨습니다.");
                        return;
                    }
                }
            }
            //세로 방향 검사
            for (int i = 1; i < board.length; i++) {
                for (int j = 1; j < board[i].length - 4; j++) {
                    if (board[i][j] == currentPlayer && 
                        board[i][j] == board[i+1][j] && 
                        board[i][j] == board[i+2][j] && 
                        board[i][j] == board[i+3][j] && 
                        board[i][j] == board[i+4][j]) {
                        System.out.println(currentPlayer + "님, 축하합니다! 승리하셨습니다.");
                        return;
                    }
                }
            }
         // 우상 대각선 검사
            for (int i = 1; i < board.length - 4; i++) { // 행
                for (int j = 1; j < board[i].length - 4; j++) { // 열
                    if (board[i][j] == currentPlayer &&
                        board[i][j] == board[i+1][j+1] &&
                        board[i][j] == board[i+2][j+2] &&
                        board[i][j] == board[i+3][j+3] &&
                        board[i][j] == board[i+4][j+4]) {
                        System.out.println(currentPlayer + "님, 축하합니다! 승리하셨습니다.");
                        return;  // 게임 종료
                    }
                }
            }

            // 우하 대각선 검사
            for (int i = 4; i < board.length; i++) { // 행
                for (int j = 1; j < board[i].length - 4; j++) { // 열
                    if (board[i][j] == currentPlayer &&
                        board[i][j] == board[i-1][j+1] &&
                        board[i][j] == board[i-2][j+2] &&
                        board[i][j] == board[i-3][j+3] &&
                        board[i][j] == board[i-4][j+4]) {
                        System.out.println(currentPlayer + "님, 축하합니다! 승리하셨습니다.");
                        return;  // 게임 종료
                    }
                }
            }
            //좌하 검사
            for (int i = 1; i < board.length - 4; i++) { // 행
                for (int j = 1; j < board[i].length - 4; j++) { // 열
                    if (board[i][j] == currentPlayer &&
                        board[i][j] == board[i-1][j-1] &&
                        board[i][j] == board[i-2][j-2] &&
                        board[i][j] == board[i-3][j-3] &&
                        board[i][j] == board[i-4][j-4]) {
                        System.out.println(currentPlayer + "님, 축하합니다! 승리하셨습니다.");
                        return;  // 게임 종료
                    }
                }
            }
            // 좌상 대각선 검사
            for (int i = 4; i < board.length; i++) { // 행
                for (int j = 1; j < board[i].length - 4; j++) { // 열
                    if (board[i][j] == currentPlayer &&
                        board[i][j] == board[i+1][j-1] &&
                        board[i][j] == board[i+2][j-2] &&
                        board[i][j] == board[i+3][j-3] &&
                        board[i][j] == board[i+4][j-4]) {
                        System.out.println(currentPlayer + "님, 축하합니다! 승리하셨습니다.");
                        return;  // 게임 종료
                    }
                }
            }
            
            }
        scanner.close();
    }
}
