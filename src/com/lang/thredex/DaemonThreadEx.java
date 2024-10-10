package com.lang.thredex;
/*
 * Daemon 쓰래드 : 프로그래머가 생성한 쓰래드는 일반적으로 run() 을 완료할때까지  stop() 되지 않음.
 * 만약 main 쓰래드가 Some 쓰래드를 생성하고 start 시키면, main 쓰래드가 작업을 완료하고 쓰래드가 소멸되도
 * Some 쓰래드가 run() 을 다 완료하지 않은 상태라면, main 과 상관없이 자신의 run을 계속 수행함.
 * 즉 어떤 쓰래드가 다른 쓰래드를 생성하고 실행할때, 생명 주기를 생성시킨 쓰래드와 같이 하도록 하려면,
 * 생성되는 쓰래드를 daemon 쓰래드로 만들어야 함.
 * 
 * 이렇게 되면, 주 쓰래드가 생성한 자식 쓰래드는 주 쓰래드가 run 을 모두 끝내고 종료되며, 자동으로 같이 종료되어짐.
 * 
 * 이렇게 daemon 쓰래드로 만드는 방법은 생성된 쓰래드에데 setDaemon(true) 값을 주면 됨
 * 
 * 이때, 해당 메서드는 반드시 start() 전에 호출되어야 하고, 이후에 호출되면 예외를 유발시킴.
 */

//자동 저장 기능을 수행하도록 저장 쓰래드를 정의함..
//이 쓰래드는 3초에 한 번씩 내용을 저장 하도록 함.

class SaveThread extends Thread{
	private boolean save;
	
	public void setSave(boolean save) {
		this.save = save;
	}
	@Override
	public void run() {
		//무한루프를 돌면서 save 값이 true 라면, 저장 작업을 수행함.
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(save) {
				System.out.println("작업을 저장하였습니다.");
			}
		}
	}
}
public class DaemonThreadEx {

	public static void main(String[] args) {
		System.out.println("엑셀이 시작됨");
		
		// main 에서는 약 10번의 loop 를 통해서 3초가 경과되면, 저장쓰래드를 활성화하고
		// 10번의 루프가 끝나면 쓰래드가 종료 되도록 합니다.
		SaveThread saveThread = new SaveThread();
		saveThread.setDaemon(true);
		saveThread.start();
		for(int i = 0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			if(i == 3) {
				// 저장 기능 실행함.
				saveThread.setSave(true);
			}
		}
		
		System.out.println("메인쓰래드 종료됨");
		

	}

}
