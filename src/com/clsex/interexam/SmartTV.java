package com.clsex.interexam;

public class SmartTV implements MagicRemoteController {

	@Override
	public void surfing(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + " 이동합니다.");

	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트티비 켬");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트티비 끔");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println(volume + "만큼 음량 조절됨");
	}

}
