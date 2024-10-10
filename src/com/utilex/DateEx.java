package com.utilex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateEx {

    public static void main(String[] args) {
        // 현재 날짜와 시간
        Calendar now = Calendar.getInstance();
        System.out.println(now.getTime());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String formDate = sdf.format(now.getTime()); // Date 객체를 전달
        System.out.println(formDate);
        	//특정 포맷형식으로 날짜, 데이터를 지정하는 Format 인터페이스의 하위 타입을 이용해서 날짜 출력을 포맷 해 봅시다
      		//대표적으로 사용되는 날짜 포맷터는 SimpleDateFormat 클래스 입니다.
        
        // 사용 가능한 타임존 출력
        for (String zoneId : TimeZone.getAvailableIDs()) {
            System.out.println(zoneId);
        }
        
        TimeZone kiev = TimeZone.getTimeZone("Europe/Kiev");
        now = Calendar.getInstance(kiev); // 키예프 시간대의 Calendar 인스턴스 생성
        System.out.println("Kiev Time: " + sdf.format(now.getTime())); // 키예프 시간 출력
    }
}