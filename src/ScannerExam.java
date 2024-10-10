/*
 * 콘솔에 출력이 아닌, 콘솔로부터 사용자의 값을 입력 받아서 프로그램에서 응용하는 방법을 알아볼게요.
 * Scanner 객체 : java.util package 에 존재하는 클래스로, 객체를 생성하면, 콘솔로부터 입력을 받을 수 있도록 해줍니다.
 * 이 객체는 new 라는 키워드로 생성하는데(나중에 클래스와 객체시간에 자세히 배움), 지금은 객체 생성과 사용법 정도만 간단히 알아두세요.
 */

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x 값 입력 : ");
		
		// 콘솔로부터 사용자의 입력을 get 하는 메서드 호출해서 enter 전까지의 값을 가져온다.
		// 리턴 타입은 String 타입니다. 수치형인 경우에도 String 타입으로 오기 때문에 필요시 parsing 을 해서 사용한다.
		String strX = scanner.nextLine();
		//System.out.println("입력한 값 : " + strX );
		int X = Integer.parseInt(strX);
		
		System.out.println("y 값 입력 : ");
		String strY = scanner.nextLine();
		int Y = Integer.parseInt(strY);
		
		// 두수의 결과 합을 출력해보세요.
		int result = X + Y;
		System.out.println(strX + "+" + strY + "=" + result);

	}

}
