package com.utilex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExam {

	public static void main(String[] args) {
		/*
		 *	정규화 표현식 : 특정 문자를 패턴화 시켜서, 비교할 값을 줘서, 해당 패턴과 일치 하는지의 여부를 확인하는 것을 정규화식 이라고 함
		 *	자바에서는 Pattern, Match 클래스를 이용해서 이 정규화식을 처리합니다.
		 *
		 *	패턴 문자의 의미(자쥬 사용하는것만 추림)
		 *
		 *	1.\\(역슬래시)를 이용해서 문자열로 패턴을 생성합니다.
		 *	2.패턴을 구성하는 패턴문자에 대해 알아볼게요.
		 *	3.보통 패턴의 첫머리와 끝에 자주 사용하는 패턴문자가 있는데,
		 *	 ^(패턴의 처음이 ...로 시작하니?? 라는 처음을 의미) 단, 괄호 내부에 사용되면 반전의 의미로 사용됨. ex>  ^[\\w] : 값이 문자로 시작하니?
		 * 	 $(패턴의 끝이 ...로 끝나니? 라는 끝을 의미) 보통은 괄호 밖에 반복 연산자와 같이 사용됨          ex> ^[\\w]$; : 처음과 끝이 문자열이니?
		 *
		 *	a. w : 문자만 허용한다는 의미(0~9,a~z,A~Z,한글) > ()는 그룹 표시임
		 *	b. W : 문자가 아닌것만 허용(공백,tab,space,new line,enter ...)
		 *	ex) !(0~9,a~z,A~Z,한글) 는 W와 같음. !는 반전이기때문에.
		 *	c. d : 숫자만 허용
		 *	d. D : 숫자가 아닌것만 허용 
		 *	e. s : 공백문자 검증( \t , \r , \n , space)
		 *	f. S : 공백이 아님을 검증
		 *
		 * "^www" , "com$"   >>>> www로 시작하고 com으로 끝나니?
		 *
		 *	4.반복수량 한정자
		 *	a. ? : 0 또는 1회 반복
		 *	b. * : 0회 이상 반복
		 *	c. + : 1회 이상 반복
		 *	d. {n} : 정확히 n 횟수만큼 반복
		 *  e. {n,} : 최소한 n 횟수만큼 반복
		 *  f. {n,m} : 최소 n번 최대 m번까지 반복
		 *
		 *	5.그룹문자
		 *	a. () : 그룹
		 *	b. [] : 문자셋, [] 내부의 어떤 문자(들)를 의미함
 		 *	c. [^] : 부정 문자셋.. 괄호내의 어떤 문자가 아닐때
		 *
		 *
		 *
		 *
		 */

		String exp = "(02)|(010)-\\d{3,4}-\\d{4}";
		String data = "02-123-4567";
		//Pattern 클래스의 비교 메서드를 이용해서 검증합니다.
		boolean res = Pattern.matches(exp, data);
		if(res) {
			System.out.println("정규식과 일치함");
		}else {
			System.out.println("정규식과 일치하지 않음");
		}
		
		
		String pw = "1234";
		String pw2= "A234";
		
		String pwPattern = "[\\d]*$";  //숫자로 시작하고 숫자로 끝나는 패턴
		
		System.out.println(Pattern.matches(pwPattern, pw));
		System.out.println(Pattern.matches(pwPattern, pw2));
		
		String pattern = Pattern.compile(pwPattern).pattern();  // 패턴의 방식을 리턴함
		System.out.println(pattern);
		
		Matcher matcher = Pattern.compile(pwPattern).matcher(pw);
		System.out.println(matcher.find());
		System.out.println(Pattern.compile(pwPattern).matcher(pw2).find());
		
		String strPattern= "^[\\W]*$";
		
		String str1 = "hello";
		String str2 = "hi123";
		String str3 = "안녕 자바...";
		String str4 = "탭존재하는문자\t";
		String str5 = "";
		
		System.out.println(Pattern.matches(strPattern, str1));
		System.out.println(Pattern.matches(strPattern, str2));
		System.out.println(Pattern.matches(strPattern, str3));
		System.out.println(Pattern.matches(strPattern, str4));
		System.out.println(Pattern.matches(strPattern, str5));
		
		//^[a-z|A-Z]*$ : 영대소문 구분 없이 시작하고 문자열로 된 패턴
		//^[ㄱ-ㅎ|가-힣]*$ : 한글만 허용하는 패턴
		
		String hanPattern = "^[ㄱ-ㅎ|가-힣|a-z]*$";
		String str6 = "이건한글과영문A";
		
		System.out.println(Pattern.matches(hanPattern, str6));
		
		//공백을 허용하면서, 숫자포함 모든 문자를 허용하는 패턴..
		// - 는 범위를 뜻함
		String allowSpacePattern = "^[0-9a-zA-Zㄱ-ㅎ가-힣 ]*$";
		System.out.println(Pattern.matches(hanPattern, "안녕하세요Jason님"));
		System.out.println(Pattern.matches(hanPattern, "안녕하세요Jason님^^"));
		System.out.println(Pattern.matches(hanPattern, "안녕하세요 Jason님"));
		
		//^[a-zA-Z0-9]+@[0-9a-zA-Z]+\\.[a-z]$  // 이메일 패턴
		//^[a-z]{1}[a-z0-9]{5,10}$;			   // 아이디 패턴(소문자 a-z 첫글자 , a-z0-9 사이의 5문자에서 10문자 = 총 6글자에서 11글자의 아이디 패턴)
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
