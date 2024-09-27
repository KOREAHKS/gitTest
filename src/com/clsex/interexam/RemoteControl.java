package com.clsex.interexam;

public interface RemoteControl {

	
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//위 두개의 기기에 대해 기본적으로 상속받을 기능인 음소거 기능을 추가합니다.
	//이때, 음소거는 버튼 하나만 누르면 바로 mute 가 되기때문에, 이 기능을 인터페이스에서 정의 한 후에 기본적으로
	//구현객체(인터페이스를 상속한 객체를 뜻함)가 기능의 내용까지를 모두 상속 받도록 할 예정입니다.
	//이러한 목적으로 사용되는 인터페이스 메서드를 default 메서드 라고 합니다.
	//default 메서드는 접근제어가 public or default 만 가능하고, 
	//반드시 리턴타입 앞에 default 선언을 해줘야 합니다.
	//이 default 메서드는 메서드의 정의부를 가질 수 있고, 필요하다면 인터페이스 내의 상수 필드와, 추상 메서드를 호출할 수도 있습니다. <<<<주 목적
	
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 처리 해제함");
		}
	}
	
	
	//정적 메서드... 이 메서드는 상속을 위한다기 보다는 인터페이스에서 필요한 기능을 정의하여, 필요시에 참조해서 가져다 쓸 수 있도록 하는데
	//목적이 있습니다. 정적 메서드이기 때문에 메서드의 구현부를 가질 수 있고, 이를 호출할때는 구현체가 필요 없이 인터페이스 명으로만 접근 가능함
	//접근 제어는 public or private 만 가능함 .. public 을 생략하면 자동으로 컴파일시에 public 이 추가됨
	
	static void changeBattery() {
		System.out.println("밧데리를 교체 합니다.");
	}
}
