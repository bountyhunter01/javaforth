package profile1;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
    	System.out.println("점수를 입력하세여");
    	System.out.println("학년을 입력하세여");
    		String me = "입력 값을 초과 했습니다 돌아가";
    	

    	/*
    	* int[] firstGrade = {59, 67, 56, 89,98}; String[] hak = {"1학년","2학년"};
    	*/// 이부분은 스캐너 쓸거면 필요가 없다
        Scanner ko = new Scanner(System.in);

        int lala = ko.nextInt(); // 점수 입력
        int hak = ko.nextInt();  // 학년 입력
                   
        if (0 <= lala && lala <= 100) { // 점수가 0에서 100 사이인지 확인
            if (lala >= 70) { // 점수가 70 이상인 경우
                if(hak == 1 || hak == 2 || hak == 3) {
                    me = "너 정도면 합격이다~"; // 학년이 1, 2, 3인 경우
                }
            } else if (lala >= 60) { // 점수가 60 이상, 70 미만인 경우
                if (hak != 4) {
                    me = "합격이다~"; // 학년이 4가 아닌 경우
                } else {
                    me = " 더 커서와 불합격 이야 다시 도전해"; // 학년이 4인 경우
                }
            } else {
                me = " 그점수로는 불합격 이야 다시 도전해"; // 점수가 60 미만인 경우
            }
        } /*else {
            me = "점수 입력이 잘못되었습니다."; // 점수 입력이 잘못된 경우
        } 이부분이 있으면 me의 문구가 뜨지 않는다 하지만 없었다면 이렇게 3개를 만들어야한다*/

        System.out.println(me); // 결과 메시지 출력
        ko.close(); // 스캐너 자원 해제
    }
}
