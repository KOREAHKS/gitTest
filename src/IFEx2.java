
public class IFEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  아스키코드 범위 만큼의 랜덤 숫자를 생성해서 문자(char)로 변환해 출력하세요. 
		 */
		char a = (char)(Math.random()*128);
		System.out.println(a);
		System.out.println((char)a);
		
		/*
		 * char letter = (char)(Math.random() * 128); System.out.println(letter);
		 */
		
		//결과는 숫자 이전의 특문 발생함 : 문자값
		//대문자 발생함 : 문자값
		//대문자와 소문자 사이의 특문 발생함 : 문자값
		if(a < '0') {
			System.out.println("숫자 이전의 특문 : " + a);
		}else {
			if(a >= '0' && a <= '9') {
				System.out.println("숫자 : " + a);
			}else {
				if(a <= 'Z') {
					System.out.println("대문자 : " + a + (int)a);
				}else if(a >= 'a' && a < 'z') {
					System.out.println("영소문자 찾음 : " + a + (int)a);
				}
			}
		}
		
		a = 'A';
		//Wwrapper 클래스를 이용해서 위의 로직을 간편하게 정리 해봅니다.
		boolean isDigit = Character.isDigit(a);
		
		System.out.println(isDigit);
		
		if(Character.isDigit(a)) {
			System.out.println("숫자발생");
		}else if(Character.isUpperCase(a)) {
			System.out.println("대문자 발생");
		}

		if(a < '0') {
			//숫자이전의 특문 찾음
			System.out.println("숫자 이전의 특문 " + a);
		}else if(a >= '0' && a <= '9') {
			// 숫자만 찾음
			System.out.println("숫자 " + a);
		}else if(a >= 33 && a <= 64) {
			// 숫자이후의 특문
			System.out.println("숫자이후의 특문 " + a);
		}else if(a >= 'A' && a <= 'Z') {
			// 대문자 
			System.out.println("대문자 " + a);
		}else if(a >= '[' && a <= '`') {
			//대문자 이후의 특문
			System.out.println("대문자 이후의 특문 " + a);
		}else if(a >= 'a' && a <= 'z') {
			//소문자
			System.out.println("소문자 " + a);
		}else if(a >= '{' && a <= '~') {
			//소문자 이후의 특문
			System.out.println("소문자 이후의 특문 " + a);
		}
	}
}
