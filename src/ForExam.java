
public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 ~ 20 사이의 랜덤값 2개를 생성해서 두 값 사이의 누적합을 구하는 for를 작성하세요.
		//단, 두 수는 반드시 오름으로 계산되어야 합니다. ex> 10, 1 나올 시 1~10 까지의 누적합을 구하란 말
		for(int i = 0; i<5; i++) {
			System.out.println(i);
		}
		int min = (int) (Math.random() * 20 +1); // 0 ~ 20 까지의 랜덤 숫자를 생성하여 min로 정의
		int max = (int) (Math.random() * 20 +1); // 0 ~ 20 까지의 랜덤 숫자를 생성하여 max로 정의
		
		System.out.println("-->" + min + "." + max);
		
		int a = Math.min(min, max); // min과 max 의 값중 작은 값을 a로 정의
		int b = Math.max(min, max); // min과 max 의 값중 큰 값을 b로 정의
		
		System.out.printf("발생된 수 1 %d, 2 %d",min,max);
	
		int sum = 0;  // sum을 초기화
		
		for(int i = a; i<=b; i++) {
			sum += i;
		}
		System.out.println(a + " ~ " + b + "누적합 : " + sum);
	
	}

}
