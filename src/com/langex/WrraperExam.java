package com.langex;


/*
 *	 Wrapper 클래스 : 모든 p type Data 를 클래스로 정의한 클래스
 *	p 타입 데이터가 객체화 되거나, 또는 반대로 되어야 할 경우,
 *	p 타입에 대한 자세한 정보 등을 이용할때 사용되는 클래스임.
 *	대부분은 static 메서드로 필요한 데이터를 get/set 할 수 있도록 정의됨
 *	AutoBoxing : p 타입의 데이터가 컴파일시에 자동으로 객체화 되어지는 원리
 *	AutoUnboxing : 위와 반대의 경우
 */

public class WrraperExam {

	public static void main(String[] args) {
		int a = 1;
		Integer ig = a;//AutoBoxing Integer.valueOf(a) 자동 호출
		int b = ig; // AutoUnBoxing
		
		String str = "a" + ig;
		str = ig.toString();
		
		double d = 1.1;
		a = Integer.parseInt(str);
		System.out.println(a);
		
		str = "abde12";
		System.out.println(Integer.parseInt(str));
	}
}
