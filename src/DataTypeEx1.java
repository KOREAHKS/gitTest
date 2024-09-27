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

public class DataTypeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 같은 타입의 변수를 선언합니다.
		byte b, b1 ,b2; // 모두 main 내부의 지역번수로 byte 타입으로 선언함.절대 타입 변경 불가능합니다.
		b = 1;
		b1 = 100;
		b2 = -128;
		
		System.out.println("byte 의 Max 와 Min " + Byte.MAX_VALUE + " : " + Byte.MIN_VALUE);
		System.out.println("byte 의 Max 와 Min " + Short.MAX_VALUE + " : " + Short.MIN_VALUE);
		
		b = b2; //값 대임
		b1 = b;
		b= 1;
		
		short s1 = 1;
		
		s1 = b; //작은 타입을 큰 타입에 대입함 / 문제 없음
		//Promotion : 작은 타입을 큰 타입에 대입할때 나타나는 현상. 값이 복제가 되면서 타입이 변하게 됩니다.
		
		b = (byte)s1; //타입 캐스팅(하위 타입으로 타입 변형을 수행하라는 연산자) 을 통해 s1 의 값을 byte 타입의 메모리를 생성 후 값을 복제하고
		//복제된 값을 b에 대입을 해주게 됩니다.
		
		//캐스팅시 상위 비트가 절삭 됩니다. 부호비트부터 시작해서 모두 절삭됩니다.
		
		s1 = 10000;
		System.out.println(Integer.toBinaryString(s1));
		
		System.out.println("10011100010000".length());
		b = (byte)s1;
		System.out.println(b + " : " + Integer.toBinaryString(b));
		
		//캐스팅연산자 : (type)value , 우선순위는 2번째이고, 우측의 항 하나에만 영향을 미친다. 꼭 기억하기.
		
		//정수연산을 할 때는 기본적으로 int 를 사용하되,(int 범위내의 값이라면..) 범위가 큰 경우엔 Long 을 사용합니다.
		//그런데, int 가 default 라는데에는 또 하나의 의미가 있습니다.
		//int 이하의 정수를 연산(+,*,/ 등등..) 을 할때와, 리터럴 데이터(ex 10 , 1 , -100 등) 은 모두 int 로 메모리를
		//생성 후 연산한다는 것입니다.
		//위에서 int 이하의 모든 타입이라고 했으니, 이 범위에는 byte , short 도 포함되겠네요.
		//만약 int 보다 더 큰 타입과 연산이 되면, 무조건 큰 타입으로 먼저 메모리를 생성, 값 복사, 연산 후 리턴을 시킵니다.
		//즉 연산후의 리턴 타입은 항상 큰 타입이란 뜻입니다.
		
		byte b4 = 1;
		short s4 = 2;
		int res = b4 + s4;
		short s5 = (short)(b4 + s4);
		
		//변수로 정하지 않은 것은 모두 int(default)로 정의
		s5 = 1;
		int i = s5 + 1; 
		
		//Long 타입 : 무한대의 정수를 담는 타입 , 값과 상관없이 long 으로 선언하면 값의 끝에 소문자 또는 대문자로 L 표시를 해줘야 Long으로
		//인식합니다.
		
		long lo = 1L;
		
		long i2 = i + lo;
		
		//정수는 진법으로도 값을 표현할 수 있음 / 하지만 잘 쓰진 않음.
		//2진수는 0b or 0B 로 시작해서 값을 비트로 주고
		//8진수는 0로 시작해서 0 ~ 7 까지의 값으로 구성합니다.
		//16진수는 0x로 시작해서 0~9, A~F까지로 표현합니다.
		
		int bin = 0b1011;
		System.out.println(bin);
		
		int oct = 0234;
		System.out.println(oct);
		
		int hex = 0xA123;
		System.out.println(hex);
	}
	
}
