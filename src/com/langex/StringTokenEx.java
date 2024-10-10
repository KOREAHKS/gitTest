package com.langex;

import java.util.StringTokenizer;

/*
 * 
 *  StringTokenizer : 문자열내의 특정 구분자(Delimiter) 로 문자열을 구분해서 리턴해주는 객체 
 */
public class StringTokenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "그렇게/많이/졸림??";
		
		StringTokenizer st = new StringTokenizer(str, "/",true);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			String tk = st.nextToken();
			System.out.println(tk);
		}
		
		String data1 = "주영&우석,아영";
		String[] spl =  data1.split("&|,");
		
		for(String st1 : spl) {
			System.out.println(st1);
		}
	}
	
}	
