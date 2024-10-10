package com.lang.thredex;
class Account{
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	 void setBalance1(int money) {
		//동기화 블락 : 동기화가 필요한 코드에 synchronized(공유객체명) 을 선언하고
		//코드를 적용하면, 동기화 메서드와 동일한 효과를 얻어낼 수 있다. 이를 동기화 블락이라고 함.
		synchronized (this) {
			this.balance = money;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "현재 잔액 " + balance);
		}
		
	}
	
	void setBalance2(int money) {
		synchronized (this) {
			this.balance = money;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "현재 잔액 " + balance);
		}
		
	}
}

class UseThread extends Thread{
	//공유객체 필드로 선언함
	Account account;
	
	public UseThread(String name) {
		setName(name);
	}
	void setAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.setBalance1(10000);
	}
}

class UseThread2 extends Thread{
	//공유객체 필드로 선언함
	Account account;
	
	public UseThread2(String name) {
		setName(name);
	}
	void setAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.setBalance2(5000);
	}
}
public class SynchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(0);
		
		UseThread t1 = new UseThread("Thread1");
		t1.setAccount(account);
		t1.start();
		
		UseThread2 t2 = new UseThread2("Thread2");
		t2.setAccount(account);
		t2.start();
	}

}
