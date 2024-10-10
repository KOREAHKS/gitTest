package com.clsex;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dog dog1 = new Dog(); // 기본 객체를 생성
		Dog dog = new Dog("쿠키", "진돗개");
		Cat cat = new Cat("공주", "페르시안");
		Duck duck = new Duck("덕자", "청동오리");
		
		
		System.out.println(dog.getBreed());
		System.out.println(dog.getName());
		System.out.println(dog.toString());
		
		dog.sound();
		cat.sound();
		duck.sound();
		
		System.out.println(dog);
		
		Animal ani = dog;
		Animal ani2 = cat;
		Animal ani3 = duck;
		
		ani.sound();
		
		
		//다형성 : 슈퍼타입의 ref 변수로 상속된 자식 인스턴스의 오버라이드된 메서드를 super 타입으로 호출하여
		//오버라이드된 내용을 수행하도록 하는 기법
		Animal[] animals = {dog,cat,duck};
		for(int i = 0; i<animals.length; i++) {
			Animal thePet = animals[(int)(Math.random() * animals.length)];
			thePet.sound();
			//instanceof 연산자 : 좌측의 인스턴스가 우측의 클래스타입인지를검증해서 맞으면 true/flase 를 리턴하는 연산자
			if(thePet instanceof Duck) {
			((Duck)thePet).layEggs(); // 연산자 중에서 .이 최고이므로 (Duck)와 thePet를 한 번에 묶는다
			}
		}
		
		
		//Animal a = new Animal("동물");  //Abstract 객체임 / 즉 현실화 되어질 수 없는 형태의 클래스를 말함
		//System.out.println(a);
		//여기서 Animal은 현실에 존재하지 않는 추상적인 형태의 객체임.. 즉 객체지향에서는 이 객체가 실제
		//생성되어서는 의마가 없는 객체임. 하지만 추상화 클래스가 되기 전까진 객체를 생성하는데엔 문제 없음(기억하기)
		
		
		/*
		 * dog.name = "쿠키"; 
		 * dog.breed = "진돗개";
		 */
		
		//System.out.println(dog.name);
		//System.out.println(dog.breed);
		//System.out.println(dog.age);
		
		//System.out.println(dog2.name);
	}

}
