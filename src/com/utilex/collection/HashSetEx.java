package com.utilex.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Student{ //학생 클래스 정의
	//각 학생의 고유한 객체이기 때문에, 객체가 공통으로 갖는 속성(값은 다 틀림)을 정의 합니다.
	public String name;
	public String hakbun;
	
	public Student(String name, String hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}
	
	//학번이 같으면 Set에 저장하지 않도록 정의 할 예정임.
	//이때 학번의 해쉬를 얻어서 확인 하도록 오버라이드 함.
	@Override
	public int hashCode() {
		return hakbun.hashCode();
	}
	
	//객체가 들어갈때 학번이 같은지를 검증해야 하니까, object 의 equals 를 오버라이드해서
	//해당 객체의 학번이 같으면 true 를 리턴하도록 할게요.
	
	@Override
		public boolean equals(Object obj) {
			//Student type 의 객체인지를 먼저 확인 해야함..
		if(obj instanceof Student st) {
			return st.hakbun.equals(this.hakbun);
		}else {
			return false;
		}
	}
	
}


public class HashSetEx {

	public static void main(String[] args) {
		
		//사용자 객체의 특정 필드값이 같은 경우엔, 중복 저장 않는 Set 생성
		Set<Student> studentSet = new HashSet<Student>();
		
		//학생 둘 생성 후 add
		Student st1 = new Student("주영", "1234");
		Student st2 = new Student("주영2", "1234");
		studentSet.add(st1);
		studentSet.add(st2);
		
		System.out.println("학생" + studentSet.size());
		
		
		
		
		
		
		// TODO Auto-generated method stub
		Set<String> set = new HashSet();

		//요소 추가의 대표적 메서드 add
		set.add("Java");
		set.add("JAVA");
		set.add("JSP");
		set.add("Spring");
		set.add("Java");
		
		System.out.println(set.size());
		
		//Iterator : 내부 순환자 객체.. 순서 없이 객체를 저장하는 컬렉션의 일종.
		//배열형식의 데이터 저장이 아니기 때문에, 끝을 알 수 없음..당연히 index 도 없음
		//요소가 존재 하는지 여부를 리턴하는 메서드와, 요소를 반환하는 메서드를 통해서
		//각 요소를 get 할 수 있음.
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String ele = iter.next();
			System.out.println(ele);
		}
		
		List<String> list = new ArrayList(set);
		System.out.println(list);
		
		
	}

}
