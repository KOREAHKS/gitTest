import java.util.Arrays;

public class Arr {
	static void doSome(int a) {
		a = a + 10;
		System.out.println(a);
	}
	static void refDoSome(int[] inArr) { //int 타입의 배열을 받아서 값을 조작하는 메서드임
		System.out.println("refDoSome 의 배열값 1 : " + Arrays.toString(inArr));
		inArr[0] = 2000;
		System.out.println("refDoSome 의 배열값 2 : " + Arrays.toString(inArr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		System.out.println(a);
		doSome(a);
		System.out.println(a);
		
		int[] inArr = {1,2,3};
		System.out.println("메인의 배열 출력 1 " + Arrays.toString(inArr));
		refDoSome(inArr);
		System.out.println("메인의 배열 출력 2 " + Arrays.toString(inArr));
	}

}
