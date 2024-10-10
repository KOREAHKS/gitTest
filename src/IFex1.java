
public class IFex1 {

	public static void main(String[] args) {
		
		//랜덤을 이용해서 81부터 100 사이의 값이 나오도록 만들어 보세요.
		int a = (int) (Math.random() * 20) + 81;
		
		System.out.println("점수 : " + a);

		//등급 변수 선언..
		String grade;
		
		//90점 이상은 A+
		if(a >= 90) {
			if(a >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}else {//90점 미만처리
			if(a >= 85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		System.out.println(grade);
	}

}
