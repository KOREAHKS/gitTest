package com.langex.lambda;
/*
 * 자바의 람다 : 자바에서 람다는 인터페이스의 일종으로 처리됩니다. 단 메서드가 하나만 있는 인터페이스여야만 람다식으로 컴파일 가능합니다.
 * 이 말은 람다(함수형인터페이스)로 컴파일 되기 위해선, 기본적으로 interface 를 정의하는것과 같단 말입니다.
 * 하지만 메서드는 반드시 추상 하나만 보유해야 합니다. 
 * 
 * 만약 람다인터페이스를 컴파일시에 명시적으로 컴파일 시키려면, @FunctionableInterface? 로 선언하면 도비니다.
 * 
 * 
 * 
 * 그럼 람다는 뭐냐?? 익명 객체입니다.
 * 
 * 자바에서는 원래 함수를 지원하지 않는 언어인데, 람다가 워낙 파급력이 쎄서 추가된 형태입니다.
 * 
 * 이 말은 람다는 함수(function)만 가지고 있는 객체라고 생각하면 됩니다.
 * 
 * 이를 (파라미터)->{구현부} 형태로 표현하는 형식이라고 생각하면 됩니다.
 * 
 * 예를 들면, interface A { void ab()} 가 정의 되어있다고 가정합니다.
 * 
 * 특정 클래스의 특정 메서드에서 ex>someMethod(A a){} 처럼 되어있을때, 우린 3가지 형태로 위 메서드를 호출할 수 있습니다.
 * 
 * 1.A 타입의 하위 클래스 객체를 생성해서 넣어주는 방식
 * 2.익명으로 new A(){}; 로 구현하는 방식
 * 3.()->{} 로 구현하는 방식
 * 
 * 이해를 쉽게 하려면, 위 메서드에는 반드시 A 타입의 객체만 들어와야 하고 그 객체가 들어오면, 그 객체에 속한 메서드를 오버라이드 할 것입니다.
 * 때문에 위 메서드에는 1,2 번은 우리가 알고 있던 문법이고, 3번은 해당 객체만 들어올 수 있다는걸 알기 때문에 ()->{} 식으로 구현체를넣는 형태로 생각하면 쉽습니다.
 * 
 * () --> 파라미터를 나타내고, 하나만 존재시엔 () 생략 가능함,, 이외엔 모두 넣어야함
 * -> 이건 람다식이라는 문법임
 * 
 * {구현부} --> 구현부의 내용이 하나인 경우엔 {} 생략 가능.. 만약 return 이 있는 경우엔 한줄로 끝나야함
 * 나머진 모두 {} 해줘야 함.
 * 
 * 람다의 주 목적은, 특정 데이터가 존재하면, 이 데이터를 수행 할 함수를 그때그때 넣어주는게 목적이라고 생각하세요.
 * 
 * 어떤 함수를 넣느냐에 따라서 데이터의 처리 결과는 달라질겁니다.
 * ex>method(a,b) --> 이 메서드에 함수가 + 인 경우와, - 인 경우를 각각 대입할때, 결과가 틀려지듯이...
 * 
 * 
 */
@FunctionalInterface
interface Calculable{ //인터페이스면서, 추상 메서드 딱 하나만 존재하므로 람다함수로 사용가능함
	void caluclate(int a, int b);
}

public class LambdaEx1 {

	static void doSome(Calculable calc) {
		int x = 1;
		int y = 2;
		
		calc.caluclate(x, y);
	}
	public static void main(String[] args) {
		
		doSome((m,x)->{
			int res = m + x;
			System.out.println("결과 : " + res);
		});
		
		doSome((y,z)->{
			int res = y -z;
			System.out.println("결과 : " + res);
		});
		
		// TODO Auto-generated method stub
//		Thread t = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		
//		Thread t2 = new Thread(()->{
//			for(int i = 0; i<100; i++) {
//				System.out.println(i);
//			}
//			
//		});
//		
//		t2.start();
	}

}
