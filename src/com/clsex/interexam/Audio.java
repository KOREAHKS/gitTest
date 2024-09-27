package com.clsex.interexam;

public class Audio implements RemoteControl {

	private int volume;
	private int currentVolume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오가 켜집니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("오디오 꺼짐.");
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
