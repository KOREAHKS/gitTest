import java.util.Arrays;

public class ArryEx2 {

	public static void main(String[] args) {
		//점수를 담고 있는 배열을 동적 생성해서 printItem 에 전달하려고 함.
		//int[] arr = {1,2,3};
		//printItem(arr); 
		//위 문법처럼도 사용 가능
		printItem(new int[] {65,80,70});
		
		double[] dArr = new double[3];
		
		dArr[0] = 1;
		dArr[1] = 2;
		dArr[2] = 3;
		//dArr[dArr.length] = 4;  // 인덱스가 0부터 2까지 있기에 4는 없으므로 에러 뜸 / 문법은 맞기 때문에 실행 후 에러가 뜸
		
		for(double d : dArr) {
			System.out.println(d);
		}
	}
	private static void printItem(int[] scores) {	
		//전달된 배열의 총 합을 구하는 로직을 작성 후 출력하세요.
		//여기에 구현 하세요.
		int sum = 0;
		for(int y : scores) {
			sum += y;
		}
		System.out.println("총합 : " + sum);
	}

}
