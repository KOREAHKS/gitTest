/*
 * 배열의 Deep Copy 를 이해해 보자..
 * 이를 위해서 System API 를 이용할 예정임.
 * 
 */
import java.util.Arrays;

public class ArryEx3 {

	private static void callByRef(int[] arr) {
		System.out.println(Arrays.toString(arr));
		//값 변경
		arr[0] = 100000;
		System.out.println("ref() 에서 배열 변경 후 출력" + Arrays.toString(arr));
	}
	public static void main(String[] args) {
		
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
		//배열 넘겨주기
		
		int newArr[] = new int[arr.length];
		//System 클래스의 배열 복사 메서드를 호출합니다 (arrayCopy)
		System.arraycopy(arr, 0, newArr, 0, arr.length); // arr의 인덱스 0번째부터를 newArr에 인덱스 0번째부터 arr의 마지막까지 복사
		
		callByRef(newArr);
		System.out.println("넘겨진 후의 배열 값 : " + Arrays.toString(arr));
	}

}
