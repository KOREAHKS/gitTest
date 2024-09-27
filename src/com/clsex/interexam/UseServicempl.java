package com.clsex.interexam;

import com.clsex.Servic;

public class UseServicempl {
	
	public static void main(String[] args) {
		Servic servic = new Servicempl();
		
		servic.defMethod();
		System.out.println();
		servic.defMethod2();
		System.out.println();
		
		//정적 메서드 호출
		Servic.staticMethod();
		System.out.println();
		Servic.staticMethod2();
		System.out.println();
	}
}
