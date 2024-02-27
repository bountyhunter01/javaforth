package Practice2;

import java.util.Scanner;

interface Stack {
	int lenght();// 현재 스택에 저장된 개수

	int capacity();// 스택의 전체 저장 가능한 개수

	String pop();// 스택의 top에 실수 저장

	boolean push(String val);// 스택의 top에 저장된 실수 반환
}
//주석 달린 부분들은 전부 내가 부족한 내용이다
public class StringStack implements Stack {
	private String[] stack;
	private int top;

	public StringStack(int capacity) {// 생성자를 만들어서 배열안에 연결
		stack = new String[capacity];
		top = -1;
	}

	@Override
	public int lenght() {// 하나씩 저장되는 식
		return top + 1;
	}

	@Override
	public int capacity() {// 늘어난 배열을 출력하는 식
		return stack.length;
	}

	@Override
	public String pop() {// 배열저장공간
		if (top == -1)
			return null;
		String str = stack[top];
		top--;
		return str;
	}

	@Override
	public boolean push(String val) {
		if(top == stack.length -1)
		return false;
		else {
			top++;
			stack[top]= val;
			return true;
		}
	}

	public static void main(String[] args) {//
		Scanner sc = new Scanner(System.in);
		System.out.println("총 스택 저장공간의 크기를 입력해: ");
//		st.pop();
		int max = sc.nextInt();
		StringStack st = new StringStack(max);//이렇게해야 숫자가 배열 안으로 들어간다
		sc.nextLine();//이거 처럼 줄바꿈해도되고 스캐너 2개 써도 되고

		while(st.top<=max) {
			
				System.out.println("영어 단어를 입력해:");
				String str= sc.nextLine();//이렇게 지정해야 구분가능
			
				if(str.equals("그만"))
				break;
				
		
			boolean Choice = st.push(str);
			if(Choice == false)
				System.out.println("스택이 가득 참");
			//sc.nextLine().equals("") 이건좀 다름
		}
		//while 문이 멈추면 바로 출력
			System.out.println("스택에 저장된 단어장: ");
			int len = st.lenght();
			for(int i =0; i< len; i++) {
				System.out.println(st.pop()+" ");
				sc.close();
			}
	}

}
