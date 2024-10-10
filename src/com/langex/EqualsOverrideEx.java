package com.langex;
/*
 *  Object 클래스의 equals 를 오버라이드 하는 경우 : 특정 클래스를 정의후에, 이 클래스가 같은 객체인지가 중요한게 아니라
 *  이 클래스의 특정 필드값이 같은지 까지를 검증해야 할때 equals 를 오버라이드 한다.
 *  이 예시는 위와같은 목적으로 사용될때를 감안한 내용임
 */
class Member{
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//이 클래스 객체의 id 값이 같은지를 비교해서, true/false 를 리턴하도록 equals 오버라이드.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			if(id.equals(target.id)) {
				return true;
			}
		}	
		return false;
	}
}
public class EqualsOverrideEx {
	
	public static void main(String[] args) {
		Member mem1 = new Member("Jason");
		Member mem2 = new Member("Jason2");
		Member mem3 = new Member("Jason");
		String str = new String("Jason");
		
		if(mem1.equals(mem3)) {
			System.out.println("두 객체는 필드의 값이 같음"); //이걸 동등객체 라고 함
		}else {
			System.out.println("두 객체는 필드의 값이 틀림");
		}
		
		if(mem1.equals(str)) {
			System.out.println("두 객체는 필드의 값이 같음"); //이걸 동등객체 라고 함
		}else {
			System.out.println("두 객체는 필드의 값이 틀림");
		}
		
		//Member 클래스는 User 클래스 임..
		//다른객체인건 알겠는데, 만약 필드의 값이 같다면, 같은 true를 리턴하게끔 하고 싶음
	}
}
