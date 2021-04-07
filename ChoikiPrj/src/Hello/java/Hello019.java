package Hello.java;

import java.util.Scanner;

public class Hello019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int a=0;
		int b=0;
		
		while (true) {
			System.out.println("첫번째 입력 값: ");
			a = s.nextInt();
			System.out.println("두번째 입력 값: ");
			b = s.nextInt();

			System.out.println("합계:" + (a + b));

			// 합계가 10보다 크면 나가기
			if ((a + b) > 10) {
				break;
			}

		}

	}
	

}
