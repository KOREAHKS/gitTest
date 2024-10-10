package com.utilex;
/*
 *  Calendar 클래스 : Date 클래스를 대체한 API. 날짜와 시간 관련한 정보를 다양하게 표출 시키는 API임
 *  객체는 getInstance()를 통해서 얻어내고, 얻어낸 시점에 시스템의 시간정보를 가져와서 모든 필드값을 초기화 시킴
 *  이후 초기화된 필드의 정보는 get() 을 통해서 얻어내는데, 이때 파라미터로 사용되는 field는 반드시 Calendar.Field로 줘야함.
 *  또한, Calendar 는 Date와 호환 할 수 있는 메서드를 가지고 있기 때문에 적절히 Date 와 호환성을 유지 할 수 있음.
 *  
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		int mon = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY: strWeek = "월";break;
		case Calendar.TUESDAY: strWeek = "화";break;
		case Calendar.WEDNESDAY: strWeek = "수";break;
		case Calendar.THURSDAY: strWeek = "목";break;
		case Calendar.FRIDAY: strWeek = "금";break;
		case Calendar.SATURDAY: strWeek = "토";break;
		case Calendar.SUNDAY: strWeek = "일";break;
		default :
			strWeek = "무조건 쉬는날";
		}
		
		int apm = now.get(Calendar.AM_PM); // 0 or 1 리턴
		String strApm = null;
		if(apm == Calendar.AM){
			strApm = "오전";
		}else {
			strApm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + mon + "월 " + day + "일 " + strWeek + "요일");
		System.out.println(strApm + hour + "시");
		
		Calendar xMas = Calendar.getInstance();
		xMas.set(2024, 11, 25);
		
		int remain = xMas.get(Calendar.DAY_OF_YEAR) - now.get(Calendar.DAY_OF_YEAR);
		System.out.println("클스마스까지는 " + remain + "일 남음");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String format = sdf.format(now.getTime());
		System.out.println(format);
		
		for(String zoneId : TimeZone.getAvailableIDs()) {
			System.out.println(zoneId);
		}
		
		TimeZone kiev = TimeZone.getTimeZone("Europe/Kiev");
		now = Calendar.getInstance(kiev);
		
		System.out.println(now.get(Calendar.HOUR) + " : " + now.get(Calendar.AM_PM));
	}

}
