package com.lang.thredex;
/*
 * yield() : 다른 쓰래드에게 실행을 양보하고, Runnable 상태로 갔다가, 다른 쓰래드의 작업이
 * 끝난 후 다시 Runnable 상태로 와서 수행하도록 하는 제어 메서드
 * 쓸데없는 자원 점유를 막기 위한 메서드임
 */
class WorkThread extends Thread{
	//run 에서 무한 루프 시, flag 필드..
	//예를 들자면, 채팅같은 경우, 입력 값을 무한정 대기 하기 보다는, 입력의 여부를 수행하는 쓰래드가
	//CPU 를 점유하고 있다가, 입력신호가 감지되면, flag 를 바꿔서 빠져나가면, 그 이후에 입력닶들을
	//처리하는 쓰래드가 running 상태로 전이되게 하는 기법
	boolean flag = true;
	
	public WorkThread(String name) { //쓰래드 이름을 파라미터로 하는 생성자
		setName(name); //상속받은 쓰래드의 setName()을 호출, 이름 세팅
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(getName() + "!!!");
			if(flag) {
				System.out.println(getName() + " 작업 처리");
			}
//			else {
//				Thread.yield();
//			}
		}
	}
}
public class YieldExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkThread work1 = new WorkThread("워크쓰래드A");
		WorkThread work2 = new WorkThread("워크쓰래드B");
		work1.start();
		work2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//work1 의 상태값을 flase 로 설정함... 이렇게 되면, while()로 들어와도 할게 없음.. 즉 자원만 차지함.
		work1.flag = false;
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		work1.flag = true;
	}

}
