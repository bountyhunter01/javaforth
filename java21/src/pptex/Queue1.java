package pptex;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("task 1");
		queue.add("task 2");
		queue.add("task 3");
		
//		System.out.println(queue.element());//헤드만 출력
		
//		Deque<String>deque = new LinkedList<>();//큐는 앞에만 덱은 앞뒤로다 추가제거 가능
//		deque.addLast("fast boy1111");
//		deque.addLast("fast boy");//이게 제일 뒤로 감	
//		deque.offerFirst("fast boys2");//그냥 offer는 맨뒤로 보낸것
//		System.out.println(deque.element());
//		for(String task : deque) {
//			System.out.println(task);
//		}
		/**
		 * poll : 큐의 헤드를 제거하고 반환합니다. 큐가 비어있을 경우 null을 반환합니다.
		 * remove : 큐의 헤드를 제거하고 반환합니다. 큐가 비어있을 경우 예외를 발생시킵니다.
		 * peek : 큐의 헤드를 반환하지만 제거하지는 않습니다. 큐가 비어있을 경우 null을 반환합니다.
		 * element : 큐의 헤드를 반환하지만 제거하지는 않습니다. 큐가 비어있을 경우 예외를 발생시킵니다.
		 */
	String removeString = queue.poll();//헤드만 삭제
	for(String elString : queue) {
		System.out.println(elString);
	}
	}

}
