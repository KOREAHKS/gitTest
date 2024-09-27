package com.clsex.interexam;

public class UseRemocon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스가 자신의 인스턴스를 생성못하는지를 확인해볼게요.
//		RemoteControl remocon = null;
//		remocon = new Television();
//		remocon.turnOn();
//		
//		Television tv = new Television();
//		tv.turnOn();
//		
//		RemoteControl audio = new Audio();
//		audio.turnOn();
//		
//		remocon = new Audio();
//		
//		System.out.println("리모컨의 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
//		System.out.println("리모컨의 최소 볼륨 : " + RemoteControl.MIN_VOLUME);
//		
//		tv.turnOff();
//		tv.turnOn();
//		tv.setVolume(7);
//		audio.turnOff();
//		audio.turnOn();
//		tv.setMute(true);
//		tv.setMute(false);
//		
//		RemoteControl.changeBattery();
		
		//다중 인터페이스 상속 시 사용예시..
		RemoteControl tv = new Television();
		RemoteControl audio = new Audio();
		RemoteControl smartTv = new SmartTV();
		
		tv.turnOn();
		audio.turnOn();
		smartTv.turnOn();
		
		((WebSurfingable)smartTv).surfing("다음");
		
		
	}

}
