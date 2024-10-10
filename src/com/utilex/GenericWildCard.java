package com.utilex;
/*
 * 제네릭 와일드 카드 (?) : 이 표식자는 특정 타입의 앞에 붙게 되는데, 이역시 특정 타입으로만 지정할 수 있도록 고안되었음.
 * ex> someMethod(<? extends Person> p1,...);   -----> 이 뜻은 이 파라미터의 값으로는 반드시 Person 의 하위 타입객체만 
 * 올 수 있다는 의미로 컴파일시 타입 체크가 됨.
 */

class Person{
	
}
class Manager extends Person{
	
}
class Student extends Person{
	
}
class HighStudent extends Student{
	
}
class MiddleStudent extends Student{
	
}

class RegApp<T>{
	public T kind;
	
	public RegApp(T kind) {
		this.kind = kind;
	}
}

//학교에서 특정 강좌를 등록하는 강좌코스 클래스 정의
class RegCourse{
	
	//강좌 등록 메서드 정의
	public static void regCourse1(RegApp<?> regApp) {
		System.out.println(regApp.kind.getClass().getSimpleName() + " 이 코스1 등록함");
	}
	
	//학생만 등록 가능한 코스 등록 메서드 정의
	public static void regCourse2(RegApp<? extends Student> regApp) {
		System.out.println(regApp.kind.getClass().getSimpleName() + "이 코스2 등록함");
	}
	
	//Staff 만 등록 가능한 코스 정의
	public static void regCourse3(RegApp<? extends Manager> regApp) {
		System.out.println(regApp.kind.getClass().getSimpleName() + "이 코스3 등록함");
	}
}

public class GenericWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegCourse.regCourse1(new RegApp<Person>(new Person()));
		RegCourse.regCourse1(new RegApp<Manager>(new Manager()));
		
		RegCourse.regCourse2(new RegApp<Student>(new HighStudent()));
		
		
	}

}
