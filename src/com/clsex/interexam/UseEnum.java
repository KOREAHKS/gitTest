package com.clsex.interexam;

import java.time.DayOfWeek;
import java.util.Calendar;

public class UseEnum {

	public static void main(String[] args) {
		//날짜 객체를 이용해서 오늘의 요일을 추출한 뒤 열거상수와 비교해보는 로직을 작성해 봅니다.
		//참고로, 자바스크립트와 같은 Date도 있고, 좀 더 많은 기능의 Calendar 객체도 있습니다.
		//Calendar 을 이용해서 사용해 볼게요.. Calendar 은 나중에 배움
		
		//오늘 요일을 초기화 합니다.
		Week today = null;
		
		DayOfWeek dayOfWeek = null;

		//시간 객체인 Calendar 객체 생성..
		Calendar cal = Calendar.getInstance();
		
		//오늘의 요일 get
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//리턴 된 요일 숫자를 열거상수와 비교해서 값 SET
		switch(week) {
		case 1: today = Week.SUNDAY;break;
		case 2: today = Week.MONDAY;break;
		case 3: today = Week.TUESDAY;break;
		case 4: today = Week.WEDNESDAY;break;
		case 5: today = Week.THURSDAY;break;
		case 6: today = Week.FRIDAY;break;
		case 7: today = Week.SATURDAY;break;
	}
	if(today == Week.SUNDAY || today == Week.SATURDAY) {
		System.out.println("주말엔 역시 집콕이 최고임");
	}else {
		System.out.println("평일이니 공부에 집중!!");
	}
		
	}

}
