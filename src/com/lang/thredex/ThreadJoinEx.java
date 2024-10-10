package com.lang.thredex;
/*
 *  join() : join() 을 호출한 쓰래드를 그 즉시 실행대기 영역으로 전이되고,
 *  호출된 쓰래드의 run() 이 오나전히 종료시까지 대기 하다가, 해당 쓰래드가 run() 을 종료하면 그 후에 Runnable --> Running 상태로 전이됨
 */

class CalThread extends Thread{
	private long num;
	
	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + "쓰래드 시작..");
		for(int i = 1; i < 1000; i++) {
			num += i;
		}
	}
}
public class ThreadJoinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalThread thread = new CalThread();
		thread.start();
		
		try { // join 을 호출한 쓰래드는 일시정지 영역으로 전이되고, join() 이 호출된 쓰래드가 run() 을 다 끝내고
			  // 종료될때까지 기다리다가, Runnable --> Running 상태로 전이됨.
			thread.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("1 ~ 1000 의 누적합 : " + thread.getNum());
		
		
	}

}
