/*
 *  Java Method : 클래스 or 인터페이스(나중에 배움) 등에서 특정 기능을 수행하도록 정의한 함수의 일종.
 *  
 *  메서드는 객체지향에서 기능을 수행 하도록 정의 하는데, 필요에 따라서 메서드를 외부에 감추거나, 노출 시킬수도 있다.(접근제어)
 *  메서드는 반드시 클래스 내부나 인터페이스 내부에 정의 되어야 하는데, 메서드내부에 메서드를 정의 할 수는 없다.
 *  
 *  메서드의 형식은 다음과 같음 
 *  [] 표식자는 optional 임
 *  [public] [static] return type or void methodName([Parameter type 변수명]....){
 *   // 메서드 정의 역
 *   만약 메서드가 리턴 타입을 선언 했다면 반드시 메서드 바디가 종료되기전까지 값을 리턴 해줘야 한다.
 *   만약 코드 중간에 값을 리턴하게 되면, 해당 메서드는 그 시점에 수행이 종료된다.
 *   
 *   만약 void로 선언을 한 경우엔, 리턴을 할 필요가 없고, 로직의 필요에 따라서 return 키워드를 이용해서 명시적으로 메서드를 종료 시킬 수 있다.
 *   
 *   메서드는 설계 목적에 따라서 정의 하고, 이를 적절히 사용하는데 그 목적이 있다.
 *   
 *   주의!! static 이라는 개념을 배우기 전까지는, static 으로 선언된 코드에서 호출 할 수 있는건 무조건 static 밖에 없음을 꼭 기억하세요.
 *  }
 */
public class MethodEx {
	public static void main(String[] args) {
		doSome();
		
		if(checkOp("+")) {
		}
	
	}
	static void doSome() { // 리턴이 없는 doSome 정의함
		System.out.println("이건 doSome 내용");
		int x = doSome2();
		return;
	}
	public static int doSome2() {
		byte b= 1;
		return b;
	}
	public static boolean checkOp(String op) { // 이 메서드는 사칙연산자인지를 검증하도록 하는 메서드 입니다.
		boolean res = false;
		switch (op) {
		case "+":
			res = true;
			break;
		default:
			break;
		}
		return res;
	}
}






