
public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구구단 출력하세요.. ex>--- 2단 시작 --- ...... ---2단 끝 ----
		
		for (int i=2; i<=3; i++) {
			System.out.println("2단 시작");
			for (int a=1; a<10; a++) {
				System.out.println(i + " * " + a + " = " + i*a );
			}
		}	System.out.println("2단 끝");
		
		for (int i=3; i<=3; i++) {
			System.out.println("3단 시작");
			for (int a=11; a<20; a++) {
				System.out.println(i + " * " + a + " = " + i*a );
			}
		}	System.out.println("3단 끝");
		
		for (int i=1; i<=9; i++) {
			System.out.println("2" + " * " + i + " = " + i*2 );
		}
	}

}
