package com.lang.thredex;
/*
 *   Thread : 
 *   sleep : 지정한 시간만큼 일시정지
 *   yield : 우선순위가 동일한 다른 쓰래드에게 실행을 양보하고 대기 (호출한놈이 runnable 상태로 빠짐)
 *   join : join 을 호출한 애는 running 상태에서 일시정지상태로 빠졌다가 호출한 놈의 running 중인 쓰래드가 다 끝나면 그 뒤에 실행
 *   wait : 일시정지상태에 머물랐다가 호출이 되면 run 함 (object class의 메서드) 동기화 블락내에서만 사용 가능
 *   wait를 꺼낼때 인터럽 해야함
 *   
 */
public class ThreadEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
