package com.langex.lambda;
/*
 * 파라미터가 존재하는 람다의 처리방식...
 * 1.메서드등의 타입은 대부분 무시해도 됨.. 이유는 컴파일시에 타입 검사를 하기 때문임
 * 2.하나인 경우엔 () 를 생략가능하나, 하나 이상 또는 무인자 인 경우엔 반드시 () 해야함.  
 * 
 */

interface DoSome2{
	void doSome2(String who,String duty);
}
interface DoSome3{
	void doSome3(String who);
}

class MyClass{
	public void action1(DoSome2 doSome2) {
		doSome2.doSome2("한경수","람다 강의를 함");
	}
	
	public void action2(DoSome3 doSome3) {
		doSome3.doSome3("한경수");
	}
}
public class LambdaEx4 {

	
	public static void main(String[] args) {
		
		MyClass kyeongsu = new MyClass();
		kyeongsu.action1((name, duty)->{   //파라미터가 하나 이상일 경우
			System.out.println(name + " 가 " + duty);
		});
		
		kyeongsu.action2(name->System.out.println(name + "이 열강하고 있습니다.")); // 파라미터가 하나일 경우
		
		
	}

}
