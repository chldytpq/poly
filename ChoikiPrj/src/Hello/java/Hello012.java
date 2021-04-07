package Hello.java;
import java.util.Scanner;

public class Hello012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.println("점수를 입력하세요.");
		a = s.nextInt();
		
		if (a >= 90) {
			System.out.println("A");
			
		}else {
			if(a >= 80) {
				System.out.println("B");
				
			}else {
				if(a >= 70) {
					System.out.println("c");
				}
			}
		}

	}

}
