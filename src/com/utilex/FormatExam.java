package com.utilex;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *	형식클래스 : 문자열, 숫자, 날짜 등을 특정 포맷으로 설정해서 출력 또는 사용하고자 할 때 사용되는 클래스 집단
 *	최상위 클래스 : Formatter 라는 애고, 자식으로 각각의 대상에 따라서 Message, Number, Date 로 상속이 이뤄짐
 *	우리가 사용하는 클래스는 위 중간 클래스의 최종 자식 클래스나 인터페이스를 사용합니다.
 */
public class FormatExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double number = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(number));
		
		df = new DecimalFormat("#,###.0");   //0이 한개일 경우 소수점 한자리까지 반올림되어 나옴(0이 2개면 소수점 2자리수)
		System.out.println(df.format(number));
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM월dd일 a HH시mm분");
		System.out.println(sdf.format(now));
		
		
	}

}
