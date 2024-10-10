package com.lang.thredex;
/*
 *  쓰래드의 안전한 종료 방법 : 일반적으로 수행중인 쓰래드를 즉시 멈추려면, run()이 채 완료되기 전에 종료된다는 의미이다.
 *  이 run() 이 while() 과 같은 반복문 내부에 존재하면, 즉시 종료시 수행시 획득한 자원(Resource) 등이 채 해체(release)
 *  되기 전에 끝나버릴 수 있다. 이런 경우엔 stop() 대신 interupt() 예외를 발생시켜서 쓰래드가 안전하게 종료되도록 로직 처리를 해야한다. 
 */

class PrintThread extends Thread{
	private boolean stop; // 쓰래드를 즉시 종료할 지 여부의 flag 선언
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			//이 영역은 쓰래드가 수행하면서 사용될 로직을 처리하는 영역
			System.out.println("쓰래드 실행중....");
		}
		//이 블락 밖으로 빠진다면, 쓰래드가 종료되어야 한다는 로직흐름.
		//따라서 기존에 스트림등의 리소스 연결 작업이 되어있다면, 여기서 해제 시킨다.
		System.out.println("쓰래드 리소스 정리중...");
		System.out.println("쓰래드 run 종료");
	}
}

class InturupEx extends Thread{
	//interupt() 를 호출해서 run() 이 완료가 안 된 쓰래드를 안전종료 시키는 예시
	public void run() {
		try {
			while(true) {
				System.out.println("run() 이 수행중인 작업들...");
				
				Thread.sleep(1); //InterruptedException 는 반드시 쓰래드가 waiting 영역으로 전이되어야만 호출되어진다
				//따라서 일부러 전이시킴...
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("리소스 정리");
		System.out.println("쓰래드 run() 종료");
	}
}
public class Thread_Safty_Stop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//interrupted 예외를 발생시켜 쓰래드를 안전종료 예시2
		Thread interThread = new InturupEx();
		interThread.start();
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			
		}
		
		// 메인이 3초 동안 sleep 되는 동안 InterThread 는 1/1000 초간 sleep 에 빠졌다 run() 을 계속 수행함..
		// main 이 3초가 지난 후, interThread 에게 interrupted() 를 호출하여 예외를 발생시키면, 쓰래드가 종료됨
		interThread.interrupt();
		
//		flag 를 이용한 쓰래드 안전 종료 예시1.
//		PrintThread theThread = new PrintThread();
//		theThread.start();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		//5초 후 run 메서드의 while 의 flag 를 변경해서 쓰래드를 종료 시킨다
//		theThread.setStop(true);
	}

}
