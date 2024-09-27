import java.util.Scanner;

public class UseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사칙 계산기를 만들어 봅니다.
		//클래스 이름은 Calc 이고, 프로그램이 시작되면, --- 계산기 시작---
		/*
		 * 출력 후, 값1, 2, 연산자를 입력 받도록 하세요.
		 * 연산자를 검증해서 사칙연산자 중 하나라면, 결과를 출력 하도록 하고,
		 * 그렇지 않다면, 올바른 연산자가 아니라고 출력시키세요.
		 * 
		 *  목적에 따라서 메서드를 최소 2개 이상 정의 하도록 하세요.
		 *  
		 *  출력 메서드 1개 , 입력 메서드 1개 , 사칙계산 메서드 1개 , 계산결과 메서드 1개
		 */
			
		
		System.out.println("------계산기 시작------");
		
		getInput();
	}
	static void getInput() {
		int fir, sec;  // 변수 선언
		String op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫수 입력 : ");
		fir = Integer.parseInt(sc.nextLine());
		System.out.println("두번째수 입력 : ");
		sec = Integer.parseInt(sc.nextLine());
		
		System.out.println("연산자 입력 : ");
		op = sc.nextLine();
		
		boolean ok = checkOp(op);
		if(!ok) {
			System.exit(0);
		}
		calc(fir,sec,op);
		// 계산을 해주면 됩니다. 계산을 하는 메서드를 정의해서 호출 후 결과를 출력해보도록 하세요.
	}
	static boolean checkOp(String input) {
		switch (input) {
			case "+","*","/","-" -> {return true;}
			default -> {
				System.out.println("올바르지 않음");
			}	
		}
		return false;
	}
	public static void calc(int fir, int sec,String op) {
		if(op.equals("+")) {
			System.out.println( fir + op + sec + " = " + (fir + sec));
		}else if(op.equals("-")) {
			System.out.println( fir + op + sec + " = " + (fir - sec));
		}else if(op.equals("/")) {
			System.out.println( fir + op + sec + " = " + (fir / (double)sec));
		}else if(op.equals("*")) {
			System.out.println( fir + op + sec + " = " + (fir * sec));
		}
	}
}