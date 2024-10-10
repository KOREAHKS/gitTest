package com.langex.lambda;


@FunctionalInterface
interface DoSomething{
	void doSome(); // 얘를 상속하는넘은 알아서 할 일을 오버라이드 하라는 의미..
}

class Person{
	public void action(DoSomething doSomething) {
		doSomething.doSome();
	}
}
public class LambdaEx2 {

	public static void main(String[] args) {
		Person student = new Person();
		Person salaryMan = new Person();
		
		student.action(()->{
			System.out.println("학생의 본분은 노는겁니다.");
			System.out.println("그리고 가끔은 공부도 합니다.");
		});
		
		salaryMan.action(()->{
			System.out.println("출근완.. 담배 ㄱㄱ");
		});
	}

}
