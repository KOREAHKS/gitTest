package com.clsex.nestedcls;
/*
 *  로컬클래스(지역 중첩)은 클래스의 정의부가 Outer 클래스의 생성자 또는 메서드 내부에 정의되고,
 *  사용 또한(객체화) 내부에서만 이뤄지고 사용되는 특징을 가지고 있다.
 *  이러한 특징 때문에, 지역(local) 클래스라 호칭한다.
 *  
 *  로컬 클래스또한, 내부에는 생성자, 필드, 메서드도 정의될 수 있고, static 은 자바 17부터 
 *  정의 가능하다.
 *  
 *  중요!!!!! 지역 클래스가 정의된 생성자 또는 메서드에서 사용되는 변수는 기본적으로 
 *  final 로 선언되어진다. (17버전 이전에는 명시적으로 선언해야 하지만 ,이후부터는 컴파일시에 자동으로 붙여짐)
 *  때문에 지역 변수를 함부로 변경하면 컴파일 에러를 유발한다.
 */
public class EE {
	
	void useFF(int k) {
		//FF 클래스 정의. 메서드 내부에 정의 되어지기 때문에 지역 중첩이다.
		
		int x = 100;
		
		class FF{
			
			int ffField1 = 1;
			
			static int ffField2 = 100;
			
			//생성자
			FF(){
				System.out.println("지역 FF 클래스 생성자 실행됨");
			}
			void method1() {
				//x = x + 200;
				//k = k + 100;
				System.out.println(x);
				System.out.println(k);
				System.out.println("지역 FF 클래스 메서드1 실행됨");
			}
			static void method2() {
				System.out.println("지역 FF 클래스 static 메서드2 실행됨");
			}
		}//End of FF
		FF f = new FF();
		System.out.println(f.ffField1);
		System.out.println(FF.ffField2);
		
		f.method1();
	}
	void useKK() {
		FF f = null;
	}

}
