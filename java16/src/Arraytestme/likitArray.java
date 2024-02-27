package Arraytestme;

import java.util.ArrayList;
import java.util.Arrays;

public class likitArray {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<ArrayList<Integer>>();

		// 첫 번째 행 추가
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		twoDArrayList.add(row1);

		// 두 번째 행 추가
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		twoDArrayList.add(row2);

		// 결과 출력
		for (ArrayList<Integer> row : twoDArrayList) {
//			System.out.println(row.toString());
//			[1, 2, 3]
//			[4, 5, 6]

		    for (Integer num : row) {
		        System.out.print(" |" +num + "| ");
		    }
		    System.out.println();//이거는 그냥 내가 만든형식으로 출력할때쓰는거
//		    |1|  |2|  |3| 
//		    |4|  |5|  |6|
		    
//		    System.out.println(twoDArrayList.toString());
//		    |1|  |2|  |3| [[1, 2, 3], [4, 5, 6]]결과값
//		    |4|  |5|  |6| [[1, 2, 3], [4, 5, 6]]for가 2개여서 이럼
		}
	}

}
