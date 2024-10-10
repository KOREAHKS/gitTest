package com.clsex.interexam;

/*
 *  클래스가 인터페이스를 상속 받을때, 클래스명 다음에 implements interA,B,C....로 선언하면 됩니다.
 *  클래스는 필요하다면 위처럼 하나 이상의 인터페이스를 , 를 기준으로 다중 상속을 받을 수 있음. 
 */
public class Television implements RemoteControl{ //구현객체

	private int volume;
	
	private int currentVolume; // mute 를 실행시에 현재 볼륨의 값을 저장하는 필드
	
	@Override
	public void turnOn() {
		System.out.println("TV 를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		//리모컨의 필드값을 기준으로 그 값 사이의 볼륨으로 조정되게 로직 추가
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨은 : " + volume);	
	}
	//상속받은 default 메서드를 오버라이드 하려면 반드시 public 접근 제어를 줘야 한다면, default 키워드는 생략 되어야 한다.
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.currentVolume = this.volume;
			System.out.println("무음 처리");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 처리 해제함");
			setVolume(this.currentVolume);
			System.out.println("무음 처리 해제함.. 현재 볼륨은 " + this.currentVolume);
		}
	}
	
	
}
