package practice;

import java.util.Scanner;

public class Account {
	private String owner;//주인
	private long balance; //잔금

	void setOwner(String owner1) {
		this.owner = owner1;
	}

	void setBalance(long balance1) {
		this.balance = balance1;
	}

	String getOwner() {
		return owner;
	}

	long getBalance() {
		return balance;
	}

	Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public long deposit(long amount) {
		System.out.println(amount + "만큼 입금합니다.");
		return this.balance += amount;// 저장
	}

	public long whithdraw(long amount) {
		Scanner sc = new  Scanner(System.in);
		long money = amount;
		System.out.println();
		return this.balance -= money;// 인출
	}
}
