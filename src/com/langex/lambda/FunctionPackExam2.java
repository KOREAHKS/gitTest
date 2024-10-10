package com.langex.lambda;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class MyStudent{
	private String name;
	private String subject;
	private int java;
	private int jsp;

}
public class FunctionPackExam2 {

	static MyStudent[] List = {
			new MyStudent("재현", "풀스택과정쌤", 80, 90),
			new MyStudent("지윤", "풀스택과정학생1", 150, 200),
	};
	//각 학생의 속성 또는 속성의 값을 연산한 결과를 정의 하도록 mapper 함수를 이용하는 메서드 정의
	static void printAvg(ToDoubleFunction<MyStudent> doubleFunction) {
		double res = 0;
		for(MyStudent st : List) {
			res = doubleFunction.applyAsDouble(st);
		}
		System.out.println(res / List.length);
	}
	static void printString(Function<MyStudent, String> function) {
		for(MyStudent st : List) {
			System.out.println(function.apply(st) + " ");
		}
		System.out.println();
	}
	static void printInt(Function<MyStudent, Integer> function) {
		for(MyStudent st : List) {
			System.out.println(function.apply(st) + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		//과목의 점수를 출력하는 메서드 호출
		System.out.println("자바 점수");
		printInt(t -> t.getJava());
		
		System.out.println("자바 점수의 평균");
		printAvg(value -> value.getJava());
		
		System.out.println("jsp 점수의 편균");
		printAvg(value -> value.getJsp());
		
		//학생 이름을 리턴하도록 정의된 메서드 호출
		//매퍼를 통해 학생 객체를 String 으로 매핑 시키는 메서드를 통해 출력함
		System.out.println("학생들 이름");
		printString(t -> t.getName());
	}

}
