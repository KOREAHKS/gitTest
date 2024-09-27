/*
 * 프로그램이 시작되면 두개의 수를 입력 받아서 큰수부터 나열하세요.
 * 결과는 변수가 fir,sec,third 가 있다면, 출력 결과 역시 fir >= sec >= third 로 나오도록 합니다.
 * ex> 수1 입력 : 10, 수2 입력 : 3
 * 결과 : 10 >= 3
 *
 */
public class Quiz1 {
	
	public static void main(String[] args) {
		int a = (int) (Math.random() * 10 + 1);  // 0.0부터 1.0까지의 랜덤수가 배정되고, 그 랜덤수의 +1을 적용 / 소수점으로 되기 때문에 int 캐스팅을 적용.
		int b = (int) (Math.random() * 10 + 1);
		int c = (int) (Math.random() * 10 + 1);
		
		int temp; // 이건 빈컵이라고 생각
		
		if(b >= a && b >= c) {
			//b가 제일 클 경우
			temp = a; // 빈값을 a로
			a = b; // b의 값을 a에 대입
			b = temp; // b를 빈 값으로
			
		}else if(c >= a && c >= b) {
			temp = a;
			a = c;
			c = temp;
			if(c >= b) { 
				temp = b; 
				b = c; 
				c = temp; 
			}
		}
		if(c >= b) { 
			temp = b; 
			b = c; 
			c = temp; 
		}
		System.out.println("결과 " + a + " >= " + b + " >= " + c);
	}

}
