package com.utilex;
/*
 * 제한된 타입 파라미터 : 제한된이란 특정 타입의 Super or 하위 타입으로 파라미터를 제한 시키는 제네릭임.
 * 이렇게 하는 이유는 API 에 이렇게 선언된게 꽤 많음. 개념만 잘 이해하면 됨.
 * 
 * ex> class SomeCls<T extends SomeCls or SomeInterface>  
 *	위 예시를 풀이하자면 SomeCls의 자식타입이거나 SomeInterface 타입만 들어올 수 있음을 의미한다. 
 *
 */

public class GenericExam2{

	
	//타입 제한을 건 메서드 정의 
	public static <T extends Number> boolean compare(T t1, T t2) {
		//타입 출력
		System.out.println("비교 : " + t1.getClass().getSimpleName() + "," + t2.getClass().getSimpleName());
		
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		
		return (d1 == d2);
	}
	public static void main(String[] args) {
	
		boolean res = compare(100, 101);
		System.out.println(res);
		
		System.out.println(compare(1.0, 10));
		//System.out.println(compare("10", "10"));
	}

}
