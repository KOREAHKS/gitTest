package com.langex.lambda;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

/*
 * Operator 함수 : 파라미터와 리턴이 모두 존재하는 메서드를 보유한 함수
 * 얘를 사용하는 경우는 대부분 파라미터로 주어지는 애를 연산한 결과를 리턴하는데 사용됨
 */

public class FunctionPackExam3 {

	static MyStudent[] List = {
			new MyStudent("재현", "풀스택과정쌤", 80, 90),
			new MyStudent("지윤", "풀스택과정학생1", 150, 200),
			new MyStudent("찬우", "풀스택과정학생1", 160, 210),
			new MyStudent("경수", "풀스택과정학생1", 170, 220),
	};
	
	//주어진 수를 연산한 결과 리턴
	static int maxOrMinMath(IntBinaryOperator op) {
		int res = List[0].getJava();
		for(MyStudent ms : List) {
			res = op.applyAsInt(res, ms.getJava());
			System.out.println("람다 내에서 연산 결과 : " + res);
		}
		return res;
	}
	
	//주어지는 두개의 double 을 비교연산해서 double 을 리턴하는 람다 이용
	static double manOrMinAvg(DoubleBinaryOperator op) {
		double res = (List[0].getJava() + List[0].getJsp()) / 2.0;
		
		for(MyStudent ms : List) {
			res = op.applyAsDouble(res, ((ms.getJava() + ms.getJsp()) / 2.0));
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println("최고 자바 점수 확인");
		int max = maxOrMinMath((x, y) -> {
			if(x>=y) return x;
			else return y;
		});
		System.out.println("최대값 " + max);
		
		System.out.println("---->" + maxOrMinMath((x,y) -> (x >= y ? x:y)));

	}

}
