package example;

public class importgx3 {
    public static String Numbering(int start, int end) {
        int sum = 0;
        String output ="";
        for (int i = start; i <= end; i++) {
            output += i + " "; // 공백을 추가하여 숫자를 구분합니다.
            sum += i;
        }
        return output + sum; // sum을 String으로 변환하여 output에 더합니다.
    }

    public static void main(String[] args) {
        System.out.println(Numbering(1, 10)); // 예시로 1부터 4까지의 숫자와 그 합을 출력합니다.
    }
}
//main값이 없으면 프로그램이 시작이 안한다