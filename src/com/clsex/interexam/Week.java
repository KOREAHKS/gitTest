package com.clsex.interexam;
/*
 *  Java 열거형 상수 : 상수는 보통 클래스나 인터페이스에 변수로 선언해서 사용하는 경우가 많은데
 *  이를 객체 타입으로 선언하게해서 보다 직관적으로 사용할 수 있도록 한게 enum이다.
 *  열거형상수는 내부적으로 각 값을 ref 타입으로 관리하여 사용되도록 되어 있다.
 */
public enum Week {
	
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY

}


// 오늘이 무슨 요일인지의 값을 비교 할때는 열거값으로 비교 가능합니다.
// ex>Week today = Week.SUNDAY;
// 또한 열거타입의 값은 모두 객체로 관리되기 때문에 null 대입도 가능함
// ex>Week myBirth = null;
// 이 열거상수의 값을 비교 할때는 객체이기 때문에 == or != 해야한다.
