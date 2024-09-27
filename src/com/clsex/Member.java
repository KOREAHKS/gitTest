package com.clsex;

public class Member {
	private String name;
	private String id;
	private String passwd;
	private int age;
	
	public Member(String name, String id, String passwd, int age) {
		super();
		this.name = name;
		this.id = id;
		this.passwd = passwd;
		this.age = age;
	}
	
	public boolean login(String id, String passwd) {
		if(id.equals("hong") && passwd.equals("12345"))return true;
		return false;
	}
	public void logout() {
		System.out.println(this.id + "님이 나갔음");
	}
	
	
}
