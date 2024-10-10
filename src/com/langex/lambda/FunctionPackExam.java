package com.langex.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 *  자바에서 람다식으로 정의된 함수형 인터페이스가 모여있는곳이 java.util.function 패키지임
 *  앞으로 사용될 람다 적용 API 들은 내부적으로 이 패키지의 함수들을 사용함.
 *  따라서 이 함수패키지의 기본 내뇽을 반드시 알아야 응용을 할 수 있음.
 *  
 *  아래의 함수형인터페이스(앞으론 함수로 칭함)은 가급적 기억해 놓길바람.
 *  
 *  Consumer : 파라미터가 있고, 리턴이 없는 경우 
 *  Supplier : 파라미터가 있고, 리턴이 있는 경우
 *  Function : 파라미터가 있고, 리턴이 있는 경우
 *  Operator : 파라미터가 있고, 리턴이 있는 연산결과를 리턴하는 함수
 *  Predicate : 파라미터가 있고, 리턴이 boolean 형태
 */
public class FunctionPackExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> c = myT -> System.out.println("주어진 값은 " + myT);  // myT 는 변수명으로 아무렇게나 짓기 가능
		c.accept(100); // myT의 값 지정
		
	
		BiConsumer<String, String> bi = (firName, lastName) -> {
			System.out.println(firName + lastName);
		};
		bi.accept("한", "경수");
		
		DoubleConsumer dc = (PI) -> System.out.println("값은" + PI);
		dc.accept(0.1);
		
		//Supplier : 파라미터가 있고, 리턴이 있는 메서드를 가지고 있음..
		//리턴은 대부분 getter 로 구성되어 있음.
		
		Supplier<String> sl = () -> {return "한경수";};
		System.out.println(sl.get());
		
		sl = () -> "내일은 쉬는날";
		System.out.println(sl.get());
		
		IntSupplier is = () -> {
			int random = (int)(Math.random() * 10) + 1;
			return random;
		};
		System.out.println(is.getAsInt());
		
		//Function 인터페이스 : 파라미터와 리턴이 모두 존재하는 추상 메서드인 apply() 를 보유한 인터페이스들
		//사용하는 방식으로는 주어지는 타입을 매핑해서 리턴해주는 역할을 함.
		Function<String, Integer> fc = (number)->{
			return Integer.parseInt(number);
		};
		int res = fc.apply("10");
		System.out.println(res);
	}

}
