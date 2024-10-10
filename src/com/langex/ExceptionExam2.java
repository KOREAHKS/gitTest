package com.langex;
/*
 *  Java Exception : 예외는 실행중에 발생하는 예상치 못한 에러를 통틀어 말합니다.
 *  여기서 중요한건, 예외는 실행중에 발생된다는 점입니다. 이 말은 곧, 컴파일러는 예외가 발생할지의 여부를 알지 못한다는 것임.
 *  그럼, 실행중에 발생한다는건, 예외또한 실행이후에 발생되는 에러를 객체화 했다는 말임.
 *  즉, 뭔가 실행중에 예외가 발생하면, JVM은 그 예외가 발생한 코드에서 실행을 멈추고, 발생된 예외의 내용을 담은 객체를 생성해서
 *  프로그램 밖으로 던져버리는(throw) 과정이 발생함.
 *  그래서 예외는 던져진다(throw)라고 함.
 *  
 *  예외 객체를 던진단느 말은 예외 또한 객체란 말이고, 이 말은 예외도 클래스로 정의가 되었다는 말임.
 *  
 *  이렇게 예외가 발생되어 throw 되면, 프로그램이 적절한 핸들링을 요구하는데, 이러한것을 예외 핸들링 이라고 함.
 *  
 *  만약 핸들링을 하지 않으면, 예외가 프로그램 밖으로 던져지기 때문에 그 시점에 JAVA 는 모든 실행을 멈추고 종료되어버림.
 *  
 *  따라서 프로그래머는 예외가 발생할 지점에 적절히 예외를 핸들링(catch)하고, 프로그램이 비정상적으로 종료되지 않도록 해야함.
 *  
 *  예외 핸들링 코드 문법 : try{예외가 발생할 코드 기술}catch(예외객체 e){예외발생시 예외를 핸들링하는 코드}finally{예외 발생여부와
 *  상관없이 무조건 실행되는 블락}
 *  
 *  위에서, try 없는 catch 는 사용될 수 없고, if 절처럼 필요에 따라서 예외를 중첩시킬 수 있음
 *  즉 try 내부에 try가 올 수 있고, catch 내부에 다시 try 가 올수도 있음. 물론 finally 내부에도 try가 올 수 있음.
 *  
 *  예외는 실행중에 발생되지만, API 특징상 예외가 발생될 수 있는 코드가 내포되어 있음을 선언된 API가 많음
 *  
 *  이때, 이를 사용하게 되면, 경우에 따라서 컴파일러가 예외 핸들링을 검증 하게 됨. 이를 일반 예외(Exception)이라고 하고,
 *  실행중에만 발생되는 예외, 즉 컴파일러가 상관안하는 예외를 RuntimeExceprion 이라고 함.
 */

public class ExceptionExam2 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println(a + b);
		try {
			System.out.println(a / b); //예외 발생함
		}catch(Exception ar) { 			//예외가 발생하면 같은 타입이거나 큰 타입으로 잡아냅니다.
			System.out.println("너 바보임?? 0을 못나눔");
			ar.printStackTrace(); //예외가 발생된 콜스택을 콘솔에 출력하는 메서드
			System.out.println(ar.getMessage());//예외의 내용을 문자열로 리턴하는 메서드 호출
		}
		System.out.println("예외 발생 이후의 코드");
		
		ArithmeticException aa = null;
	}
	
}
