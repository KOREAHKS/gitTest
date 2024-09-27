package com.clsex.sub;

public class Info {
	
	private String Email; // 이메일
	private String Pass;  // 패스워드
	
	public Info(String email, String pass) {
		Email = email;
		Pass = pass;
	}
	
	public void Info(String email, String pass) {
		this.Email = email;
		this.Pass = pass;
		System.out.println("현재 이메일은 " + email + "입니다.");
	}

	
}
