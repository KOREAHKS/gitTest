package com.langex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UseAnnotataion {

	@PrintAnnotataion
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotataion("*") //String value 의 기본값을 * 로 변경함.
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotataion(value = "#", number = 20)
	public void method3() {
		System.out.println("실행 내용3");
	}
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//어노테이션이 선언된 메서드를 읽고, 거기에 선언된 어노테이션 객체를 얻어낸 후
		//어노테이션 정보를 확인하는 printLine() 을 호출하도록 정의합니다.
		
		Method[] methods = UseAnnotataion.class.getMethods();
		for(Method method : methods) {
			
			PrintAnnotataion printAnnotataion =  method.getAnnotation(PrintAnnotataion.class);
			
			//설정 정보를 이용해서 출력해보기
			printLine(printAnnotataion);
			
			//Method 클래스에는 메서드를 이용해서 동적으로 메서드 호출해보기
			method.invoke(new UseAnnotataion(),null);
			
			printLine(printAnnotataion);
		}
	}
	//어노테이션의 속성 정보를 확인하는 메서드 정의
	static void printLine(PrintAnnotataion printAnnotataion) {
		if(printAnnotataion != null) {
			int number = printAnnotataion.number();
			
			for(int i = 0; i<number; i++) {
				String value = printAnnotataion.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
