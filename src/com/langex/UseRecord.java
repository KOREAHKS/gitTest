package com.langex;

public record UseRecord() {
	public static void main(String[] args) {
		//DTO 개념의 Record 사용예시.
		Member2 member = new Member2("Jason", "재현", 31);
		System.out.println(member.id());
		System.out.println(member.name());
		System.out.println(member.age());
		System.out.println(member.toString());
	}
	
}
