package com.langex;

public class StringBuilderEx {

	public static void main(String[] args) {
		String data = new StringBuilder()
				//메서드 체이닝... 메서드의 리턴이 뭔지 알고 있는 경우, 메서드만 연속으로 호출해서 코딩하는 기법
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
	}
}
