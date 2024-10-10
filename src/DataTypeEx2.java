/*
 * 지금 작성하는 이론은 꼭 기억해두면, 나중에 편합니다.
 * 
 * 자바에는 데이터타입이 존재 하는데, 큰 범위로는 P(Primitive type-원시자료형)과 R(Reference-참조형 즉 객체) 타입으로 구분되어입니다.
 * 앞으로 제가 자주 물을테니 기억해 두세요.
 * 
 * R type 을 배우기 전까지는 P type 에 대해서 배우게 될 예정입니다.
 * 
 * P type은 원시 자료형이라고 해서, 숫자,문자,boolean 을 크기별로 세분화 해서 메모리를 사용하도록 되어있습니다.
 * 이 타입을 정한 이유는, 자바스크립트는 모든 데이터를 64byte 로 사용하는데, 이렇게 사용하면, 메모리 누수가 많이 발생 할 수 있습니다.
 * 해서 값의 범위에 맞도록 메모리를 적절히 할당 하도록 하게끔 데이터 타입을 사용합니다.
 * 
 * P type은 좀 더 세분화 하면, 숫자는 정수와 실수로, 문자(문자열 아님)는 정수 타입으로, boolean은 1byte 의 boolean 으로만
 * 사용되도록 규정 되어있습니다.
 * 
 * 수치형(메모리 할당크기) : byte(1byte-정수연산할때 사용안함 , 주로 문자열처리등을 위해 사용됨) , short(2byte), int(4byte default), long(8byte) 이상 정수
 * float(4btye), double(8byte default) 이상 실수.
 * 
 * 실수는 정수를 표현할 수 있지만, 정수는 실수를 표현할 수 없음 / 때문에 메모리 크기와는 상관없이 실수가 정수보다 항상 큰 타입으로 생각하세요.
 */

public class DataTypeEx2 {

	public static void main(String[] args) {
		//실수 데이터 타입 : float , double(default)
		//double 은 float 보다 딱 2배 만큼 실수표현을 더 할 수 있음.
		//때문에 특수한 상황이 아니고서는 실수를 사용하고 이게 연산이 되어질 경우엔, double을 사용함.
		
		//float 은 값 초기화 시엔 반드시 값 끝에 f or F 로 표기해야만 합니다.(안그럼 에러임)
		float f = 1.1f;
		long lo;
		lo = (long)f;
		System.out.println(lo);
		
		f=0.1234567890123456789f;
		double d =0.1234567890123456789;
		
		System.out.println(f);
		System.out.println(d);
		
		float ft = 3.14F;
		double ft2 = ft + 1.0;
		
		System.out.println(ft);
		System.out.println(ft2);
	}
	
}
