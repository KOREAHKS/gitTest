
public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'c';
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원임");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원임");
			break;
		default:
			System.out.println("Guest임");
			break;
		}
		
		
		switch(grade) { //람다방식
			case 'A','a' -> //한줄일 경우 { 제거 가능
				System.out.println("우수 회원임");
			case 'B','b' ->
				System.out.println("일반 회원임");
			default ->
				System.out.println("손님임");
		}
	}

}
