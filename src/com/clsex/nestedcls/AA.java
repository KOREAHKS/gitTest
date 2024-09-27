package com.clsex.nestedcls;
/*
 *   멤버중첩 클래스 예시
 */

public class AA {
	String name;
	int x;
	
	//중첩 클래스에 올 수 있는 접근 제어는 public default private 중 하나이다.
	class BB{
		
		int f1 = 1;
		
		//원래 정적 필드는 정적 inner에만 적용됐는데, 17부터는 허용됨.
		static int f2 = 2;
		
		BB(){
			
		}
		void methodBb() {
			System.out.println("Outer 의 멤버 사용하기 : " + x);
			System.out.println("BB 멤버 메서드 실행");
			name = "경수";
		}
		static void methodBst() {	
			//x += 100; // Outer 의 멤버는 inner 의 static 메서드에서는 접근 불가함. 때문에 에러임
			System.out.println("BB 의 static 메서드 실행");
		}
	}//End of BB
	
	//Outer 의 멤버 메서드를 정의해서 같은 멤버인 BB 를 사용하는 코드 작성함
	void useBB() {
		BB bb = new BB();
		System.out.println(bb.f1);
		bb.methodBb();
		
		System.out.println(BB.f2);
		BB.methodBst();
	}
	
//	
//	BB theBBMem = new BB();
//	
//	AA(){
//		BB b = new BB();
//		cc = new CC();
//	}
//	
//	void methodAA() {
//		BB bb = new BB();
//		CC cc = new CC();
//	}
}
