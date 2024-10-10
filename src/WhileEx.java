import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = null; //null로 스캐너 초기화,, 객체 초기화,, 나중에 필요시 객체 생성함
		
		Scanner sc = new Scanner(System.in);
		boolean run = true; //while 의 flag 초기화
		int speed = 0;
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.증속 | 2.감속 | 3.중지");
			System.out.println("------------------------------");
			System.out.println("선택 : ");
			
			String strNum = sc.nextLine();
			
			// if(strNum == "1") // 자바에서는 == 를 같은 객체인지를 물어보는 코드임 , 값은 따지지 않음
			// 문자열내의 값이 무엇인지를 판별하는 메서드
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 : " + speed );
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 : " + speed );
			}else if(strNum.equals("3")) {
				run = false;
			}
		}
		
		do {
			
		} while (run);
		//System.out.println("프로그램을 종료합니다.");
		//명시적으로 자바의 프로그램을 강제 종료 하는 API
		System.exit(0); // 이 코드를 호출하면 자바 Process 가 종료됨.
	}

}
