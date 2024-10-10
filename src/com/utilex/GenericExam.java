package com.utilex;
/*
 * Generic : 특정 클래스나 인터페이스의 내부 필드의 타입을 객체 생성시에 맵핑을 해주는 개념
 * 이 제네릭은 반드시 객체타입(클래스,인터페이스)에만 적용이 되며, 일반 p type 은 적용이 되지 않음.
 * 
 * 일반적으로 타입 매핑을 시킬 때 <T> 처럼, <> 와 내부에 타입 지정을 의미하는 키워드를 넣는데, 
 * 이 키워드는 영문자 모두를 사용가능하지만, Type 이라는 구분을 짓기 위해 T를 기본 사용함.
 * 
 */

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Set;

//여러분이 물건(객체)을 저장하도록 박스를 사용한다고 생각 해보세요.
//이 박스 내부에는 다양한 타입의 객체가 들어갈겁니다. (인형, 라이터, 담배, 테블릿 등)
//박스내부에서 만약 객체를 꺼내올때, 타입이 다 틀리기 때문에 이를 처리하기 위해서는 모든 타입의 Super인 Object 로 타입 선언 및 캐스팅을 해줘야 할겁니다. 많이 불편함
//이를 자동으로 해소시키는것이 제네릭 입니다.
class Box<T>{
	private T item;
	
	//제네릭 메서드 : 타입 파라미터를 가지고 있는 메서드를 말함.
	//타입 파라미터가 메서드 선언부 즉. 리턴타입 앞에 <Type> 로 선언을 함.
	//파라미터에도 T 가 사용됨.
	//이 타입의 결정은 컴파일시에 파라미터를 보고 결정이됨.
	
	public void setItem(T item) {
		this.item = item;
	}
	public T getT() {
		return item;
	}
}

/* 제네릭 타입 : 결정되니 않은 타입을 파라미터로 가지는 클래스와 인터페이스를 말합니다.
 * 선언 문법은 <A,B,....매핑될 객체의 클래스 타입>과 같음.
 * 
 * 제네릭처럼 아무 문자를 써도 상관없지만, 일반적으로는 한 문자의 대문자를 사용함.
 * 만약 타입 지정을 하지 않으면 즉 <> 를 사용하지 않으면, 내부적으로 Object 타입으로 선언이 되어짐. 
 *
 */
class Product<K,M>{
	private K kind;
	private M model;
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}

class TV{
	
}
class Car{
	void run() {
		System.out.println("자동차가 달림");
	}
}

interface Retable<P>{
	P rent();
}
class Home{
	void turnOnLight() {
		System.out.println("불을 켬");
	}
}
class Sub_Marketer implements Retable<Home>{

	@Override
	public Home rent() {
		return new Home();
	}
}

class CarAgency implements Retable<Car>{

	@Override
	public Car rent() {
		return new Car();
	}
	
}


public class GenericExam {
	
	//main() 에서 타입으로 지정된 파라미터의 타입을 리턴하는 제네릭 메서드 정의
	private static <T> Box<T> boxing(T t){
		Box<T> box = new Box();
		box.setItem(t);
		return box;
	}
	
	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();  // <> 타입 작성 안해도 됨
		//box1.item = "hello java";
		//String str = box1.item;
		//System.out.println(str);
		
		//Box<DateEx> box2 = new Box();
		//box2.item = new DateEx();
		//DateEx de = box2.item;
		
		Box<Integer> intBox = boxing(100);  // 100dl Integer 객체로 변환되기에 가능
		System.out.println(intBox.getT());
		
		Box<String> strBox = boxing("애슐리는 일년에 한 번만");
		System.out.println(strBox.getT());
		
		
		
		Product<TV,String> p1 = new Product();
		p1.setKind(new TV());
		p1.setModel("삼성 85인치 스마트 TV");
		
		TV theTv = p1.getKind();
		
		Product<Car,String> p2 = new Product();
		p2.setKind(new Car());
		Car theCar = p2.getKind();
		
		Sub_Marketer subscribe = new Sub_Marketer();
		Home rentHome = subscribe.rent();
		rentHome.turnOnLight();
		
		CarAgency theAgency = new CarAgency();
		Car rentCar = theAgency.rent();
		rentCar.run();
	}

}
