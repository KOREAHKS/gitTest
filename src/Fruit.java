
public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  사과 , 배 , 오렌지 가 각각 3,7,3 개씩 생산됩니다.(하루기준)
		 *  그럼 시간당 총 생산량이 어떻게 되는지 출력하세요.(ex>0.3455...)
		 *  조건, 반드시 변수를 최대한 사용하고, 각 항목에 맞는 타입으로 사용하세요.
		 *  반드시 한 번의 캐스팅 연산을 사용하고, 한 번의 리터럴을 사용하도록 하세요.
		 */
		
		int apple, pear, orange;
		apple = 3;
		pear = 7;
		orange = 3;
		int total = apple + pear + orange;
		
		float avg = (float)(total/24.0);
		System.out.println(avg);
		
		//때에 따라선 산술 연산을 정확하게 계산이 되게 하려면, 실수 타입을 사용하지 않는게 좋음
		
		int a =1;
		double pUnit = 0.1;
		int number = 7;
		
		double res = a - number * pUnit;
		System.out.println("결과 : " + res);
		
		int app2 = 1;
		int tPiece = a * 10;
		int num2 = 7;
		
		int result = tPiece - num2;
		
		System.out.println(result);
		System.out.println(result / 10.0);
		
	}

}
