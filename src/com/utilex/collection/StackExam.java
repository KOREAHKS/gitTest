package com.utilex.collection;

import java.util.Stack;


public class StackExam {

	
	
	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		
		st.push("처음들어간애");
		st.push("두번째들어간애");
		st.push("세번째들어간애");
		
		System.out.println(st);
		
		//System.out.println(st.get(0));
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}
