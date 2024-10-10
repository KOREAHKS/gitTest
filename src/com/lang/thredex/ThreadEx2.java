package com.lang.thredex;

import javax.swing.JOptionPane;
class InputThread extends Thread{
	public InputThread() {
		super();
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		String str = JOptionPane.showInputDialog("뭐든 입력해");
		System.out.println("입력 값 : " + str);
	}
}

//Runnable 구현한 클래스 정의
class PrintAlpha implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "쓰래드 시작함");
		for(int i = 0; i<10; i++) {
			System.out.println((char)(i));
		}
	}
	
}

public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 값을 입력받기 1
		// 타이머 표시해서 콘솔에 뿌리기 2
		
		Thread thread = new InputThread();
		thread.start();
		
		//쓰래드를 생성하는 방법
		//1.Thread 클래스를 상속받으면 해당 클래스가 쓰래드가 됨
		//2.Runnable interface 를 구현한 객체를 Thread 의 생성자에 넘겨서 쓰래드를 생성하면 됨
		
		//문자를 출력하는 쓰래드 생성하기 및 실행하기
//		Thread alphaThread = new Thread(new PrintAlpha());
//		alphaThread.start();
		
		Thread alphaThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "쓰래드 시작함");
				for(int i = 0; i<10; i++) {
					System.out.println((char)(i));
				}
			}
		});
		alphaThread.start();
		
		
		Thread currThread = Thread.currentThread();
		System.out.println("현재 수행중인 쓰래드 : " + currThread.getName());
		for(int i = 0; i<10; i++) {
			
			System.out.println("타이머 값 : " + i);
		}
		
	}

}
