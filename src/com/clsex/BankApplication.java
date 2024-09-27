package com.clsex;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account chanwoo=null, jiyoon=null, kyeongsu=null;
		Account[] accounts = null;
		
		System.out.println("--------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.println("번호 선택하세요.");
		System.out.print("선택 : ");
		int choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) { //계좌생성을 요청했다면..
			
			chanwoo = new Account(1000,"1234-5678", "찬우");
			jiyoon = new Account(2000, "1111-1113", "지윤");
			
			accounts = new Account[Account.instanceCnt];
			System.out.println(accounts.length);
			
			System.out.println("계좌가 생성됨");
			System.out.println("계좌번호 : " + chanwoo.getAccNum());
			System.out.println("계좌주 : " + chanwoo.getName());
			System.out.println("초기입금액 : " + chanwoo.getBalance());
			System.out.println("결과 : 계좌가 생성되었습니다.");
			
		}if(choice == 2) {
			accounts[0] = new Account(1000,"1234-5678", "찬우");//chanwoo;
			accounts[1] = new Account(2000, "1111-1113", "지윤");//jiyoon;
			
			
			for(int i = 0; i<accounts.length; i++) {
				Account acc = accounts[i];
				System.out.println(acc.getAccNum());
				System.out.println(acc.getName());
				System.out.println(acc.getBalance());
			}
		}if(choice == 3) {
			accounts[0] = new Account(1000,"1234-5678", "찬우");//chanwoo;
			accounts[1] = new Account(2000, "1111-1113", "지윤");//jiyoon;
			
			//찬우계좌번호를 받았다 치고, 입금액은 1000 원 이라 치고...
			String accNum = "1234-5678";
			int money = 1000;
			
			for(Account acc : accounts) {
				if(acc == null)
					break;
				//찬우 계좌인지를 확인
				if(acc.getAccNum().equals(accNum)) {
					acc.setBalance(money);
				}
			}
			System.out.println("계좌번호 : " + accNum);
			System.out.println("입금액 : " + money);
		}if(choice == 4) {
			accounts[0] = new Account(1000,"1234-5678", "찬우");//chanwoo;
			accounts[1] = new Account(2000, "1111-1113", "지윤");//jiyoon;
			
			//찬우계좌번호를 받았다 치고, 입금액은 1000 원 이라 치고...
			String accNum = "1111-1113";
			int money = 1000;
			
			for(Account acc : accounts) {
				if(acc == null)
					break;
				//지윤 계좌인지를 확인
				if(acc.getAccNum().equals(accNum)) {
					int money1 = acc.withdraw(money); 
					// 위 문법에서 int money1로 정의 한 것은 같은 블럭 내에서 변수명이 중복이 되면 안되기 때문에 (이미 int money = 1000;이라고 정의) 변수명을 다르게 정의함
				}
			}
			System.out.println("계좌번호 : " + accNum);
			System.out.println("출금액 : " + money);
		}
	
		
		
//		Account jiyoon = new Account(2000, "1111-1113", "지윤");
//
//		Account[] accounts = new Account[100];
//		accounts[0] = chanwoo;
//		accounts[1] = jiyoon;
//		
//		System.out.println(chanwoo);
//		System.out.println(jiyoon);
		
	}

	private static Object accounts() {
		// TODO Auto-generated method stub
		return null;
	}

}