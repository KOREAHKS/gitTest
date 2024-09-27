import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		//배열은 대표적 Ref 타입입낟.
		//메서드는 없고, 속성으로 길이를 나타내는 length 하나만 가지고 있습니다.
		
		//아래는 객체가 언제 생성 되는지를 확인하는 코드입니다.
		//int[] inArr = null;
		//System.out.println(inArr.length); //null 배열의 길이를 호출함.
		//null 속성과 메서드가 없기 때문에 없는 것을 호출하기에 실행 시 에러가 뜸
		
		//배열의 생성식을 알아봅니다. 모두 다 기억하세요.
		//1.new 를 이용해서 생성하기.. 이때는 반드시 배열의 길이를 줘야함..
		//배열은 객체이고, 객체는 속성과 메서드를 가짐
		// 이중 배열은 속성만 갖는데, 자바에서는 기본 객체를 생성하면, 그 속성(필드)의 값이 타입의 기본값으로 자동 초기화됨
		// 아래 배열은 int 타입으로 배열을 생성하고, 길이만 주어졌기 때문에, 값은 자동으로 0으로 초기화 됨
		int[] inArr1 = new int[3];
		//생성된 배열의 hash code 확인
		System.out.println(inArr1);
		
		//2.{}를 이용해서 값으로 초기화 된 배열을 생성한다.
		int[] inArr2 = {1,2,3};
		System.out.println(inArr2);
		
		//3.위 두개의 생성식을 하나로 합친문법
		int inArr3[] = new int[] {10,20,30};
		System.out.println(inArr3);
		
	
		inArr1 = new int[] {5,5,5};
		//자바에서, =,!= 연산자는 p 타입과, r타입 모두에서 사용됨
		//p에서는 값이 같은지를 물어보고, r에서는 ref가 같은지 즉, hash code 가 같은지를 물어본다.
		//만약 같다면, true가 리턴되고, 이를 우리는 같은 객체라고 칭한다.
		//객체가 같다는 말은, 그 내부의 속성(field)의 값도 당연히 같다라고 생각하면 된디ㅏ.
		//inArr1 = inArr2;
		
		
		if(inArr1 == inArr2) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("틀린 객체입니다.");
		}
		inArr1 = new int[3];
		
		
		//배열의 값을 문자열로 출력만 하고 싶을때는 배열을 사용할떄 유요한 메서드로 구성된 java.util 의 Arrays 클래스의 메서드를 이용한다.
		System.out.println(Arrays.toString(inArr1));
		System.out.println(Arrays.toString(inArr3));
		
		for(int i = 0; i<inArr2.length; i++) {
			System.out.println(inArr2[i]);
		}
		
		//자바스크립트의 for of 와 같은 for in
		//inArr3 의 모든 index 를 자동으로 접근해서, 각 index 의 값을 릴턴하고, 그 값을 x에 담도록 하는 for 구문
		for(int x : inArr3) {
			System.out.println(x);
		}
		
		
	}

}
