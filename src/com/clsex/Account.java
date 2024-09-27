package com.clsex;

public class Account {

//	private int balance;
//	private static final int MIN_BALANCE = 0;
//	private static final int MAX_BALANCE = 1000000;
//	
//	public void setBalance(int balance) {
//		if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
//			return;
//		}
//		this.balance += balance;
//	}
//	
//	
//	public static void main(String[] args) {
//		Account acc = new Account();
//		acc.setBalance(1000);
//		System.out.println(acc.balance);
//	}
	
	public static int instanceCnt = 0;
	
	public static char[] length;
	private String AccNum; //계좌번호
	private String Name; //이름
	private int balance; //잔액 
	
	public Account(int balance, String accNum, String name) {
		instanceCnt++;
		this.AccNum = accNum;
		this.Name = name;
		this.balance = balance;
	}
	
	public String getAccNum() {
		return AccNum;
	}

	public String getName() {
		return Name;
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
		System.out.println("입금 " + balance + " 완료");
		System.out.println("현재 잔액 : " + this.balance);
	}
	
	public int withdraw(int money) {
		if(money > this.balance) {
			System.out.println("잔액 초과함");
			return 0;
		}
		this.balance -= money;
		System.out.println("출금 완료. 현재 잔액 : " + this.balance);
		return money;
	}

	public String toString() {
		return "계좌번호" + "AccNum" + "계좌주" + "Name" + "잔액" + "balance";
	}
	
	
	//계좌가 생성됨과 동시에 위 필드의 값은 초기화 되어야 함
	
	
}
