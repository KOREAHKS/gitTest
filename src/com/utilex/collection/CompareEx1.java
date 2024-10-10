package com.utilex.collection;

import java.util.TreeSet;

/*
 * Compare 인터페이스 : 자바에서 정렬의 대상이 되려면 무조건 이 인터페이스를 구현해야 함
 * String, Integer 등의 이 하위 타입이라 정렬이 간으했음.
 * 우리가 만든 클래스가 정렬의 기준이 되려면, 먼저 이 인터페이스를 구현하고,
 * compare() 를 오버라이드 해줘야 함.
 * 이때 정렬의 대상이 되는 필드의 값을 비교해서 리턴해주면 됨.
 * 리턴은 -1 , 0 , 1 임. 
 */

class Person implements Comparable<Person>{
	public String name;
	public int score;
	
	public Person(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Person person) {
		if(this.score < person.score)return -1;
		else if(this.score == person.score) return 0;
		else return 1;
	}
}
public class CompareEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> ts = new TreeSet<Person>();
		
		ts.add(new Person("ABC",93));
		ts.add(new Person("DEF",33));
		ts.add(new Person("GHI",55));
		ts.add(new Person("JKL",89));
		
		for(Person p : ts) {
			System.out.println(p.name + " : " + p.score);
		}
	}

}
