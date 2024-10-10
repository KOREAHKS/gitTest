package com.langex;

public class MathExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//수학 관련 API... 대부분이 static 메서드로 정의됨
		double d1 = Math.ceil(5.3);
		double d2 = Math.floor(5.3);
		
		System.out.println(d1 + " : " + d2);
		
		double d3 = 12.5456;
		//소수 이하 2자리 얻기
		double temp = d3 * 100;
		
		System.out.println(Math.round(temp));
		
		double t2 = temp / 100.0;
		System.out.println(Math.round(t2));
		
	}

}
