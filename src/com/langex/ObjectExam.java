package com.langex;
/*
 *  javva.lang 의 Object 클래스.
 *  이 클래스는 묵시적으로 모든 클래스의 부모로 존재함.
 *  이 말은 모든 클래스타입은 이 타입으로 형변형이 가능하다는 말임.
 *  Object 클래스에는 하위 클래스들이 기본적으로 오버라이드 한 몇개의 메서드와, 나중에 배울 쓰래드를 제어할 때 사용되는 메서드를 보유하고 있음
 *  이중 필수 메서드 몇개를 보고, 나중에 쓰래드시 해당 메서드 확인합니다.
 *  
 *  toString() : 이 메서드는 모든 자식 클래스가 자신의 목적에 맞게(일반적으로는 객체의 상태를 문자열로 리턴하도록) 재정의 한 대표적 메서드임
 *  Object 에서는 객체의 hash 를 문자열로 리턴하도록 정의됨
 *  
 *  equals(Object obj) : 같은 객체인지를 비교하는 대표적 메서드임.. String 등의 클래스에서는 이 메서드를 자신에 맞게 오버라이딩함
 *  
 */
public class ObjectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		Object obj2 = new Object();
		
		if(obj.equals(obj2)) {
			System.out.println("같은 객체");
			System.out.println(obj);
		}else{
			System.out.println("틀린 객체");
			System.out.println(obj);
			System.out.println(obj2);
		}
	}

}
