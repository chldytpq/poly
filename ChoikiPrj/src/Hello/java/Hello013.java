package Hello.java;
import java.util.Scanner;

public class Hello013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a;
		System.out.println("1~4���� �����Ͻÿ�");
		a = s.nextInt();
		switch(a) 
		{
		case 1:
			System.out.println(a+"�� �����ߴ�.");
			break;
		case 2:
			System.out.println(a+"�� �����ߴ�.");
			break;
		case 3:
			System.out.println(a+"�� �����ߴ�.");
			break;
		case 4:
			System.out.println(a+"�� �����ߴ�.");
			break;
			
			default:
				System.out.println("�̻��Ѱ� ������");
				break;
				
			}
		

	}

}
