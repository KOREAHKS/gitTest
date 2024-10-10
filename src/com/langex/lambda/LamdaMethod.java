package com.langex.lambda;
/*
 *  람다식 메서드 참조
 *  
 *  람다에서는 특정 클래스(static), 인스턴스 메서드를 참조하여 호출할 수 있음.
 *  문법은 CLASS::METHOD명 --> 주의!! 메서드명만 호출함.. static 의 경우
 *  instance변수::METHOD명
 *  
 *  위와 같은 식으로 호출 가능함..
 */

@FunctionalInterface
interface Proc{
	double process(double x, double y);
}

interface Laminter{
	void doSome();
}

class UseLamInter{
	public int k = 0; // 인스턴스 변수 선언
	
	void methodA() {
		final int k = 100; //지역 변수 선언
		
		Laminter lam = ()->{
			//람다로 오버라이드
			System.out.println("멤버필드 호출(this) --> " + this.k);
			System.out.println("클래스를 포함한 this --> " + UseLamInter.this.k);
		
			System.out.println("지역 변수 : " + k);
		};
		lam.doSome();
	}
}

class UseProc{
	public void doSome(Proc proc) {
		double res = proc.process(10, 10);
		System.out.println("결과 : " + res);
	}
}
class ComputeSome{
	public static double staticMethod(double x, double y) {
		return x + y;
	}
	public double instanceMethod(double x, double y) {
		return x * y;
	}
}

public class LamdaMethod {
	
	public static void main(String[] args) {
		//람다에서 사용되는 this 의 예시 호출
		UseLamInter checkThis = new UseLamInter();
		checkThis.methodA();

		UseProc up = new UseProc();
		up.doSome((x,y)->ComputeSome.staticMethod(x, y));
		up.doSome(ComputeSome::staticMethod); //위와 똑같음.

		ComputeSome com = new ComputeSome();
		
		up.doSome(com::instanceMethod);
	}
}
