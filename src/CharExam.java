/*
 * 자바의 문자 데이터(char) : 자바에서는 문자를 유니코드를 기반으로 하는 2바이트 체계를 사용합니다.
 * 유니코드가 2 바이트임
 * 이때, 문자와 그 코드값은 양수로만 구성이 되어 있기 때문에, 음수가 없는 양수 2바이트 입니다.
 * 문자는 문자 하나만을 뜻하며, 하나 이상이 존재할시엔, 문자열로 취급됩니다.(참고로 문자열은 R type임)
 * 
 * 때문에 char 은 내부적으로 2byte 의 정수체계를 사용합니다.(음수 없는..)
 * 
 * 대략 0 ~ 65,500 까지의 정수를 표현할 수 있습니다.
 * 
 * 문자 표식자로는 '' 를 사용하고, 만약 디폴트값으로 값을 초기화 하려고 할땐, 반드시 공백등의 문자를 주고 초기화 해야 합니다.
 * empty value 로는 초기화 안됩니다.
 * 
 * char은 int와 호환 가능
 */
public class CharExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch1 = '한';
		System.out.println((int)ch1);
		int a = 54620;
		System.out.println((char)a);

		char ch2 = '\u0000';
		System.out.println(ch2);
		
		String s = ""; // 문자열을 empty 로 초기화함
		char ch3 = 0;
		
		//booleean 타입 : 값으로는 오직 true / false 만 가질 수 있으며, 논리 연산에 사용됨.
		boolean isDone = false;
		isDone = true;
	
		//출력문 알아보기..
		
		//출력하고 개행하는 출력문
		System.out.println("GG");
		System.out.println("KK");
		
		//  \ 를 이용해서 escape 할 수 있음 ... ex> t --> tab , " , n 등...
		System.out.println("\t\"하하하\"");
		
		//printf("패턴문자열",값1,값2...) : 지정된 패턴대로 뒤의 값들을 출력하도록 하는 형태임
		/*
		 * 패턴의 지정 문자들 : %는 패턴의 시작 문자임.. 이 다음에 타입을 기술해서 패턴 문자열을 생성함
		 * 
		 *  1. 정수 d(digit) : 정수를 포맷하도록 하고, 사용예는 아래와 같음
		 *  %d : 123 으로 출력, %6d : 6자리 정수, 값이 6자리가 안되면 공백으로 채움 
		 *  %-6d : 위와같으나 오른쪽 빈자리를 공백으로 채움..
		 *  %06d : 왼쪽 빈자리를 0으로 채움..
		 *  
		 *  2. 실수 f : 실수의 패턴을 만들때 사용함
		 *  %10.2f : 정수 7자리, 소수점 + 소수 2자리, 왼쪽 공백... ex>______123.45
		 *  %010.2f : 정수 7 + 소수점 + 소수 2자리, 공백 0 으로 채움...
		 *  
		 */
		
		int value = 123;
		System.out.println("상품의 가격은 " + value);
		System.out.printf("상품의 가격은:%06d\n", value);
		
		double area = Math.PI *10 * 10; //반지름이 10인 원의 너비..
		System.out.printf("반지름이 %d인 원의 너비:%10.2f\n",10,area);
		
		String name = "한경수";
		String addr = "경기 의정부시";
		System.out.printf("%6d | %-10s | %10s\n",1,name,addr);
	}

}
