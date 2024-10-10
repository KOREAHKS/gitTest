package com.lang.thredex;

import java.util.Scanner;

public class ThreadEx1 {

	static String input;
	private static void waitInput() {
		System.out.println("값 입력 해");
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		waitInput();
		System.out.println("입력된 값 : " + input);
		System.out.println("main 종료됨");

		throw new Exception("예외 던짐");
	}

}
