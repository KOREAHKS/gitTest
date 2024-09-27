
public class HelloWorld2 {

//이건 라인 주석입니다.
/*
 * 이건 블락 주석입니다. 
 */
// 자바 Application 은 클래스 기반의 언어 입니다. 때문에 대부분이 클래스로 정의 되어야 하고, 유지 되어야 합니다.
// 나중에 배울 인터페이스등은 틀린 형태이긴 하지만, 기본적으로 클래스기반 언어라고 생각하세요.
	
//클래스를 정의 후에 App 이 실행이 되려면 entry point가 있어야 되는데, 즉 시작점이 있어야 되는데, 그걸 main 메서드 라고 합니다.
// 즉 약 만개의 클래스를 정의해서 하나의 App 을 만들었어도, 시작메서드(main) 이 없으면 실행이 안된다는 뜻입니다.
// 이 메인 메서드는 모든 클래스에서 딱 하나만 존재해야하고, 이 메서드를 보유한 클래스를 메인 클래스라 합니다.
// 여튼, 여러분이 java 클래스명 을 CDM 창에서 실행하면, JVM은 제일먼저 main() 을 자동으로 호출하고, 이때부터 자바가 실행된다라는 뜻입니다.

	public static void main(String[] args) {
		System.out.println("안녕하세요");
	}
}
