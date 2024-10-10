package com.clsex;

/*
 * private method exam 
 */
public interface Servic {
	
	default void defMethod() {
		System.out.println("def메서드 코드1");
		defaultCommon();
	}
	default void defMethod2() {
		System.out.println("def메서드 코드2");
		defaultCommon();
	}
	
	//private 메서드 정의
	private void defaultCommon() {
		System.out.println("def메서드 중복 코드 A");
		System.out.println("def메서드 중복 코드 B");
	}
	
	//static 메서드 정의
	static void staticMethod() {
		System.out.println("static메서드 코드1");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("static메서드 코드2");
		staticCommon();
	}
	
	//private 정적 메서드
	private static void staticCommon() {
		System.out.println("static메서드 중복 코드 C");
		System.out.println("static메서드 중복 코드 D");
	}
	
}
