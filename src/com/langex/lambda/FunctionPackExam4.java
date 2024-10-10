package com.langex.lambda;

import java.util.function.Predicate;

/*
 *  Predicate : 존재 하는지의 여부를 boolean 으로 리턴하는 함수
 *  내부적으로는 test() 라는 메서드를 가지고 있고, 파라미터는 각 함수마다 틀림.
 */

public class FunctionPackExam4 {

	static MyStudent[] List = {
			new MyStudent("재현", "풀스택과정쌤", 80, 90),
			new MyStudent("지윤", "풀스택과정학생1", 150, 200),
			new MyStudent("찬우", "풀스택과정학생1", 160, 210),
			new MyStudent("경수", "풀스택과정학생1", 170, 220),
	};
	
	static double avgEng(Predicate<MyStudent> predicate) {
		int cnt = 0;
		int sum = 0;
		
		for(MyStudent ms : List) {
			//test 를 이용해서 equals 를 비교..
			if(predicate.test(ms)) {
				cnt++;
				sum += ms.getJava();
			}
		}

		return (double)sum/cnt;
		
	}
	public static void main(String[] args) {
		double avg = avgEng(ms -> ms.getSubject().equals("풀스택과정학생1"));
		System.out.println("학생들의 Java 평균 : " + avg);

	}
}