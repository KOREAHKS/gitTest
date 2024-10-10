package com.clsex;
/*
 * final 키워드 : final 키워드는  클래스, 메서드, 메서드 파라미터, 메서드 내부에 선언이 가능합니다.
 * 선언된 위치에 따라서, 클래스에 붙으면 상속 금지, 메서드에 붙으면 오버라이드 금지, 메서드 파라미터에 붙으면 값 변경 금지
 * 변수에 붙으면 값 변경 금지로 되어집니다.
 * final 은 주로 상수를 표현할 때 사용합니다. 상수는 값이 초기화 되어지고, 이 값이 변경되어지지 않아야 할 때 사용됩니다.
 * 자바에서는 이 상수를 공유(다른 클래스나 객체에서 참조하는것)할땐, 일반적으로 static 과 같이 선언합니다.
 * 그리고 이렇게 static final 로 선언된 변수는, 값이 무조건 초기화 되어야 하고, 절대 변경 금지가 되어집니다.
 * 이렇게 공유 목적의 필드는 소유권이 class 이므로, 접근도 클래스이름.필드명 으로 접근합니다.
 * static 은 메서드에도 붙을 수 있는데, 설계적으로는 만약 특정 메서드가 연산처리를 할 때 해당 클래스의 필드값이 필요치 않거나
 * 할때는 static 으로 선언해서, 이를 사용할때는 객체 생성없이 class.methodName()으로만 호출하도록 합니다.
 * 
 * 
 * 마지막으로, 자바에서는 이렇든 공유 목적의 필드는 변수명을 무조건 모두 대문자로 합니다. 필요시엔 _를 이용해서 단어를 연결하도록 합니다.
 */
class MyCls{
	final int a=100;
	//public static final double D_RATE = 0.05;
	public static final double D_RATE;
	
	//static 변수보다 먼저 호출되는 구문이 static 블락입니다.
	static {
		D_RATE = 0.05;
	}
	
	public final void doSome() {
		
	}
}
class URCls extends MyCls{

//	@Override //금지되어야 함
//	public void doSome() {
//		
//	}

	public void mymethod(final int a) { //메서드 내에서 값 변경 금지
		//a = a + 1;
		final int k = 10;
		//k = 20;
	}
}
public class FinalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
