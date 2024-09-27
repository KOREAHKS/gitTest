/*
 * package : 자바에서 연관성 있는 클래스와, 인터페이스를 관리하는 그룹의 개념
 * 이 패키지내에 클래스등을 정의하고, 필요시 외부에서 가져다 사용할 수 있도록 합니다.
 * package 선언문은 반드시 클래스의 첫 머리에 나와야 합니다.
 * package 명은 .을 기준으로 확장해서 선언할 수 있습니자. 
 */
package com.clsex;

public class Duck extends Animal{

/*
 *  클래스의 필드 : 일반적으로 객체의 속성을 나타내는 영역입니다. 이 필드의 값에 따라서 객체의 상태가 변경 될 수 있으며,
 *  (예를 들어, 파랑색 속성의 차에 빨강색을 주면 다른 컬러의 차가 되듯이) 특정 객체의 공통 속성을 추출해서 필드로 선언하는게 첫번째 설계라고 보면 됩니다.
 */
	
	//생성자 : 객체를 생성하는 코드. 형식은 클래스 이름에 ()를 넣고{생성자 초기 코드}를 정의 하는 형태이다.
	//생성자는 메서드와 틀린 역할을 하기 때문에, 반드시 클래스 이름과 같아야하며, 리턴 타입을 선언할 수 없다.
	
	//int count = 0; // 인스턴스 생성 갯수를 파악하는 목적의 필드 선언
	

	//개의 품종을 나타내는 속성을 선언 합니다.
	private String breed;
	
	//개의 이름을 나타내는 속성을 선언 합니다.
	private String name;
	private int age; //나이변수
	
	//객체지향의 캡슐화(Encapsulation) : 클래스 내부의 특정 속성은 외부 객체에 함부로 노출 되어선 안되는 경우가 있습니다.
	//캡슐화 하는 방법은 캡슐화의 대상이 되는 속성의 접근 제어를 private으로 선언합니다.
	//참고로 접근제어는 public > protected > default(아무것도 선언안하는것) > private
	
//	public Dog() {
//
//	}
	//생성자-메서드 오버로딩 : 같은 이름의 생성자 또는 메서드를 정의 할 때, 파라미터의 순서, 갯수, 타입을 틀리게 정의 하면
	//다른 메서드로 인식되게 하는 기법.. 이 기능이 있어야 전체적으로는 같은 기능을 수행하되, 세부적인 내용이 조금 틀린 경우 같은 이름으로 정의하고,
	//파라미터만 틀리게 받을 수 있게 하여, 정의 및 사용하는데 편리성을 더할 수 있다.
	//메서드,생성자에서 오버로딩을 결정짓는 요소인 파라미터의 갯수, 순서, 타입을 시그니쳐라고 한다. 
	//이 시그니쳐가 모두 똑같지 않다면 틀린 메서드로 인식한다.
//	public Duck(String breed) {
//		this.breed = breed;
//	}
	//생성자 오버로딩 ( 생성자 오버로딩은 메소드 오버로딩과 같다)
	public Duck(String name,String breed) {
		//생성자 this() : 기 정의된 생성자를 다른 생성자에서 호출하는 방법
		//반드시 생성자 첫 머리에서만 호출 가능함.
		//this.breed = breed;
		super("오리");
		this.breed = breed;
		this.name = name;
	}
	
	public Duck(String name, String breed, int age) {
		this(name,breed);
		this.age = age;
	}
	
	public void sound() {
		System.out.println("꽥꽥");
	}
	
	//알을 낳는 메서드 추가함
	public void layEggs() {
		System.out.println("오리가 알을 낳다.");
	}
	
	//getter 메서드..private 으로 캡슐화 되어진 필드의 값을 리턴하도록 하는 기능의 메서드.
	public String getBreed() {
		return breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
}
