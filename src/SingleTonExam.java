/*
 * SingleTon 패턴 : 자바에서는 무분별하게 객체를 생성하지 않기 위해 이 패턴을 적용해서 객체 생성을 제한 할 수 있음.
 * 이 패턴은, 외부에서 객체를 생성하지 못하게 하면서, 하나의 인스턴스만 자신이 생성 후,  필요한 외부 객체에 전달 할 수 있는 설계 패턴임
 * 
 * 이 패턴이 필요한 부분은 나중에 우베할때 보게 될거임.
 * 
 * 패턴을 생성하는 방식은 자신의 instance 를 static field 로 초기화 하고, 기본 생성자는 private 으로 막아버림
 * 이후, getter 을 통해서 원하는 객체가 있으면 인스턴스의 ref를 리턴하는 방식임
 */

class Singlton{
	//클래스가 로드됨과 동시에 자신의 인스턴스 생성 후 필드 초기화
	private static Singlton instance = new Singlton();
	
	//외부에서 인스턴스 생성 못하게 생성자 막음
	private Singlton() {
		
	}
	//외부에 단 하나의 인스턴스만 넘겨주도록 getter 정의
	public static Singlton getInsetance() {
		return instance;
	}
}
public class SingleTonExam {

	public static void main(String[] args) {
		Singlton instance1 = Singlton.getInsetance();
		Singlton instance2 = Singlton.getInsetance();
		
		//위 instance1과 2는 같은 객체일까 아닐까??
		
		if(instance1 == instance2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}

	}

}
