package com.lang.thredex;

class WorkingObj{
	public synchronized void methodA() {
		//이 동기화메서드는 동기화블라과 같음
		//따라서, wait, notify() 등은 이 내부에서 호출 해야함
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " 메서드 A  작업 실행중");
		notify(); //wait() 전이된 쓰래드를 Runnable 상태로 전환토록 호출함
		
		try {
			wait(); //자신은 wating 영역으로 전이함.
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB(){
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " 메서드 B  작업 실행중");
		notify(); //wait() 전이된 쓰래드를 Runnable 상태로 전환토록 호출함
		
		try {
			wait(); //자신은 wating 영역으로 전이함.
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
class ThreadA extends Thread{
	
	private WorkingObj workingObj;
	
	public ThreadA(WorkingObj workingobj) {
		setName("ThreadA");
		this.workingObj = workingobj;
	}
	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			workingObj.methodA();
		}
	}
}
class ThreadB extends Thread{
	private WorkingObj workingObj;
	
	public ThreadB(WorkingObj workingObj) {
		setName("ThreadB");
		this.workingObj = workingObj;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			workingObj.methodB();
		}
	}
}
public class WaitNotify_ThreadEx {
	
	public static void main(String[] args) {
		WorkingObj shareObj = new WorkingObj();
		
		Thread threadA = new ThreadA(shareObj);
		Thread threadB = new ThreadB(shareObj);
		
		threadA.start();
		threadB.start();
	}
}
