package com.clsex;
/*
 * 자바접근제어 키워드 : public > protected > default > private
 * 
 *  자바에서는 위 키워드를 클래스, 필드, 생성자, 메서드에 적용해서 클래스 외부에서 접근여부를 결정짓게 할 수 있다.
 *  
 *  가장 큰 범위인 public은 패키지(나중에 배움)의 위치에 상관없이 접근 가능하고, private 은 클래스 내부에서만 가능하다
 *  
 *   protected 는 같은 패키지(폴더)에서는 모두 접근 가능하나, 외부 패키지에서는 오직 상속받은 자식 클래스만 접근이 가능하도록 제어한다.
 *   즉, 이말은 다른 패키지의 자식 클래스가 상속을 받았을경우, super로 생성자나 메서드를 접근하도록 하는데 주 목적이 있다.
 *   
 *   default 는 아무것도 선언하지 않은 상태인데, 이 경우엔 같은 패키지(폴더)에서만 접근 가능하며, 다른 패키지에서는 접근 불가능하다.
 *   
 */
public class AccessModi { // 클래스 필드 메서드 생성자 다 붙을 수 있음

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HisClass his = new HisClass();

	}

}
